//4. Escreva  um sistema que leia três números inteiros 
//e positivos (A, B, C) e calcule a seguinte expressão: 

// D= (R + S) / 2 ;  R = (A + B) ² ; S = (B + C)²

package ExerciciosJava01;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b, c, d, r, s;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Numero de a: ");
		a = scan.nextInt();
		
		System.out.println("Numero de b: ");
		b = scan.nextInt();
		
		System.out.println("Numero de c: ");
		c = scan.nextInt();
		
		r = (int) Math.pow(a + b,2);
		// metodo pow é para elevar um numero ou uma expressão ao quadrado ou infinito(haha)
		
		s = (int) Math.pow(b + c,2);
		
		d = (r + s) / 2;
		
		System.out.println("O resultado é: " + d);
		
	}

}
