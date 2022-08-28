/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioExtraClasseListaUm;

import java.util.Scanner;

/**
 *
 * @author aluno
 * 12) Faça um programa que leia o valor de uma mercadoria 
 * e a porcentagem de desconto. O programa deve imprimir o novo valor com desconto.
 */
public class Exercicio_treze {
    public static void main (String args []){
        Scanner entrada=new Scanner(System.in);
        double preco=0,desconto=0,total=0;
        System.out.println("Preco da mercadoria: ");
        preco=entrada.nextDouble();
        System.out.println("Digite o desconto: ");
        desconto=entrada.nextDouble();
        total=preco-(preco*(desconto/100));
        System.out.println("Preco ja com o desconto: "+total);
    }
    
}
