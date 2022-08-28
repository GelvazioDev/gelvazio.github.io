/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioExtraClasseListaUm;

import java.util.Scanner;

/**
 *
 * @author aluno
 * 10) Faça um programa que 
 * leia 2 números inteiros da entrada e imprima o resto da divisão inteira de um pelo outro.
 */
public class Exercicio_dez {
    public static void main (String args[]){
        Scanner entrada=new Scanner (System.in);
        int n1=0,n2=0,divisao=0;
        System.out.println("Digite o primeiro numero; ");
        n1=entrada.nextInt();
        System.out.println("Digite o segundo numero; ");
        n2=entrada.nextInt();
        divisao=n1%n2;
        System.out.println("Resultado; "+divisao);
        
    }
    
}
