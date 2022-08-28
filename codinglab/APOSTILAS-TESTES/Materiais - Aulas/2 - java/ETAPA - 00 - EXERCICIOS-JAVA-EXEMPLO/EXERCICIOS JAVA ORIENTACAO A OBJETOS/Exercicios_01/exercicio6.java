 //Construa um programa em Java que, tendo como dados de entrada dois pontos quaisquer
//no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. 
//A fórmula que efetua tal cálculo é:

package ExerciciosJava01;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x1, x2, y1, y2, d;
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Número para x1: ");
		x1 = scan.nextDouble();

		System.out.println("Número para x2: ");
		x2 = scan.nextDouble();

		System.out.println("Número para y1: ");
		y1 = scan.nextDouble();

		System.out.println("Número para y2: ");
		y2 = scan.nextDouble();
		
		d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		System.out.printf("\n A distância entre os pontos: %.2f" , d);
		
			
	}

}
