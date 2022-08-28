package ativadade_I;

import java.util.Scanner;

/**
 *
 * @author gelvazio
 *10)Faça um programa que leia 2 números inteiros da entrada e
 * imprima o resto da divisão inteira de um pelo outro.
 */
public class Algoritmo_Dez {
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
