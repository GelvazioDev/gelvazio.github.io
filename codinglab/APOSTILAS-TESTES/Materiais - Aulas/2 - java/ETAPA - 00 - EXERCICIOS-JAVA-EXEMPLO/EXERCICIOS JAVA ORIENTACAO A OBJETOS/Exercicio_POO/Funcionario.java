//4) Crie uma classe funcionário e apresente os atributos e métodos referentes 
//esta classe, em seguida crie um objeto funcionário, defina as 
//instancias deste objeto e apresente as informações deste objeto no console.

package ExercicioPPO;

import java.text.NumberFormat;

public class Funcionario {

	private String nome;
	private String cargo;
	private int idade;
	private double salario;
	
	public Funcionario(String nom, String carg, int id, double sal)
	{
		this.nome = nom;
		this.cargo = carg;
		this.idade = id;
		this.salario = sal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance(); //define a moeda padrão do pais
		nf.setMinimumFractionDigits(2);//define a quantidade de casas depois da vírgula
		String formatoMoeda = nf.format(salario);//formata a saída do salário
		return formatoMoeda;
	}
	
	public void imprimirInfo() {
		
		System.out.println(
		"Nome: " + nome + "\nCargo: " + cargo + "\nIdade: " + idade + " anos" +
		"\nSalário: " + this.formatarMoeda() +"\n\n"+
		"***********************************************");
	}
	
	
}
