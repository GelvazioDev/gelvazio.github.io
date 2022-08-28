package Subprogramas_Lista3;

import java.text.*;
import java.util.*;

public class CalculaMassa {

	private static Scanner s = new Scanner(System.in);
	private static DecimalFormat df = new DecimalFormat("00");
	static int ciclos  = 0;
	static double massa  = 0;
	
	private static void calculaCiclos()
	{
		while (massa >= 0.5)
		{
			massa = massa / 2;
			ciclos ++;
		}
	}
	
	private static void calculaTempo()
	{
		int sec = (ciclos*50);
		
		int hr = sec / 3600;
		int min = sec % 3600;
		min = min / 60;
		sec = min % 60;
		System.out.println("Duração:" + df.format(hr) + ":" + df.format(min) + ":" + df.format(sec));
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Informe a massa do material (em gramas)");
		massa  = s.nextDouble();
		
		calculaCiclos();
		calculaTempo();
	}

}

