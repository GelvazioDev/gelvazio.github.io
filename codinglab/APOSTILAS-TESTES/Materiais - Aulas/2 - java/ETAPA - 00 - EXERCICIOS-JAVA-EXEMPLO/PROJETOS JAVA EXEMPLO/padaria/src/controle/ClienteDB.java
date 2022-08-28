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
import modelo.Cliente;
/**
 *
 * @author gelvazio
 */
public class ClienteDB {
    private static final String sqlTodos = "SELECT * FROM cliente order by cli_codigo";
    private static final String sqlInserir = "INSERT INTO cliente(INSERT INTO cliente (cli_codigo,nome,sexo,endereco,numero,bairro,cid_codigo,email,telefone,datanascimento,pai,mae) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
    private static final String sqlExcluir = "DELETE FROM cliente WHERE cli_codigo = ?";
    private static final String sqlAlterar = "UPDATE cliente SET nome = ? WHERE cli_codigo = ?";
    private static final String sqlCliente = "SELECT count(*) as total FROM cliente WHERE cli_codigo = ?";
    private static final String sqlConsulta = "SELECT *FROM cliente WHERE nome LIKE ?";
    private static final String sqlLocaliza = "SELECT * FROM cliente WHERE cli_codigo LIKE ?";
    
    public ArrayList getLocaliza(String texto){
        ArrayList<Cliente> listaCliente = new ArrayList();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try{
        conn = Conexao.getConexao();
        pstmt = conn.prepareStatement(sqlLocaliza);
        pstmt.setString(1, texto);
        rs = pstmt.executeQuery();
        while (rs.next()){
           int auxCli_Codigo = rs.getInt("cli_codigo");
            String auxNome =rs.getString("nome");
            String auxEmail = rs.getString("email");
            String auxPai = rs.getString("pai");
            String auxMae = rs.getString("mae");
            String auxBairro = rs.getString("bairro");
            int auxDataNascimento = rs.getInt("datanascimento");
            int auxEnd_numero = rs.getInt("numero");
            String auxEndereco = rs.getString("endereco");
            String auxSexo = rs.getString("sexo");
            int auxCid_Codigo = rs.getInt("cid_codigo");
            int auxTelefone = rs.getInt("telefone");
            Cliente cliente = new Cliente(auxCli_Codigo, auxNome,auxSexo, auxEndereco, auxEnd_numero, auxBairro, auxCid_Codigo, auxEmail, auxTelefone, auxDataNascimento, auxPai, auxMae);
            listaCliente.add(cliente);
        } 
   }catch(SQLException erro){
         System.out.println("Erro no sql,getLocaliza():"+erro.getMessage());
        }finally{
            Conexao.closeAll(conn);
          return listaCliente;
        }
    }
    public ArrayList getConsulta(String texto){
        ArrayList<Cliente> listaCliente = new ArrayList();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try{
            conn = Conexao.getConexao();
            pstmt = conn.prepareStatement(sqlConsulta);
            pstmt.setString(1, texto);
            rs = pstmt.executeQuery();
        while (rs.next()){
            int auxCli_Codigo = rs.getInt("cli_codigo");
            String auxNome =rs.getString("nome");
            String auxEmail = rs.getString("email");
            String auxPai = rs.getString("pai");
            String auxMae = rs.getString("mae");
            String auxBairro = rs.getString("bairro");
            int auxDataNascimento = rs.getInt("datanascimento");
            int auxEnd_numero = rs.getInt("numero");
            String auxEndereco = rs.getString("endereco");
            String auxSexo = rs.getString("sexo");
            int auxCid_Codigo = rs.getInt("cid_codigo");
            int auxTelefone = rs.getInt("telefone");
            Cliente cliente = new Cliente(auxCli_Codigo, auxNome,auxSexo, auxEndereco, auxEnd_numero, auxBairro, auxCid_Codigo, auxEmail, auxTelefone, auxDataNascimento, auxPai, auxMae);
            listaCliente.add(cliente);
        } 
   }catch(SQLException erro){
         System.out.println("Erro no sql, getConsulta():"+erro.getMessage());
        }finally{
            Conexao.closeAll(conn);
            return listaCliente;
        }
    }
    
