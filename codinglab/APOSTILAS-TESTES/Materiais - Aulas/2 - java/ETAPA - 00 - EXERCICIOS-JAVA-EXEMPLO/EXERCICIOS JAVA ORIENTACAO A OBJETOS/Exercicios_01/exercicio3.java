//3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica 
//expressa em segundos e mostre-o expresso em horas, minutos e segundos. 

package ExerciciosJava01;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double minutos, segundos, horas, tempoS;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nQuantos segundos durou o evento: ");
		segundos = scan.nextDouble();
		
		horas = (segundos / 3600);
		
		minutos = (segundos % 3600) / 60;

		tempoS = (segundos % 3600) % 60;
		
		System.out.println("Duração: " + horas + " hora(s) " + minutos + " minuto(s) " + tempoS + " segundos");
	}

}
