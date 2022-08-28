
package view;

import controle.Conexao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Marciel
 */
public class TesteConexao {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try{
            conn = Conexao.getConexao();
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM estado");
            while(rs.next()){
                System.out.println("Sigla: "+rs.getString("ds_estado"));
            }
        }catch(SQLException erro){
            System.out.println("Erro de conexão! "+erro);
        }finally{
            Conexao.closeAll(conn);
        }
    }
}
