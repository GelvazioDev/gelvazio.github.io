/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exemplopessoa;

/**
 *
 * @author geo
 */
public class Pessoa {
    int codigo;
    String nome;
    private char sexo;

    public void alteraSexo(char valor){
        sexo = valor;
    }
    public char retornaSexo(){
        return sexo;
    }
}


