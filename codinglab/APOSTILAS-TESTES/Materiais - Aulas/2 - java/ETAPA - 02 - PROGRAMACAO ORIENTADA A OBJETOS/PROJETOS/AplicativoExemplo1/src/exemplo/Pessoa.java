/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exemplo;

/**
 *
 * @author geo
 */
public class Pessoa {
    String nome;
    int idade;
    String cpf;
    char sexo;

    public int retornaIdade(){
        return idade;
    }
    
    public void alteraIdade(int valor){
        idade = valor;
    }

    public char retornaSexo(){
        return sexo;
    }

    public void alteraSexo(char valor){
        sexo = valor;
    }

}
