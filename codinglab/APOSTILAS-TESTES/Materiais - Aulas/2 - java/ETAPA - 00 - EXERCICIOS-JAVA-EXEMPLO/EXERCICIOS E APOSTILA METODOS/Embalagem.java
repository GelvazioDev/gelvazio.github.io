package Subprogramas_Lista3;

import java.util.*;
import java.text.*;
import java.math.*;

public class Embalagem {
	private static Scanner s = new Scanner(System.in);
	private static ArrayList<ItemLote> lotes = new ArrayList();
	
	private static final int diage1 = 10;
	private static final int diage2 = 15;
	private static final int diage3 = 20;
	private static final int diage4 = 25;
	
	private static int quante1 = 0;
	private static int quante2 = 0;
	private static int quante3 = 0;
	private static int quante4 = 0;
	private static int quantfora = 0;

	private static void lerquantidades()
	{
		while (true)
		{
			System.out.println("informe quantidade do lote (0 para terminar)");
			int quant = s.nextInt();
			if (quant == 0)
				break;
			
			System.out.println("informe medida da embalagem (lado A)");
			int ladoA = s.nextInt();
			System.out.println("informe medida da embalagem (lado B)");
			int ladoB = s.nextInt();
			System.out.println("informe medida da embalagem (lado C)");
			int ladoC = s.nextInt();
			lotes.add(new ItemLote(ladoA, ladoB, ladoC, quant));
		}
	}
	
	private static void calculaEsferas()
	{
		for (int i = 0; i < lotes.size(); i++)
		{
			double diagonal = Math.sqrt(Math.pow(lotes.get(i).ladoA, 2) + 
						   Math.pow(lotes.get(i).ladoB, 2) +
					       Math.pow(lotes.get(i).ladoC, 2));
			
			if (diagonal <= diage1)
				quante1 += lotes.get(i).quant;
			else
				if (diagonal <= diage2)
					quante2 += lotes.get(i).quant;
				else
					if (diagonal <= diage3)
						quante3 += lotes.get(i).quant;
					else
						if (diagonal <= diage4)
							quante4 += lotes.get(i).quant;
						else
							quantfora += lotes.get(i).quant;
				
			
		}
	}
	
	private static void imprimeQuantidades()
	{
		System.out.println("Quantidade de esferas necessárias");
		System.out.println("10 cm ->"  + quante1);
		System.out.println("15 cm ->"  + quante2);
		System.out.println("20 cm ->"  + quante3);
		System.out.println("25 cm ->"  + quante4);
		System.out.println("Não podem ser embalados:" + quantfora);
	}
	
	
	public static void main(String[] args) {
		lerquantidades();
		calculaEsferas();
		imprimeQuantidades();
	}
}
