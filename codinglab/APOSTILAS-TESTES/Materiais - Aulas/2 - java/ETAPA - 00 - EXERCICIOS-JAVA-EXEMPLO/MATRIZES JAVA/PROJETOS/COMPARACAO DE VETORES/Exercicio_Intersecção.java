/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_24_10_2011;

import java.util.Scanner;

/**
 *
 * @author aluno
 * Vetor Intersecçao compreende os numeros que estao em A e em B
 * EXemplo
 * Vetor A 1 3 6 9 8 7
 * Vetor B 1  5 9 8 7 
 * 
 * Vetor C Intersecçao 1 9 8 7 
 * 
 */
public class Exercicio_Intersecção {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int vetA [] = new int[50];
        int vetB [] = new int[100];
        int vetU [] = new int [100];
        int qtd_a,qtd_b,qtd_u,i,j=0;
      {
            System.out.println("Digite quantidade de A");
            qtd_a=entrada.nextInt();
            System.out.println("Digite quantidade de B");
            qtd_b=entrada.nextInt();
            
            for (i=1;i<=qtd_a;i++){
               System.out.println("Digite o valor do vetor A");
               vetA[i]=entrada.nextInt();
            }
               qtd_u=0;
               
            for (i=1;i<=qtd_b;i++){
                   System.out.println("Digite o valor do vetor B");
                   vetB[i]=entrada.nextInt();
                   for (j=1;j<=qtd_a;j++){
                       if (vetB[i] == vetA[j]){
                           qtd_u = qtd_u +1;
                           vetU[qtd_u] = vetB[i];
                       }
                   }
            }
               for (i=1;i<=qtd_u;i++){
                   System.out.print("Vetor Intersecçaõ!!" +vetU[i]);
               }
        }
        
    }
    
}

 
