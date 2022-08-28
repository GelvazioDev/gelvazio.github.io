//5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno.
//Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 

package ExerciciosJava01;

import java.util.Scanner;

public interface exercicio5 {

	public static void main(String[] args) {

	float nota1, nota2, nota3, medFinal, np1, np2, np3;
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("1° nota: ");
	nota1 = scan.nextFloat();
	
	System.out.println("2° nota: ");
	nota2 = scan.nextFloat();
	
	System.out.println("3° nota: ");
	nota3 = scan.nextFloat();
	
	np1 = nota1*2;
	np2 = nota2*3;
	np3 = nota3*5;
	
	medFinal = (np1 + np2 + np3) / 10;
		
	System.out.printf("A média final é: %2.2f", medFinal);
	}
}