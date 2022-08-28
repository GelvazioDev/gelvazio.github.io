//3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

package ExercicioJava04;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[][] num = new int [3][3];
		int contMais10=0;
		
		Scanner scan = new Scanner(System.in);

		for(int x = 0; x < 3; x++) {
			
			for(int y = 0; y < 3; y++) {
			
				System.out.println("Insira um número: ");
				num[x][y]= scan.nextInt();
			}
		}
		
		for(int x = 0; x < 3; x++) {
			
			for(int y = 0; y < 3; y++) {
			
				if(num[x][y] > 10) {
					contMais10++;
				}
			}
		}
		System.out.println("Nesta matriz há: " + contMais10 + " números maiores que 10.");
	}
}
