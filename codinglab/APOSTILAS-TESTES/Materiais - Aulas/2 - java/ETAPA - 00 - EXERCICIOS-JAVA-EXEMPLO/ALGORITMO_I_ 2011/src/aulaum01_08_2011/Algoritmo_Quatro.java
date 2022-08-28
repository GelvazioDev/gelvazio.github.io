/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulaum01_08_2011;

import java.util.Scanner;

/**
 *
 * @author gelvazio
 * Algoritmo_Quatro
 * Faça um algoritmo para ler uma temperatura em graus Celsius, e transforme
 * para graus Farenheidt e Kelvin.
 * OBS:
 * C = 5 (F - 32)/9;
 * K = C + 273;
 */
public class Algoritmo_Quatro {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double c,k,f;

    System.out.println("Digite a temperatura em graus Celsius:");
    c=entrada.nextDouble();
    
    f = ((c * 1.8) + 32);
    k = c + 273;

    System.out.println("A temperatura em graus Farenheidt é:"+f);
    System.out.println("A temperatura em graus Kelvin é:"+k);
}
}


