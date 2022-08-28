/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exemploexcecao;

/**
 *
 * @author Gelvazio Camargo
 */
public class Excecao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 0;
        try {
            i = 1/0;
        } catch(ArithmeticException erro) {
            erro.printStackTrace();
            System.out.println("Gerou Excecao Arithmetic!!!");
            i = 1;
        }catch(Exception erro){
            System.out.println("Gerou Excecao Exception!!");
        }finally{
            System.out.println("Valor i:"+i);
        }
    }

}
