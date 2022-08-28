
public class Cachorro extends Animal {

	public Cachorro()
	{
		super("Animal Cachorro");
	}
	
	@Override
	public void nomeAnimal(String nome)
	{
		System.out.println("Cachorro:");
	}
	
	@Override
	public void som(String EmitirSom)
	{
		System.out.println("Au Au Au \n");
	}
}
