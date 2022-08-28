/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exemplodois;

import exemplopessoa.Pessoa;

/**
 *
 * @author geo
 */
public class TestePessoadois {
    public static void main(String[] args) {

    Pessoa pessoa = new Pessoa();
    pessoa.alteraSexo('M');
    System.out.println(pessoa.retornaSexo());


}
}
