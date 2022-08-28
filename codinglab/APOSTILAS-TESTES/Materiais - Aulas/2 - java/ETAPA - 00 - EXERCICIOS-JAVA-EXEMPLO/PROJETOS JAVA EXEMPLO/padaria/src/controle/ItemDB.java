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
import modelo.Item;

/**
 *
 * @author gelvazio
 */
public class ItemDB {  
    private static final String sqlTodos = "SELECT * FROM item order by pro_codigo";
    private static final String sqlInserir = "INSERT INTO item (pro_codigo,ven_numero,quantidade) VALUES(?,?,?)";
    private static final String sqlExcluir = "DELETE FROM item WHERE pro_codigo = ?";
    private static final String sqlAlterar = "UPDATE item SET quantidade = ? WHERE pro_codigo = ?";
    private static final String sqlItem = "SELECT count(*) as total FROM item WHERE pro_codigo = ?";
    private static final String sqlConsulta = "SELECT *FROM item WHERE pro_codigo LIKE ?";
    private static final String sqlLocaliza = "SELECT * FROM item WHERE pro_codigo LIKE ?";
    private static final String sqlUltimo = "SELECT MAX(pro_codigo) AS ultimo FROM produto";
   
    
     public ArrayList getLocaliza(String texto){
        ArrayList<Item> listaItem = new ArrayList();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try{
        conn = Conexao.getConexao();
        pstmt = conn.prepareStatement(sqlLocaliza);
        pstmt.setString(1, texto);
        rs = pstmt.executeQuery();
        while (rs.next()){
            int auxCodigo =rs.getInt("pro_codigo");
            int auxNumeroVenda = rs.getInt("ven_numero");
            int auxQuantidade =rs.getInt("quantidade");
            
            Item item = new Item(auxCodigo, auxNumeroVenda, auxQuantidade);
            listaItem.add(item);
        } 
   }catch(SQLException erro){
         System.out.println("Erro no sql,getLocaliza():"+erro.getMessage());
        }finally{
            Conexao.closeAll(conn);
          return listaItem;
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
        ArrayList<Item> listaItem = new ArrayList();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try{
        conn = Conexao.getConexao();
        pstmt = conn.prepareStatement(sqlConsulta);
        pstmt.setString(1, texto);
        rs = pstmt.executeQuery();
        while (rs.next()){
            int auxCodigo =rs.getInt("pro_codigo");
            int auxNumeroVenda = rs.getInt("ven_numero");
            int auxQuantidade =rs.getInt("quantidade");
            
            Item item = new Item(auxCodigo, auxNumeroVenda, auxQuantidade);
            listaItem.add(item);
        } 
   }catch(SQLException erro){
         System.out.println("Erro no sql, getConsulta():"+erro.getMessage());
        }finally{
            Conexao.closeAll(conn);
          return listaItem;
        }
    }
    
    public DefaultComboBoxModel getComboItem(){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{
            conn = Conexao.getConexao();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sqlTodos);
            while(rs.next()){
                modelo.addElement(rs.getString("pro_codigo"));
            }
        }catch(SQLException erro){
            System.out.println("Erro no sql, getComboItem():"+erro.getMessage());
        }finally{
            Conexao.closeAll(conn);
            return modelo;
        }
    }
    
    public boolean alterarItem(Item item){
        boolean alterou = false;
        Connection conn = null;
        PreparedStatement pstmt = null;
        try{
            conn = Conexao.getConexao();
            pstmt = conn.prepareStatement(sqlAlterar);
            pstmt.setInt(1,item.getCodigoProduto());
            pstmt.setInt(2, item.getNumeroVenda());
            pstmt.setInt(3, item.getQuantidade());
            pstmt.executeUpdate();
            alterou = true;
        }catch(SQLException erro){
            System.out.println("Erro no sql. alterarItem():"+erro.getMessage());
        }finally{
            Conexao.closeAll(conn);
            return alterou;
        }        
    }

    public boolean excluirItem(int pro_codigo){
        boolean excluiu = false;
        Connection conn = null;
        PreparedStatement pstmt = null;
        try{
            conn = Conexao.getConexao();
            pstmt = conn.prepareStatement(sqlExcluir);
            pstmt.setInt(1,pro_codigo);
            pstmt.executeUpdate();
            excluiu = true;
        }catch(SQLException erro){
            System.out.println("Erro no sql. excluirItem():"+erro.getMessage());
        }finally{
            Conexao.closeAll(conn);
            return excluiu;
        }
    }

    public boolean inserirItem(Item item){
        boolean inseriu = false;
        Connection conn = null;
        PreparedStatement pstmt = null;
        try{
            conn = Conexao.getConexao();
            pstmt = conn.prepareStatement(sqlInserir);
            pstmt.setInt(1, item.getCodigoProduto());
            pstmt.setInt(2, item.getNumeroVenda());
            pstmt.setInt(3, item.getQuantidade());
            pstmt.executeUpdate();
            inseriu = true;
            
        }catch(SQLException erro){
            System.out.println("Erro no sql. inserirItem():"+erro.getMessage());
        }finally{
            Conexao.closeAll(conn);
            return inseriu;
        }
    }

    public ArrayList getTodos(){
        ArrayList listaItem = new ArrayList();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{
            conn = Conexao.getConexao();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sqlTodos);
            while(rs.next()){
                int pro_codigo = rs.getInt("pro_codigo");
                int ven_numero = rs.getInt("ven_numero");
                int quantidade = rs.getInt("quantidade");
                
                Item item = new Item(pro_codigo,ven_numero,quantidade);
                listaItem.add(item);
            }
        }catch(SQLException erro){
            System.out.println("Erro no sql, getTodos():"+erro.getMessage());
        }finally{
            Conexao.closeAll(conn);
            return listaItem;
        }        
    }    
    
    public boolean getItem(int pro_codigo){
        boolean existe = false;
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;        
        try{
           conn = Conexao.getConexao();
           pstmt = conn.prepareStatement(sqlItem);
           pstmt.setInt(1,pro_codigo);
           rs = pstmt.executeQuery();
           while (rs.next()){
               if (rs.getInt("total")>0){
                   existe = true;
               }else{
                   existe = false;
               }             
           }
        }catch(SQLException e){
            System.out.println("Erro de SQL. getItem():"+e.getMessage());
        }finally{
            Conexao.closeAll(conn);
            return existe;
        }                
    }

    public void setModel(DefaultComboBoxModel comboItem) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
}

    
