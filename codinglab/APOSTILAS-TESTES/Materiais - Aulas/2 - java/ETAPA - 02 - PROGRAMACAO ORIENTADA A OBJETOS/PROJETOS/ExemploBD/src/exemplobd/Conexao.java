/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exemplobd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Gelvazio Camargo
 */
public class Conexao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String driver = "com.mysql.jdbc.Driver";//Classe do Driver
        String banco = "exemplobanco";//Nome do Banco de Dados
        String host = "localhost"; //Máquina onde está o banco de dados
        //URL de Conexão abaixo
        String stringConexao = "jdbc:mysql://"+host+":3306/"+banco;
        String usuario = "root";
        String senha = "";

        try{
            Class.forName(driver);
            //obtem conexão com o banco
            Connection conn = DriverManager.getConnection(stringConexao,usuario,senha);
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM pessoa";
            //mandamos o sql para o banco um resultSet
            ResultSet rs = stmt.executeQuery(sql);
            //Percorrendo o ResultSet e mostrando os registros na tela
            while (rs.next()){
                System.out.println("Código: "+rs.getInt("codigo"));
                System.out.println("Nome: "+rs.getString("nome"));
                System.out.println("Idade: "+rs.getInt("idade"));
                System.out.println("E-mail: "+rs.getString("e-mail"));
                System.out.println("=============================");
            }
        }
        catch (ClassNotFoundException erro){
            System.out.println("Erro de driver!!!");
            erro.printStackTrace();
        }catch (SQLException erro){
            System.out.println("Erro de MySql!!!");
            erro.printStackTrace();
        }
    }

}

