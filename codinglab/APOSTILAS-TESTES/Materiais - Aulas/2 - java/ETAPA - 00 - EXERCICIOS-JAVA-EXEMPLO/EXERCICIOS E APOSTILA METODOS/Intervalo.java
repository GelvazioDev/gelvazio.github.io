package Subprogramas_Lista3;

import java.util.*;
import java.text.*;
import java.math.*;

public class Intervalo {
	private static Scanner s = new Scanner(System.in);
	private static ArrayList<ItemLote> lotes = new ArrayList();
	
	private static int a1 = 0;
	private static int a2 = 0;
	private static int m1 = 0;
	private static int m2 = 0;
	private static int d1 = 0;
	private static int d2 = 0;
	private static int bisextos= 0;
	private static int[] meses = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	private static void calculaBisexto()
	{
		for (int ano = a1; ano <= a2; ano++)
		{
			if ((ano % 4) == 0)
				if (!String.valueOf(ano).substring(2,4).equals("00"))
					bisextos++;
				else
					if ((ano % 400) == 0)
						bisextos++;
		}
	}
	
	private static void calculaIntervalo()
	{
		int dias = 0;
		for (int i = 0; i < (m1-1); i++)
			dias+= meses[i];
		dias+= d1 + (a1*365); 
			
		for (int i = 0; i < (m2-1); i++)
			dias-= meses[i];
		dias-= d1 + (a2*365);
		
		dias += bisextos;
		
		System.out.println("Dias no intervalo informado: " + dias);
	}
	
	public static void main(String[] args) {
		
		while (true)
		{
			try
			{
				System.out.println("Informe a data mais recente (Formato DD/MM/AAAA)");
				String data1 = s.next();
				
				System.out.println("Informe a data mais antiga(Formato DD/MM/AAAA)");
				String data2 = s.next();

				a1 = Integer.parseInt(data1.substring(6, 10));
				a2 = Integer.parseInt(data2.substring(6, 10));
				
				m1 = Integer.parseInt(data1.substring(3, 5));
				m2 = Integer.parseInt(data2.substring(3, 5));

				d1 = Integer.parseInt(data1.substring(0, 2));
				d2 = Integer.parseInt(data2.substring(0, 2));

				calculaBisexto();
				
				calculaIntervalo();

				break;
			}
			catch(Exception e)
			{
				System.out.println("ERRO!! O FORMATO DE DATA ESTÁ INCORRETO!! ("+ e.getMessage()+")");
			}
		}
	}
}
