//2- Faça um programa que receba 6 números inteiros e mostre: 
//• Os números pares digitados;  
//• A soma dos números pares digitados; 
//• Os números ímpares digitados; 
//• A quantidade de números ímpares digitados.

package ExercicioJava04;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num = new int[6];
		int somaP=0, contP=0, contI=0;
		
		Scanner scan = new Scanner(System.in);

		for(int x = 0; x < 6; x++) {
			System.out.println("Insira um número: ");
			num[x] = scan.nextInt();	
		} //for para capturar os 6 valores
		
		System.out.println("\nNúmeros pares: ");
		for(int x = 0; x < 6; x++) {
			
			if(num[x] % 2 == 0) {
				somaP += num[x];
				contP++;
				System.out.print(num[x] + "; ");
			}
		}
		
		System.out.println("\n\nNúmeros Ímpares: ");
		for(int x = 0; x < 6; x++) {
		
			if(num[x] % 2 != 0) {
				contI++;
				System.out.print(num[x] + "; ");

			}
			
		}
		System.out.println("\n\nFoi digitado: " + contP + " números pares");
		System.out.println("Foi digitado: " + contI + " números ímpares");
		System.out.println("Total da soma dos números pares: " + somaP);

	}

}
