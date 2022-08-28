/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exemplo2;

import pacotecondicao.Carro;

/**
 *
 * @author aluno
 */
public class testecarro2 {
    public static void main(String[] args) {
        Carro carro = new Carro();

       
       carro.inicializaDados("Preto", 2011, "Ferrari", "Ferrari Enzo");
       carro.imprime();

       carro.alteraCor("vermelho");
       carro.imprime();







    }

}
