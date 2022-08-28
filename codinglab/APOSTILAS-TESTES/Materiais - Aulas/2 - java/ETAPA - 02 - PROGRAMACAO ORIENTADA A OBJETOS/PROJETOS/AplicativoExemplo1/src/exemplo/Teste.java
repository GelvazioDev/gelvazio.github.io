/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exemplo;
/**
 *
 * @author geo
 */
public class Teste {
    public static void main(String[] args) {
        //Scanner entrada = new Scanner(System.in);
        int inteiro;
        inteiro = 1;
        double double1;
        double1 = 15.5d;
        
        String str1 = "Gelvazio Camargo";

        System.out.println("Váriavel de inteiro:"+inteiro);
        System.out.println("Váriavel double:"+double1);
        System.out.println("Váriavel String:"+str1);

        Pessoa pessoa1 = new Pessoa();

        System.out.println("Idade Pessoa:" +pessoa1.retornaIdade());

        pessoa1.alteraIdade(30);

        System.out.println("Idade alterada da Pessoa:" +pessoa1.retornaIdade());

        Pessoa pessoa2 = new Pessoa();

        System.out.println("Sexo da Pessoa:" +pessoa2.retornaSexo());

        pessoa2.alteraSexo('M');

        System.out.println("Sexo alterado da Pessoa2:" +pessoa2.retornaSexo());


    }
}
