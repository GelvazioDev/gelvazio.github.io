package ExercicioPPO;

public class FuncionarioTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario [] lista = new Funcionario[3];
		
		lista [0] = new Funcionario("Goku", "Desenvolvedor Sênior", 43, 22000);
		lista [1] = new Funcionario("Gohan", "Desenvolvedor Pleno", 23, 11000);
		lista [2] = new Funcionario("Goten", "Desenvolvedor Júnior", 17, 5500);

	
		System.out.println("\t\t ::: Funcionários ::: \n");

		for(Funcionario rodar:lista) {
			rodar.imprimirInfo();
		}
	
	}

}
