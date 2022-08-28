package ExercicioHerança;

public class AnimalTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cachorro Ryu = new Cachorro("Ryu", "9", "Latido / Uivo", "Sim");
		Cavalo Ken = new Cavalo("Ken", "20", "Relincho / Rugido", "Sim");
		Preguica Chunli = new Preguica("Chun-li", "27", "Balido", "Sim");
		
	
		System.out.println("\t\t\t ::: Informações dos Animais ::: ");
		
		Ryu.imprimirInfo();
		Ken.imprimirInfo();
		Chunli.imprimirInfo();
		
	}

}
