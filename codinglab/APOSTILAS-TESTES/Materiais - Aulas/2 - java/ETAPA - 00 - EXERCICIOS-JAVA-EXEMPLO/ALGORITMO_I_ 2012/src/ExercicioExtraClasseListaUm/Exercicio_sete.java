/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioExtraClasseListaUm;

import java.util.Scanner;

/**
 *
 * @author aluno
 * 7) Faça um programa que leia 3 números inteiros da entrada 
 * e imprima a sua média aritmética.
 */
public class Exercicio_sete {
    public static void main (String args []){
        Scanner entrada = new Scanner (System.in);
        int n1=0,n2=0,n3=0,media=0;
        System.out.println("Digite p primeiro numero: ");
        n1=entrada.nextInt();
        System.out.println("Digite o segundo numero: ");
        n2=entrada.nextInt();
        System.out.println("Digite o terceiro numero: ");
        n3=entrada.nextInt();
        
        media=(n1+n2+n3)/3;
        System.out.println("Resultado; "+media);
    }
    
}
