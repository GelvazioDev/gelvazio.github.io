package Subprogramas_Lista3;

import java.text.*;
import java.util.*;
import java.math.*;

public class CalculaSerie {

	private static Scanner s = new Scanner(System.in);
	private static DecimalFormat df = new DecimalFormat("###0.000");
	static int x = 0;
	static int exp = 0;
	static int fatorial = 0;
	
	public static void lerValores() 
	{
		System.out.println("Informe um valor para a base");
		x = s.nextInt();
		
		System.out.println("Informe um valor para o expoente");
		exp = s.nextInt();
	}
	
	
	public static void calculaFatorial() 
	{
		if (fatorial <= 1)
			fatorial = 1;
		else
		{
			int n = fatorial-1;
			while (n>= 1)
			{
				fatorial = fatorial * n;
				n--;
			}
		}
	}

	
	public static void resolveSerie() 
	{
		double res = Math.pow(x,exp);
		double serie = 0;
		exp = 0;
		fatorial = 0;
		int termos = 0;
		
		while (true)
		{
			calculaFatorial();
			double serieAnt = serie;
			serie += Math.pow(x, exp) / fatorial; 
			if  ((res - serie) >= 0.0001)
				termos++;
			else
			{
				serie = serieAnt;
				break;
			}

			exp++;
			fatorial = exp;
		}
		
		System.out.println("Resultados: Math.pow(): " + df.format(res));
		System.out.println("Serie: " + df.format(serie));
		System.out.println("Diferença: " + df.format(res - serie));
		System.out.println("Numero de termos: " + termos);
		
	}
	
	public static void main(String[] args) {
		try
		{
			lerValores();
			resolveSerie();
		}
		catch(Exception e)
		{
			System.out.println("Não foi possivel calcular.");
		}
	}
}