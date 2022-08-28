/*Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
	dias e mostre-a expressa apenas em dias.*/

package ExerciciosJava01;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {

		float idAnos, idMeses, idDias, dias;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Você tem quantos anos?: ");
		idAnos= scan.nextFloat();
		
		System.out.println("Quantos meses?: ");
		idMeses=scan.nextFloat();
		
		System.out.println("Quantos dias? :");
		idDias=scan.nextFloat();
		
		dias = ((idAnos * 365) + (idMeses * 30) + idDias);

		System.out.println("Você tem "+dias+" dias de vida.");
	}
}