    public DefaultComboBoxModel getComboCliente(){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{
            conn = Conexao.getConexao();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sqlTodos);
            while(rs.next()){
                modelo.addElement(rs.getString("cli_codigo"));
                modelo.addElement(rs.getString("nome"));
                modelo.addElement(rs.getString("telefone"));
                modelo.addElement(rs.getString("email"));
                modelo.addElement(rs.getString("pai"));
                modelo.addElement(rs.getString("mae"));
                modelo.addElement(rs.getString("bairro"));
                modelo.addElement(rs.getInt("numero"));
                modelo.addElement(rs.getString("endereco"));
                modelo.addElement(rs.getString("sexo"));
                modelo.addElement(rs.getInt("cid_codigo")); 
                modelo.addElement(rs.getInt("datanascimento")); 
            }
        }catch(SQLException erro){
            System.out.println("Erro no sql, getComboCliente():"+erro.getMessage());
        }finally{
            Conexao.closeAll(conn);
            return modelo;
        }
    }
    
    public boolean alterarCliente(Cliente cliente){
        boolean alterou = false;
        Connection conn = null;
        PreparedStatement pstmt = null;
        try{
            conn = Conexao.getConexao();
            pstmt = conn.prepareStatement(sqlAlterar);
            pstmt.setInt(1, cliente.getCli_codigo());
            pstmt.setString(2, cliente.getNome());
            pstmt.setString(3, cliente.getSexo());
            pstmt.setInt(4, cliente.getEnd_numero());
            pstmt.setString(5, cliente.getBairro());
            pstmt.setInt(6, cliente.getCid_codigo());
            pstmt.setString(7, cliente.getEmail());
            pstmt.setInt(8, cliente.getTelefone());
            pstmt.setInt(9, cliente.getDatanascimento());
            pstmt.setString(10, cliente.getPai());
            pstmt.setString(11, cliente.getMae());
            pstmt.setString(12, cliente.getEndereco());
            
            
            pstmt.executeUpdate();
            alterou = true;
        }catch(SQLException erro){
            System.out.println("Erro no sql. alterarCliente():"+erro.getMessage());
        }finally{
            Conexao.closeAll(conn);
            return alterou;
        }        
    }

    public boolean excluirCliente(int cli_codigo){
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
            System.out.println("Erro no sql. excluirCliente():"+erro.getMessage());
        }finally{
            Conexao.closeAll(conn);
            return excluiu;
        }
    }

    public boolean inserirCliente(Cliente cliente){
        boolean inseriu = false;
        Connection conn = null;
        PreparedStatement pstmt = null;
        try{
            conn = Conexao.getConexao();
            pstmt = conn.prepareStatement(sqlInserir);
            pstmt.setInt(1, cliente.getCli_codigo());
            pstmt.setString(2, cliente.getNome());
            pstmt.setString(3, cliente.getSexo());
            pstmt.setString(4, cliente.getEndereco());
            pstmt.setInt(5, cliente.getEnd_numero());
            pstmt.setString(6, cliente.getBairro());
            pstmt.setInt(7, cliente.getCid_codigo());
            pstmt.setString(8, cliente.getEmail());
            pstmt.setInt(9, cliente.getTelefone());
            pstmt.setInt(10, cliente.getDatanascimento());
            pstmt.setString(11, cliente.getPai());
            pstmt.setString(12, cliente.getMae());
            
            pstmt.executeUpdate();
            inseriu = true;
        }catch(SQLException erro){
            System.out.println("Erro no sql. inserirCliente():"+erro.getMessage());
        }finally{
            Conexao.closeAll(conn);
            return inseriu;
        }
    }

    public ArrayList getTodos(){
        ArrayList listaCliente = new ArrayList();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{
            conn = Conexao.getConexao();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sqlTodos);
            while(rs.next()){
                int cli_codigo = rs.getInt("cli_codigo");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                int telefone = rs.getInt("telefone");
                int datanascimento = rs.getInt("datanascimento");
                String sexo = rs.getString("sexo");
                String pai = rs.getString("pai");
                String mae = rs.getString("mae");
                int cid_codigo = rs.getInt("cid_codigo");
                String bairro = rs.getString("bairro");
                int numero = rs.getInt("numero");
                String endereco = rs.getString("endereco");
                
                
                Cliente cliente = new Cliente(cli_codigo, nome, sexo, endereco, numero, bairro, cid_codigo, email, telefone, datanascimento,pai, mae);
                listaCliente.add(cliente);
            }
        }catch(SQLException erro){
            System.out.println("Erro no sql, getTodos():"+erro.getMessage());
        }finally{
            Conexao.closeAll(conn);
            return listaCliente;
        }        
    }    
    
    public boolean getCliente(int cli_codigo){
        boolean existe = false;
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;        
        try{
           conn = Conexao.getConexao();
           pstmt = conn.prepareStatement(sqlCliente);
           pstmt.setInt(1, cli_codigo);
           rs = pstmt.executeQuery();
           while (rs.next()){
               if (rs.getInt("total")>0){
                   existe = true;
               }else{
                   existe = false;
               }             
           }
        }catch(SQLException e){
            System.out.println("Erro de SQL. getCliente():"+e.getMessage());
        }finally{
            Conexao.closeAll(conn);
            return existe;
        }                
    }        
    
}

    
