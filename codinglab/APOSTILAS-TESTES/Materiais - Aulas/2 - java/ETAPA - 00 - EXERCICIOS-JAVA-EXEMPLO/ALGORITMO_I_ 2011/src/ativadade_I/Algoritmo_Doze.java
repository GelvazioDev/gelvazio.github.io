package ativadade_I;

import java.util.Scanner;

/**
 *
 * @author gelvazio
 * 12)Faça um programa que leia o valor de uma mercadoria e a porcentagem de
 * desconto. O programa deve imprimir o novo valor com desconto.
 */
public class Algoritmo_Doze {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int valor,desc,t;
        System.out.println("Digite o valor da mercadoria:");
        valor = entrada.nextInt();
        System.out.println("Digite o desconto da mercadoria (Porcentagem):");
        desc = entrada.nextInt();
        
        t = valor -((valor * desc)/100);

        System.out.println("O novo valor com desconto é de :"+t);
    }

}
