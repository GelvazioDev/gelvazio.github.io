package ExercicioHerança;

public class Animal {

	public String nome;
	public String idade;
	public String emitirSom;
	public String correr;
	
	public Animal(String nom, String ida, String emSom, String correr)
	{
		super();
		this.nome = nom;
		this.idade = ida;
		this.emitirSom = emSom;
		this.correr = correr;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getEmitirSom() {
		return emitirSom;
	}

	public void setEmitirSom(String emitirSom) {
		this.emitirSom = emitirSom;
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	

	
}
