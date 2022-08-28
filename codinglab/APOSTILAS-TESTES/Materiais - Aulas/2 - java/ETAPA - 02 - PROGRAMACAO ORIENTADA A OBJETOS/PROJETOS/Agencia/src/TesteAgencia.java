/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author geo
 */
public class TesteAgencia {
    public static void main(String[] args) {
        Agencia agencia = new Agencia();

        agencia.banco= '1';
        agencia.numero= "234";


        System.out.println("-----------------------------------");
        System.out.print("Agencia: "+agencia.banco );
        System.out.println("Banco: "+agencia.numero);
        System.out.println("-----------------------------------");
    }

}
