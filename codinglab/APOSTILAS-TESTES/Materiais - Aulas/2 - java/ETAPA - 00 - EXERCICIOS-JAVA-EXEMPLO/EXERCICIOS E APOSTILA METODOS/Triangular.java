package Subprogramas_Lista3;

import java.text.*;
import java.util.*;

public class Triangular {

	private static Scanner s = new Scanner(System.in);
	private static DecimalFormat df = new DecimalFormat("00");
	
	public static void verificaTriangularidade() 
	{
		System.out.println("Informe um número inteiro positivo");
		int num = s.nextInt();
		
		int base = 1;
		while (true)
		{
			int res = (base * (base+1) * (base+2));
			if ( res == num ) 
			{
				System.out.println("-->" + num + " é triangular (" + base + "*" + (base+1) + "*" + (base+2) + "= " + base * (base+1) * (base+2) + ")");
				break;
			}
			else
				if ( res > num ) 
				{
					System.out.println("-->" + num + " não é um número triangular");
					break;
				}
			
			base++;
		}
	}
	
	public static void main(String[] args) {
		try
		{
			verificaTriangularidade();
		}
		catch(Exception e)
		{
			System.out.println("Não foi possivel determinar.");
		}
	}
}