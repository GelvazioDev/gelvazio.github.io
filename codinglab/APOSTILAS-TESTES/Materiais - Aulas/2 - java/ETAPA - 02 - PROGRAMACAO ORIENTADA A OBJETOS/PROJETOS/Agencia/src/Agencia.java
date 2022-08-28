/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author geo
 */
public class Agencia {
    String numero;
    int banco;



    void inicializaAgencia(String numeroAgencia,int bancoAgencia){
        numero = numeroAgencia;
        banco = bancoAgencia;
    }
    void imprimeDados(){
        System.out.println("-----------------------------------");
        System.out.println("Agencia: "+numero+"\t Banco:"+banco);
        System.out.println("-----------------------------------");
    }

}
