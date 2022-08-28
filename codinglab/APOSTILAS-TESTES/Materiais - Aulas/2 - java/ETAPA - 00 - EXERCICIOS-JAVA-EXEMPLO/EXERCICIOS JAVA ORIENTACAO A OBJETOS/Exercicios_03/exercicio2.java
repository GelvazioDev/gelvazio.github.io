//2-Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

package ExerciciosJava03;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, x, contpar=0, contimp=0;

		Scanner scan = new Scanner(System.in);

		for(x=0; x<=10; x++) {
			System.out.println("Digite um número: ");
			num = scan.nextInt();
			
			if(num % 2 == 0) {
				contpar++;
			}
			else {
				contimp++;
			}
			
		}
		System.out.println("Você digitou: " + contpar + " números pares");
		System.out.println("Você digitou: " + contimp + " números ímpares");
	}

}
