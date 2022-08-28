package Subprogramas_Lista3;

public class Cidadao {
		public int idade;
		public char sexo;
		public String olhos;
		public String cabelos;
		
		
		public Cidadao()
		{
			idade = 0;
			sexo = ' ';
			olhos = "";
			cabelos = "";
		}
		
		public Cidadao(int idade, char sexo, String olhos, String cabelos)
		{
			this.idade = idade;
			this.sexo = sexo;
			this.olhos = olhos;
			this.cabelos = cabelos;
		}
		
	}