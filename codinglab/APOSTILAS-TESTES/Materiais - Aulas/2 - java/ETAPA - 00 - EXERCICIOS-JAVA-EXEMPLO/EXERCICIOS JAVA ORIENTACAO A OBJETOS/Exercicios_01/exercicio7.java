// 7. Um sistema de equações lineares do tipo: 
// ax + by = c ; dx + ey = f ; 

package ExerciciosJava01;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float a, b, c, d, e, f , x, y;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Valor de a: ");
		a = scan.nextFloat();
		
		System.out.println("Valor de b: ");
		b = scan.nextFloat();
		
		System.out.println("Valor de c: ");
		c = scan.nextFloat();
		
		System.out.println("Valor de d: ");
		d = scan.nextFloat();
		
		System.out.println("Valor de e: ");
		e = scan.nextFloat();
		
		System.out.println("Valor de f: ");
		f = scan.nextFloat();
	
		x = (c*e - b*f) / (a*e - b-d);
		
		y = (a*f - c*d) / (a*e - b*d);
		
		
		System.out.println("\n Valor de 'x': " + x);
		System.out.println("\n Valor de 'y': " + y);
	}

}
