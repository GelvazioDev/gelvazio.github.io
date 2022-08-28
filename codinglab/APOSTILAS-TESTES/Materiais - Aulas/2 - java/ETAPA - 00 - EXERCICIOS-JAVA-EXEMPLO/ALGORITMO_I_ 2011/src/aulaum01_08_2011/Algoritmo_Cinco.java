
package aulaum01_08_2011;

import java.util.Scanner;

/**
 *
 * @author gelvazio
 * Algoritmo_Cinco
 * Faça um algoritmo que calcule a média aritmética de 3 numeros inteiros,
 * a serem informados pelo usuario.
 *
 *
 */
public class Algoritmo_Cinco {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double n1,n2,n3,media;

    System.out.println("Digite as horas:");
    n1=entrada.nextDouble();
    System.out.println("Digite os minutos:");
    n2 =entrada.nextDouble();
    System.out.println("Digite os minutos:");
    n3 =entrada.nextDouble();

    media = (n1+n2+n3)/3;

    System.out.println("A média aritmética dos numeros é:"+media);

}
}
