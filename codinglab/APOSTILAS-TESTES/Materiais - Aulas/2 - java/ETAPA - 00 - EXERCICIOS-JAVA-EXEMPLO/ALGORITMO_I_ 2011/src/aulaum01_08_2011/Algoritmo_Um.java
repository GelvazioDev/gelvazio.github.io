/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulaum01_08_2011;

import java.util.Scanner;

/**
 *
 * @author gelvazio
 * Algoritmo_Um
 * Desenvolva um algoritmo para identificar se um determinado numero inteiro,
 * é positivo,negativo,ou nulo.
 */
public class Algoritmo_Um {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int n;

    System.out.println("Digite numero:");
    n=entrada.nextInt();

    if ((n > 0) && (n != 0))
        System.out.println("O numero é positivo!");
    else if (n < 0)
        System.out.println("O numero é negativo!");
    else
        System.out.println("O numero é nulo!");
}
}
