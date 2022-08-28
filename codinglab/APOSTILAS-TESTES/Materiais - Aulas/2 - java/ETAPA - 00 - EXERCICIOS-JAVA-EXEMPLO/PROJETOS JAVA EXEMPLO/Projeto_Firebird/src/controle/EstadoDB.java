/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import modelo.Estado;

/**
 *
 * @author Marciel
 */
public class EstadoDB {
    private static final String sqlTodos = "SELECT * FROM estado order by est_sigla";
    private static final String sqlInserir = "INSERT INTO estado(est_sigla,nome) VALUES(?,?)";
    private static final String sqlExcluir = "DELETE FROM estado WHERE est_sigla = ?";
    private static final String sqlAlterar = "UPDATE estado SET nome = ? WHERE est_sigla = ?";
    private static final String sqlEstado = "SELECT count(*) as total FROM estado WHERE est_sigla = ?";
    private static final String sqlConsulta = "SELECT *FROM estado WHERE nome LIKE ?";
    
    public ArrayList getConsulta(String texto){
        ArrayList<Estado> listaEstado = new ArrayList();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try{
        conn = Conexao.getConexao();
        pstmt = conn.prepareStatement(sqlConsulta);
        pstmt.setString(1, texto);
        rs = pstmt.executeQuery();
        while (rs.next()){
            String auxSigla = rs.getString("est_sigla");
            String auxNome =rs.getString("nome");
            Estado estado = new Estado(auxSigla, auxNome);
            listaEstado.add(estado);
        } 
   }catch(SQLException erro){
         System.out.println("Erro no sql, getConsulta():"+erro.getMessage());
        }finally{
            Conexao.closeAll(conn);
            return listaEstado;
        }
    }
    
    public DefaultComboBoxModel getComboEstado(){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{
            conn = Conexao.getConexao();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sqlTodos);
            while(rs.next()){
                modelo.addElement(rs.getString("est_sigla"));
            }
        }catch(SQLException erro){
            System.out.println("Erro no sql, getComboEstado():"+erro.getMessage());
        }finally{
            Conexao.closeAll(conn);
            return modelo;
        }
    }
    
    public boolean alterarEstado(Estado estado){
        boolean alterou = false;
        Connection conn = null;
        PreparedStatement pstmt = null;
        try{
            conn = Conexao.getConexao();
            pstmt = conn.prepareStatement(sqlAlterar);
            pstmt.setString(1, estado.getNome());
            pstmt.setString(2, estado.getEst_sigla());
            pstmt.executeUpdate();
            alterou = true;
        }catch(SQLException erro){
            System.out.println("Erro no sql. alterarEstado():"+erro.getMessage());
        }finally{
            Conexao.closeAll(conn);
            return alterou;
        }        
    }

    public boolean excluirEstado(String est_sigla){
        boolean excluiu = false;
        Connection conn = null;
        PreparedStatement pstmt = null;
        try{
            conn = Conexao.getConexao();
            pstmt = conn.prepareStatement(sqlExcluir);
            pstmt.setString(1,est_sigla);
            pstmt.executeUpdate();
            excluiu = true;
        }catch(SQLException erro){
            System.out.println("Erro no sql. excluirEstado():"+erro.getMessage());
        }finally{
            Conexao.closeAll(conn);
            return excluiu;
        }
    }

    public boolean inserirEstado(Estado estado){
        boolean inseriu = false;
        Connection conn = null;
        PreparedStatement pstmt = null;
        try{
            conn = Conexao.getConexao();
            pstmt = conn.prepareStatement(sqlInserir);
            pstmt.setString(1, estado.getEst_sigla());
            pstmt.setString(2, estado.getNome());
            pstmt.executeUpdate();
            inseriu = true;
        }catch(SQLException erro){
            System.out.println("Erro no sql. inserirEstado():"+erro.getMessage());
        }finally{
            Conexao.closeAll(conn);
            return inseriu;
        }
    }

    public ArrayList getTodos(){
        ArrayList listaEstado = new ArrayList();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{
            conn = Conexao.getConexao();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sqlTodos);
            while(rs.next()){
                String est_sigla = rs.getString("est_sigla");
                String nome = rs.getString("nome");
                
                Estado estado = new Estado(est_sigla,nome);
                listaEstado.add(estado);
            }
        }catch(SQLException erro){
            System.out.println("Erro no sql, getTodos():"+erro.getMessage());
        }finally{
            Conexao.closeAll(conn);
            return listaEstado;
        }        
    }    
    
    public boolean getEstado(String est_sigla){
        boolean existe = false;
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;        
        try{
           conn = Conexao.getConexao();
           pstmt = conn.prepareStatement(sqlEstado);
           pstmt.setString(1, est_sigla);
           rs = pstmt.executeQuery();
           while (rs.next()){
               if (rs.getInt("total")>0){
                   existe = true;
               }else{
                   existe = false;
               }             
           }
        }catch(SQLException e){
            System.out.println("Erro de SQL. getEstado():"+e.getMessage());
        }finally{
            Conexao.closeAll(conn);
            return existe;
        }                
    }        
    
}
