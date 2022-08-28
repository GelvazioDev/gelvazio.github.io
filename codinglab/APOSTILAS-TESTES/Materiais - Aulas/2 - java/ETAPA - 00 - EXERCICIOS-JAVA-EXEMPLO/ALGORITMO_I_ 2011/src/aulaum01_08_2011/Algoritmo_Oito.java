/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulaum01_08_2011;

import java.util.Scanner;

/**
 *
 * @author gelvazio
 * Algoritmo_Oito:
 * Faça um algoritmo que leia dois numeros inteiros (n1 e n2)
 * calcule a divisão de n1/n2, e informe o resto desta divisão.
 * Não pode ser usado funções pre-programadas.Ex:12 % 5 = 2
 */
public class Algoritmo_Oito {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int n1,n2,r1,resto;
    System.out.println("Digite o numero um:");
    n1=entrada.nextInt();
    System.out.println("Digite o numero dois:");
    n2=entrada.nextInt();
    r1 = n1/n2;
    resto = n1 - (r1 * n2);
    System.out.println("O resto da divisão é:"+resto);
    }
    }

