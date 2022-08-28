/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exemplo;

/**
 *
 * @author Gelvazio Camargo
 */
public class Empresa {
    String nome;
    Funcionario[] funcionarios;

    Empresa(String nome,Funcionario[] funcionarios){
        this.nome = nome;
        this.funcionarios = funcionarios;
    }

    public void ImprimeDados(){
        System.out.println("Empresa: "+this.nome);
        System.out.println("--------Funcionarios--------");
            for(int i =0; i< funcionarios.length;i++)

    }

}
