/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exemploproduto;

/**
 *
 * @author aluno
 */
public class testaProduto {
    public static void main(String[] args) {
        produto meuproduto = new produto();

    meuproduto.inicializaDados(53535, "Carro", "Ford",405555.0);
    meuproduto.imprime();

    meuproduto.alteraPreco(0.0,0.0);
    meuproduto.imprime();

    meuproduto.alteraPreco(4500.0,10);
    meuproduto.imprime();

    meuproduto.alteraPreco(40000.0,10);
    meuproduto.imprime();
}
}
