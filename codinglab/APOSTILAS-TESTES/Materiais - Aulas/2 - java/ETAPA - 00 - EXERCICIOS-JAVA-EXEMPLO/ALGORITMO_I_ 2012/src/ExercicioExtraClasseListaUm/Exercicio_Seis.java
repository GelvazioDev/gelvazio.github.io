/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioExtraClasseListaUm;

import java.util.Scanner;

/**
 *
 * @author aluno
 * 6) Faça um programa que leia 2 números inteiros e imprima o seu produto.
 */
public class Exercicio_Seis {
    public static void main (String args[]){
        Scanner entrada=new Scanner(System.in);
        int n1=0,n2=0,produto=0;
        System.out.println("Digite o primeiro numero: ");
        n1=entrada.nextInt();
        System.out.println("Digite o segundo numero: ");
        n2=entrada.nextInt();
        produto=n1*n2;
        System.out.println("Resultado: "+produto);
    }
    
}
