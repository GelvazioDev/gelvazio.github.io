package ExercicioHerança;

public class Preguica extends Animal {
	
	public String subirArvore; 

	public Preguica(String nom, String ida, String emSom, String subArv)
	{
		super(nom, ida, emSom, subArv);
		this.subirArvore = subArv;
	}

	public String getSubirArvore() {
		return subirArvore;
	}

	public void setSubirArvore(String subirArvore) {
		this.subirArvore = subirArvore;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do Animal: " + getNome() + 
				"\nIdade do Animal: " + getIdade() + 
				"\nSom emitido: " + getEmitirSom()
				+ "\nSubir em Árvore? " + subirArvore);
	}
	
}
