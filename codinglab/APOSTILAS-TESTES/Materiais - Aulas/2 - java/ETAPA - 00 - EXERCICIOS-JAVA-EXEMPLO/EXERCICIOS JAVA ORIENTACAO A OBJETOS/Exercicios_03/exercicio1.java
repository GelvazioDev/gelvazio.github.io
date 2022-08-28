//1-Informar todos os números de 1000 a 1999 que quando 
//divididos por 11 obtemos resto = 5. (FOR)
package ExerciciosJava03;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		
		Scanner scan = new Scanner(System.in);
		
		for(num=1000; num<=1999; num++) {
			if(num % 11 == 5) {
				System.out.println("O numéro: " + num + " dividido por 11, tem resto 5");
			}
		}
		
	}

}
