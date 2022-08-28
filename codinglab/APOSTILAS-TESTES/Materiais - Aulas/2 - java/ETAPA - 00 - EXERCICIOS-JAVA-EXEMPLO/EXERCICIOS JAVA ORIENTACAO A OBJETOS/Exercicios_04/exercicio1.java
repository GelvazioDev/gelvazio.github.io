//1- Faça um programa que possua um vetor denominado A que armazene 6 números inteiros.
//O programa deve executar os seguintes passos: 
//(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
//(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições 
//A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
//(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
//(d) Mostre na tela cada valor do vetor A, um em cada linha.


package ExercicioJava04;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arrayA = {1, 0, 5, -2, -5, 7};
		int soma;
		
		soma = arrayA[0] + arrayA[1] + arrayA[5];
		System.out.println("A soma será: " + soma + "\n");
		
		arrayA[4] = 100;
		
		System.out.println(arrayA[0] + "\n");
		System.out.println(arrayA[1] + "\n");
		System.out.println(arrayA[2] + "\n");
		System.out.println(arrayA[3] + "\n");
		System.out.println(arrayA[4] + "\n");
		System.out.println(arrayA[5] + "\n");
	}
}
