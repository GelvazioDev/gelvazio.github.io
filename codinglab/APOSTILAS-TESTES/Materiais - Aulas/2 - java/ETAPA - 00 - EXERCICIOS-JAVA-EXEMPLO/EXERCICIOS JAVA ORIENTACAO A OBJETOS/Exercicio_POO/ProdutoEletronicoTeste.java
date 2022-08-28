package ExercicioPPO;

public class ProdutoEletronicoTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProdutoEletronico[]lista = new ProdutoEletronico[3];
		
		
		lista [0] = new ProdutoEletronico("iQOO 7", "Vivo", "Snapdragon 888", 2020, 1000);
		lista [1] = new ProdutoEletronico("X60 Pro+", "Vivo", "Snapdragon 888", 2020, 2000);
		lista [2] = new ProdutoEletronico("Redmi K40 Pro", "Xiaomi", "Qualcomm", 2020, 3000);
		
		
		System.out.println("\t\t ::: Produtos Eletônicos ::: ");
		
		for(ProdutoEletronico girar:lista) {
			girar.imprimirInfo();
			
		}
	}

}
