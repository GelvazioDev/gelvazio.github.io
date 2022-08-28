/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Marciel
 */
public class Conexao {
    private static String driver = "org.firebirdsql.jdbc.FBDriver"; //Classe do driver
    private static String banco = "D:/Sisfatura/Bancos/sisfatura.FDB"; //Nome da base de dados
    private static String host = "localhost"; //Servidor da base de dados
    private static String str_conn = "jdbc:firebirdsql://"+host+":3050/"+banco; //URL de conexão
    private static String usuario = "SYSDBA"; //Usuário da base
    private static String senha = "masterkey"; //Senha da base
    public static Connection getConexao() {  
     
        Connection conn = null;
        try{
            Class.forName(driver);
            conn = DriverManager.getConnection(str_conn,usuario,senha);
        }catch (ClassNotFoundException erro){
            System.out.println("Erro de driver! "+erro.getMessage());
        }catch (SQLException erro){
            System.out.println("Erro de Conexão! "+erro.getMessage());
        }
        return conn;
    }

    public static void closeAll(Connection conn){
        try{
            if (conn != null){
                conn.close();
            }
        }catch(Exception erro){
            System.out.println("Erro ao fechar conexão! "+erro.getMessage());
        }
    }
    
}
