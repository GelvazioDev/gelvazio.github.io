package Subprogramas_Lista3;

import java.text.*;
import java.util.*;
import java.math.*;

public class Ocupacao {

	private static Scanner s = new Scanner(System.in);
	private static boolean[][] salao = new boolean[20][15]; 
	
	
	private static void inicializa()
	{
		for (int lin=0; lin < salao.length;lin++)
			for (int col=0; col < salao[lin].length; col++)
				salao[lin][col] = false;
	}
	

	public static void confirmaReserva() 
	{
		System.out.println("Informe o assento reservado - fila e poltrona");
		System.out.println("Informe o numero da fila 1-" + + salao.length);
		int fila = s.nextInt();
		while (fila < 1 | fila > salao.length)
		{
			System.out.println("Valor invalido. Informe o numero da fila 1-" + salao.length);
			fila = s.nextInt();
		}
		
		System.out.println("Informe o numero da cadeira 1-" + + salao[fila-1].length);
		int cadeira = s.nextInt();
		while (cadeira < 1 | cadeira > salao[fila-1].length)
		{
			System.out.println("Valor invalido. Informe o numero da cadeira 1-"+ salao[fila-1].length);
			cadeira = s.nextInt();
		}
		
		if (salao[fila-1][cadeira-1])
			System.out.println("O assento já está ocupado.");
		else
			salao[fila-1][cadeira-1] = !salao[fila-1][cadeira-1];
		
	}
	
	private static void imprimeOcupacao()
	{
		for (int lin=0; lin < salao.length;lin++){
			System.out.println("");
			for (int col=0; col < salao[lin].length; col++)
			{
				if (salao[lin][col]) 
					System.out.print( "O ");
				else
					System.out.print( "_ ");
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		try
		{
			inicializa();
			System.out.println("Confirmar reserva? s/n.");
			String opcao = s.next().toUpperCase();
			while(opcao.equals("S")){
				confirmaReserva();
				System.out.println("Confirmar reserva? s/n.");
				opcao = s.next().toUpperCase();
			}
			imprimeOcupacao();
		}
		catch(Exception e)
		{
			System.out.println("Erro alocando cadeira:" + e.getMessage());
		}
	}
}
