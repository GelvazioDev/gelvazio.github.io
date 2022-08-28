/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exemplopessoa;

/**
 *
 * @author geo
 */
public class TestePessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();


        System.out.println(pessoa.codigo);
        System.out.println(pessoa.nome);
        System.out.println(pessoa.retornaSexo());

         pessoa.codigo = 12;
         pessoa.nome = "Gelvazio";
         pessoa.alteraSexo('M');


         System.out.println(pessoa.codigo);
         System.out.println(pessoa.nome);
         System.out.println(pessoa.retornaSexo());

         Pessoa pessoa2 = new Pessoa();
       
         pessoa2.codigo = 20;
         pessoa2.nome = "Fabiano";
         pessoa2.alteraSexo('M');
     }
}