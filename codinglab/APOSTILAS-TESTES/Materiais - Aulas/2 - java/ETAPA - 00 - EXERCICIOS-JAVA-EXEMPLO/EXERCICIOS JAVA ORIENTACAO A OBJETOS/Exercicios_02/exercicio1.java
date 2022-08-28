//1-Faça um programa que receba três inteiros e diga qual deles é o maior.

package ExerciciosJava02;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num1, num2, num3;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1° número: ");
		num1 = scan.nextInt();
		
		System.out.println("2° número: ");
		num2 = scan.nextInt();
		
		System.out.println("3° número: ");
		num3 = scan.nextInt();
		
		
		if(num1>num2 && num1 > num3) {
			System.out.println("O número: " + num1 + " é o maior que foi digitado");

		}
		else if(num2 > num1 && num2 > num3) {
			System.out.println("O número: " + num2 + " é o maior que foi digitado");

		}
		else {
			System.out.println("O número: " + num3 + " é o maior que foi digitado");

		}
		
	}

}
