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
import modelo.Cidade;

/**
 *
 * @author Marciel
 */
public class CidadeDB {
    private static final String sqlTodos = "SELECT * FROM cidade ORDER BY nome";
    private static final String sqlExcluir = "DELETE FROM cidade WHERE cid_codigo = ?";
    private static final String sqlInserir = "INSERT INTO cidade(cid_codigo,nome,est_sigla) VALUES(?,?,?)";
    private static final String sqlUltimo = "SELECT MAX(cid_codigo) AS ultimo FROM cidade";
    private static final String sqlAlterar = "UPDATE cidade SET nome = ?, est_sigla = ? WHERE cid_codigo = ?";
    
    public boolean alterarCidade(Cidade cidade){
        boolean alterou = false;
        Connection conn = null;
        PreparedStatement pstmt = null;
        try{
            conn = Conexao.getConexao();
            pstmt = conn.prepareStatement(sqlAlterar);
            pstmt.setInt(3, cidade.getCid_codigo());
            pstmt.setString(1, cidade.getNome());
            pstmt.setString(2, cidade.getEst_sigla());
            pstmt.executeUpdate();
            alterou = true;
        }catch(SQLException erro){
            System.out.println("Erro de sql. alterarCidade():"+erro.getMessage());
        }finally{
            Conexao.closeAll(conn);
            return alterou;
        }
    }
    
    public boolean inserirCidade(Cidade cidade){
        boolean inseriu = false;
        Connection conn = null;
        PreparedStatement pstmt = null;
        try{
            conn = Conexao.getConexao();
            pstmt = conn.prepareStatement(sqlInserir);
            pstmt.setInt(1, cidade.getCid_codigo());
            pstmt.setString(2, cidade.getNome());
            pstmt.setString(3, cidade.getEst_sigla());
            pstmt.executeUpdate();
            inseriu = true;
        }catch(SQLException erro){
            System.out.println("Erro de sql. inserirCidade():"+erro.getMessage());
        }finally{
            Conexao.closeAll(conn);
            return inseriu;
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
    
    public boolean excluirCidade(int codigo){
        boolean excluiu = false;
        Connection conn = null;
        PreparedStatement pstmt = null;
        try{
            conn = Conexao.getConexao();
            pstmt = conn.prepareStatement(sqlExcluir);
            pstmt.setInt(1, codigo);
            pstmt.executeUpdate();
            excluiu = true;
        }catch(SQLException erro){
            System.out.println("Erro de sql. excluirCidade():"+erro.getMessage());
        }finally{
            Conexao.closeAll(conn);
            return excluiu;
        }        
    }
    
    public ArrayList getTodos(){
        ArrayList listaCidade = new ArrayList();        
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        try{
            conn = Conexao.getConexao();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sqlTodos);
            while(rs.next()){
                int auxCodigo = rs.getInt("cid_codigo");
                String auxNome = rs.getString("nome");
                String auxEst_sigla = rs.getString("est_sigla");
                Cidade cidade = new Cidade(auxCodigo,auxNome,auxEst_sigla);
                listaCidade.add(cidade);
            }
        }catch(SQLException erro){
            System.out.println("Erro de sql. getTodos():"+erro.getMessage());
        }finally{
            Conexao.closeAll(conn);
            return listaCidade;
        }
    }
}
