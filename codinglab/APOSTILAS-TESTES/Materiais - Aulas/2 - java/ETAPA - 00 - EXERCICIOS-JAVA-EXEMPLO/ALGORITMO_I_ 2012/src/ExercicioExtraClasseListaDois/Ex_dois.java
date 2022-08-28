/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioExtraClasseListaDois;

import java.util.Scanner;

/**
 *
 * @author aluno
 * 2. Construir um algoritmo para efetuar a soma e 
 * a multiplicação de diversos inteiros fornecidos pelo usuário. 
 * O número que encerra as entradas é -1.
 */
public class Ex_dois {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        int n1=0,mult=1,soma=0,i=0;
        
        for (i=0;i<2;i++){
        System.out.println("Digite o numero ou -1 para parar: ");
        n1=entrada.nextInt();
        mult=mult*n1;
        soma=soma+n1;
    }
    System.out.println("Multiplicação: "+mult);
    System.out.println("Soma: "+soma);
}}
