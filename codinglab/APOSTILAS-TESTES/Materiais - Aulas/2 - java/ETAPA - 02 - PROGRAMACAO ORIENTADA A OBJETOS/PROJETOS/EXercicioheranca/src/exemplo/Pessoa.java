/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exemplo;

/**
 *
 * @author Gelvazio Camargo
 */
public class Pessoa {
protected String nome;
protected String cpf;
protected int idade;
Pessoa (String nome,String cpf,int idade){
    this.nome = nome;
    this.cpf = cpf;
    this.idade = idade;

}
public String getCpf() {
return cpf;
}
public void setCpf(String cpf) {
this.cpf = cpf;
}
public int getIdade() {
return idade;
}

public void setIdade(int idade) {
this.idade = idade;
}
public String getNome() {
return nome;
}
public void setNome(String nome) {
this.nome = nome;
}
public void imprime(){
System.out.println("Nome: "+this.nome);
System.out.println("CPF: "+this.cpf);
System.out.println("Idade: "+this.idade);
}
}

