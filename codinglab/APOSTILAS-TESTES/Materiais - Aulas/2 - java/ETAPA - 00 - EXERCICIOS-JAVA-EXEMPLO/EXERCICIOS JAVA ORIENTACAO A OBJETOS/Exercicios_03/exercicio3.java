//3-Solicitar a idade de várias pessoas e imprimir: Total de pessoas 
//com menos de 21 anos. Total de pessoas com mais de 50 anos.
//O programa termina quando idade for =-99. (WHILE)

package ExerciciosJava03;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int idade, contV=0, contC=0;
		Scanner scan = new Scanner(System.in);

		System.out.println("\tDigite '-99' para sair do programa");
		
		System.out.println("Digite sua idade: ");
		idade = scan.nextInt();
		
		while(idade != -99) {
			
			System.out.println("Digite sua idade: ");
			idade = scan.nextInt();
			
			if(idade <= 21) {
				contV++;
			}
			
			if (idade > 50){
				contC++;
			}
		}
		System.out.println(contV + " pessoa(s) estão entre 21 e 49 anos");
		System.out.println(contV + " pessoa(s) estão acima de 50 anos");

	}

}
