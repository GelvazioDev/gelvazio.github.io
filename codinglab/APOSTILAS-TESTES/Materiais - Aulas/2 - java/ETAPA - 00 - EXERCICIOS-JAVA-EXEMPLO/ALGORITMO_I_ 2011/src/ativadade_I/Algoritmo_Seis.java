package ativadade_I;

import java.util.Scanner;

/**
 *
 * @author gelvazio
 * 6) Faça um programa que leia 2 números inteiros e imprima o seu produto.
 */
public class Algoritmo_Seis {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int n1,n2,res;
        System.out.println("Digite o numero um:");
        n1 = entrada.nextInt();
        System.out.println("Digite o numero dois:");
        n2 = entrada.nextInt();

        res = n1 * n2;
        System.out.println("Resultado: "+res);
    }

}
