//1) Crie uma classe cliente e apresente os atributos e métodos referentes
//esta classe, em seguida crie um objeto cliente, defina as instancias 
//deste objeto e apresente as informações deste objeto no console.

package ExercicioPPO;

import java.text.NumberFormat;

public class Cliente {

	//criação dos atributos da classe
	
	private String nome;
	private String endereco;
	private int telefone;
	private int cpf;
	
	// criação do método construtor
	
	public Cliente(String nom ,String end, int tel, int cpf)
	{
		this.nome = nom;
		this.endereco = end;
		this.telefone = tel;
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public int getTelefone() {
		return telefone;
	}


	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}


	public int getCpf() {
		return cpf;
	}


	public void setCpf(int cpf) {
		this.cpf = cpf;
	}


	public void imprimirInfo()
	{
		System.out.println("\t\t ::: Informações Pessoais ::: \n\n"
		 +"Cliente: " +nome	+ "\nEndereço: "+endereco
		 +"\nTelefone: " + telefone + "\nCPF: "+cpf);
	}
}
