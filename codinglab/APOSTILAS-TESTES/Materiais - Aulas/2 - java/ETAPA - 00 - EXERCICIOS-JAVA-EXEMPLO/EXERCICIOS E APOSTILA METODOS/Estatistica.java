package Subprogramas_Lista3;

import java.util.*;
import java.text.*;
import java.math.*;

public class Estatistica {
	private static Scanner s = new Scanner(System.in);
	private static ArrayList<Cidadao> pesquisa = new ArrayList();
	private static DecimalFormat df = new DecimalFormat("##0");
	
	private enum corOlhos  {AZUIS, VERDES, CASTANHOS};
	private enum corCabelos {LOUROS, PRETOS, CASTANHOS};
	
	private static corOlhos tipoOlhos;
	private static corCabelos tipoCabelos;
	
	private static void lerDados()
	{
		while (true)
		{
			System.out.println("Informe idade (0 para terminar)");
			int idade = s.nextInt();
			if (idade == 0 )
				break;

			System.out.println("Informe sexo (M) Masculino (F)feminino");
			char sexo = s.next().toUpperCase().charAt(0);
			while ((sexo != 'M') & (sexo != 'F'))
			{
				System.out.println("Informe sexo (M) Masculino (F)feminino");
				sexo = s.next().toUpperCase().charAt(0);
			}

			String coro = "";
			boolean achou = false;
			while (!achou)
			{
				System.out.println("Informe cor dos olhos (azuis, verdes, castanhos)");
				coro = s.next().toUpperCase();

				for (corOlhos co : tipoOlhos.values()) 
				{
					if (co.toString().toUpperCase().equalsIgnoreCase(coro))
					{
						achou = true;
						break;
					}
				}
			}
			
			achou = false;
			String corc = "";
			while (!achou)
			{
				System.out.println("Informe cor dos cabelos (louros, pretos, castanhos)");
				corc = s.next().toUpperCase();

				for (corCabelos co : tipoCabelos.values()) 
				{
					if (co.toString().toUpperCase().equalsIgnoreCase(corc))
					{
						achou = true;
						break;
					}
				}
			}
			
			pesquisa.add(new Cidadao(idade, sexo, coro, corc));
			
		}
	}
	
	private static void produzContagem()
	{
		int maiorIdade = 0;
		double cont = 0;
		for (Cidadao c : pesquisa)
		{
			if (c.idade > maiorIdade)
				maiorIdade = c.idade;
			
			if ((c.sexo == 'F') & (c.idade >= 18) & 
				(c.idade <= 35) & (c.olhos.equals("VERDES")) & 
				(c.cabelos.equals("LOUROS")))
				cont++;
			
		}
		
		System.out.println("Maior idade: " + maiorIdade);
		System.out.println("Porcentagem de indivíduos do sexo feminino cuja idade está entre 18 e 35 anos, " +
				           "inclusive, e que tenham olhos verdes e cabelos louros.: " + 
				           df.format((cont / pesquisa.size()) * 100));
		
	}
	
	public static void main(String[] args) {
		lerDados();
		produzContagem();
	}
}
