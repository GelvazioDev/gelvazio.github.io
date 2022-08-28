//2. Faça um sistema que leia a idade de uma pessoa expressa
//em dias e mostre-a expressa em anos, meses e dias. 

package ExerciciosJava01;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {

	int dia, anos, meses, dias;
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Digite sua idade (em dias): ");
	dia = scan.nextInt();
	
	anos = (dia / 365);

	dias = (dia % 365);

	meses = (dias / 30);
	
	dia = dias % 30;
	
	dias = dias;
	
	System.out.println("Você tem "+anos+" anos, "+meses+" meses e "+dias+" dias.");
	
	}

}
