/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author geo
 */
public class Cliente {
    int cpf;
    String nome;


    void inicializaCliente(String nomeCliente,int cpfCliente){
        nome = nomeCliente;
        cpf = cpfCliente;
    }
       void imprimeDados(){
        System.out.println("-----------------------------------");
        System.out.println("Nome do Cliente: "+nome+"\t CPF:"+cpf);
        System.out.println("-----------------------------------");
       }

}
