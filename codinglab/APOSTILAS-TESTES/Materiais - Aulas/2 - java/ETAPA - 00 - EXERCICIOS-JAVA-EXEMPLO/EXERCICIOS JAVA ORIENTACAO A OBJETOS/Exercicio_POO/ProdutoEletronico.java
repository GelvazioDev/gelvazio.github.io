//3) Crie uma classe produto eletrônico e apresente os atributos e métodos 
//referentes esta classe, em seguida crie um objeto produto eletrônico, defina
//as instancias deste objeto e apresente as informações deste objeto no console.

package ExercicioPPO;

import java.text.NumberFormat;

public class ProdutoEletronico {

	public String produto;
	public String marca;
	public String processador;
	public int anoFabricacao;
	public double valor;
	
	public ProdutoEletronico(String prod, String marc, 
			String proce, int anoFabri, double val)
	{
		this.produto = prod;
		this.marca = marc;
		this.processador = proce;
		this.anoFabricacao = anoFabri;
		this.valor = val;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produt) {
		this.produto = produt ;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}

	public int getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	};
	
	public String formatarMoeda()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance(); //define a moeda padrão do pais
		nf.setMinimumFractionDigits(2);//define a quantidade de casas depois da vírgula
		String formatoMoeda = nf.format(valor);//formata a saída do salário
		return formatoMoeda;
	}
	
	public void imprimirInfo()
	{
		System.out.println(
				"\nProduto: "+ produto + "\nMarca: " + marca +
				"\nProcessador: " + processador + "\nAno de Fabricação: " +
				anoFabricacao + "\nValor: " + this.formatarMoeda()+
				"\n\n*******************************************");
	}
	
}
