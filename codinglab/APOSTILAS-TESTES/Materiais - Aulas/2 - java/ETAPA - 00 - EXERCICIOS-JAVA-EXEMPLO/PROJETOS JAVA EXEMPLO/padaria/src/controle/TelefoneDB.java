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
import modelo.Telefone;

/**
 *
 * @author gelvazio
 */
public class TelefoneDB {
    
    private static final String sqlTodos = "SELECT * FROM telefone order by cli_codigo";
    private static final String sqlInserir = "INSERT INTO telefone (tel_sequencia,cli_codigo,numero,tipo) VALUES(?,?,?,?)";
    private static final String sqlExcluir = "DELETE FROM telefone WHERE cli_codigo = ?";
    private static final String sqlAlterar = "UPDATE telefone SET numero = ? WHERE cli_codigo = ?";
    private static final String sqlTelefone = "SELECT count(*) as total FROM telefone WHERE cli_codigo = ?";
    private static final String sqlConsulta = "SELECT *FROM telefone WHERE cli_codigo LIKE ?";
    private static final String sqlLocaliza = "SELECT nome,numero FROM cliente ,telefone order by nome";
    private static final String sqlUltimo = "SELECT MAX(cli_codigo) AS ultimo FROM cliente";
   
    
     public ArrayList getLocaliza(String texto){
        ArrayList<Telefone> listaTelefone = new ArrayList();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try{
        conn = Conexao.getConexao();
        pstmt = conn.prepareStatement(sqlLocaliza);
        pstmt.setString(1, texto);
        rs = pstmt.executeQuery();
        while (rs.next()){
            int auxCodigo =rs.getInt("tel_sequencia");
            int auxCliCodigo =rs.getInt("cli_codigo");
            int auxNumero =rs.getInt("numero");
            String auxCliNome = rs.getString("nome");
            String auxTipo =rs.getString("tipo");
            
            Telefone telefone = new Telefone(auxCodigo,auxCliCodigo,auxNumero, auxCliNome ,auxTipo);
            listaTelefone.add(telefone);
        } 
   }catch(SQLException erro){
         System.out.println("Erro no sql,getLocaliza():"+erro.getMessage());
        }finally{
            Conexao.closeAll(conn);
          return listaTelefone;
        }
    }
     
     public int getUltimo(){
        int ultimo = 0;
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{
            conn = Conexao.getConexao();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sqlUltimo);
            while(rs.next()){
                ultimo = rs.getInt("ultimo");
            }
        }catch(SQLException erro){
            System.out.println("Erro de sql. getUltimo():"+erro.getMessage());
        }finally{
            Conexao.closeAll(conn);
            return ultimo;
        }
        
    }      
    public ArrayList getConsulta(String texto){
        ArrayList<Telefone> listaTelefone = new ArrayList();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try{
        conn = Conexao.getConexao();
        pstmt = conn.prepareStatement(sqlConsulta);
        pstmt.setString(1, texto);
        rs = pstmt.executeQuery();
        while (rs.next()){
          int auxCodigo =rs.getInt("tel_sequencia");
            int auxCliCodigo =rs.getInt("cli_codigo");
            int auxNumero =rs.getInt("numero");
            String auxCliNome = rs.getString("nome");
            String auxTipo =rs.getString("tipo");
            
            Telefone telefone = new Telefone(auxCodigo,auxCliCodigo,auxNumero, auxCliNome ,auxTipo);
            listaTelefone.add(telefone);
        }
   }catch(SQLException erro){
         System.out.println("Erro no sql, getConsulta():"+erro.getMessage());
        }finally{
            Conexao.closeAll(conn);
          return listaTelefone;
        }
    }
    
    public DefaultComboBoxModel getComboTelefone(){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{
            conn = Conexao.getConexao();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sqlTodos);
            while(rs.next()){
                modelo.addElement(rs.getString("tel_sequencia"));
            }
        }catch(SQLException erro){
            System.out.println("Erro no sql, getComboTelefone():"+erro.getMessage());
        }finally{
            Conexao.closeAll(conn);
            return modelo;
        }
    }
    
    public boolean alterarTelefone(Telefone telefone){
        boolean alterou = false;
        Connection conn = null;
        PreparedStatement pstmt = null;
        try{
            conn = Conexao.getConexao();
            pstmt = conn.prepareStatement(sqlAlterar);
            pstmt.setInt(1,telefone.getTel_sequencia());
            pstmt.setInt(2, telefone.getCli_codigo());
            pstmt.setInt(3, telefone.getNumero());
            pstmt.setString(4, telefone.getTipo());
            pstmt.executeUpdate();
            alterou = true;
        }catch(SQLException erro){
            System.out.println("Erro no sql. alterarTelefone():"+erro.getMessage());
        }finally{
            Conexao.closeAll(conn);
            return alterou;
        }        
    }

    public boolean excluirTelefone(int cli_codigo){
        boolean excluiu = false;
        Connection conn = null;
        PreparedStatement pstmt = null;
        try{
            conn = Conexao.getConexao();
            pstmt = conn.prepareStatement(sqlExcluir);
            pstmt.setInt(1,cli_codigo);
            pstmt.executeUpdate();
            excluiu = true;
        }catch(SQLException erro){
            System.out.println("Erro no sql. excluirTelefone():"+erro.getMessage());
        }finally{
            Conexao.closeAll(conn);
            return excluiu;
        }
    }

    public boolean inserirTelefone(Telefone telefone){
        boolean inseriu = false;
        Connection conn = null;
        PreparedStatement pstmt = null;
        try{
            conn = Conexao.getConexao();
            pstmt = conn.prepareStatement(sqlInserir);
            pstmt.setInt(1,telefone.getTel_sequencia());
            pstmt.setInt(2, telefone.getCli_codigo());
            pstmt.setInt(3, telefone.getNumero());
            pstmt.setString(4, telefone.getTipo());
            pstmt.executeUpdate();
            inseriu = true;
            
        }catch(SQLException erro){
            System.out.println("Erro no sql. inserirTelefone():"+erro.getMessage());
        }finally{
            Conexao.closeAll(conn);
            return inseriu;
        }
    }

    public ArrayList getTodos(){
        ArrayList listaTelefone = new ArrayList();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{
            conn = Conexao.getConexao();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sqlTodos);
            while(rs.next()){
            int auxCodigo =rs.getInt("tel_sequencia");
            int auxCliCodigo =rs.getInt("cli_codigo");
            int auxNumero =rs.getInt("numero");
            String auxCliNome = rs.getString("nome");
            String auxTipo =rs.getString("tipo");
            
            Telefone telefone = new Telefone(auxCodigo,auxCliCodigo,auxNumero, auxCliNome ,auxTipo);
            listaTelefone.add(telefone);
        }
        }catch(SQLException erro){
            System.out.println("Erro no sql, getTodos():"+erro.getMessage());
        }finally{
            Conexao.closeAll(conn);
            return listaTelefone;
        }        
    }    
    
    public boolean getTelefone(int tel_sequencia){
        boolean existe = false;
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;        
        try{
           conn = Conexao.getConexao();
           pstmt = conn.prepareStatement(sqlTelefone);
           pstmt.setInt(1,tel_sequencia);
           rs = pstmt.executeQuery();
           while (rs.next()){
               if (rs.getInt("total")>0){
                   existe = true;
               }else{
                   existe = false;
               }             
           }
        }catch(SQLException e){
            System.out.println("Erro de SQL. getTelefone():"+e.getMessage());
        }finally{
            Conexao.closeAll(conn);
            return existe;
        }                
    }

    public void setModel(DefaultComboBoxModel comboTelefone) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

}
    

    

