
//4-Faça um programa em que permita a entrada de um número qualquer e exiba 
//se este número é par ou ímpar. Se for par exiba também a raiz quadrada do 
//mesmo; se for ímpar exiba o número elevado ao quadrado.

package ExerciciosJava02;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String arg[]) {
	
		
		int num;
		double raiz;
		
		Scanner scan = new Scanner (System.in);

		
		System.out.println("Digite um número: ");
		num = scan.nextInt();
		
		
		if(num % 2 == 0) {
			raiz = Math.sqrt(num); 
			// Math.sqrt ->  faz a raiz quadrada de um número, precisa que seja double para não estourar a variável.
			System.out.printf("Este número é par. A sua raiz quadrada é: %2.3f", raiz);
		}
		
		else {
			num = (int) Math.pow(num, 2); 
			// Math.pow -> vai transformar um número a sua potência 
			System.out.println("Este número é ímpar." + "\nElevado ao quadrado é: " + num);

		}
		
		
		
	}
}
