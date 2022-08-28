package Subprogramas_Lista3;

import java.util.*;
import java.text.*;
import java.math.*;

public class Jogo {

	private static Scanner s = new Scanner(System.in);
	private static int ptjog1=0;
	private static int ptjog2 = 0;
	
	public static void executaRodada() {
		Random r = new Random();
		
		while ((ptjog1 < 11) & (ptjog2 < 11))
		{
			System.out.println("-----------------------------------");
			System.out.println("Tecle <ENTER> para uma nova jogada");
			String string = s.nextLine();

			System.out.println("---> Jogador 1 atirando o dado");
			ptjog1 += r.nextInt(6);
			while (ptjog1 == 0)
				ptjog1 += r.nextInt(6);
			System.out.println("Pontuação do jogador 1: " + ptjog1);

			System.out.println("-----------------------------------");
			
			System.out.println("---> Jogador 2 atirando o dado");
			ptjog2 += r.nextInt(6);
			while (ptjog2 == 0)
				ptjog2 += r.nextInt(6);
			System.out.println("Pontuação do jogador 2: " + ptjog2);
			
		}
	}
	
	public static void imprimeRodada() {
		System.out.println("");
		System.out.println("-----------------------------------");
		if (ptjog1 > ptjog2)
			System.out.println("*** Vencedor é o jogador 1 ***");
		else
			System.out.println("*** Vencedor é o jogador 2 ***");
		System.out.println("Pontuação Final ***");
		System.out.println("Jogador 1:" + ptjog1);
		System.out.println("Jogador 2:" + ptjog2);
	}

	
	public static void main(String[] args) {
		System.out.println("Nova partida? s/n");
		String opcao = s.nextLine().toUpperCase();
		while(opcao.equals("S"))
		{
			executaRodada();
			imprimeRodada();
			System.out.println("Nova partida? s/n");
			opcao = s.nextLine().toUpperCase();
		}
	}

}
