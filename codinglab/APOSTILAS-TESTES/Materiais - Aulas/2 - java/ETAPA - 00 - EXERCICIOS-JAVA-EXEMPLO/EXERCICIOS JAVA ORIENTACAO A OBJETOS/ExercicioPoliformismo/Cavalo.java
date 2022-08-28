
public class Cavalo extends Animal{

	public Cavalo()
	{
		super("Animal Cavalo");
	}
	
	@Override
	public void nomeAnimal(String nome)
	{
		System.out.println("Cavalo:");
	}
	
	@Override
	public void som(String EmitirSom)
	{
		System.out.println("iiirrrrí, rilinchin \n");
	}
	
}
