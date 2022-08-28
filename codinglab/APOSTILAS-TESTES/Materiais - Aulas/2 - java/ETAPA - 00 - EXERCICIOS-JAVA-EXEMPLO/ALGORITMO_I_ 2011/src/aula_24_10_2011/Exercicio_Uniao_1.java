/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_24_10_2011;

import java.util.Scanner;

/**
 *
 * @author aluno
 * Algoritmo da Uniao
 * 
 */
public class Exercicio_Uniao_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int vetA [] = new int[50];
        int vetB [] = new int[100];
        int vetU [] = new int [100];
        int qtd_a,qtd_b,qtd_u,i;
        int achou=0,j=0;
        
        {
            System.out.println("Digite quantidade de A");
            qtd_a=entrada.nextInt();
            System.out.println("Digite quantidade de B");
            qtd_b=entrada.nextInt();
            
            for (i=1;i<=qtd_a;i++){
               System.out.println("Digite o valor do vetor A");
               vetA[i]=entrada.nextInt();
               vetU[i]=vetA[i];
            } 
               qtd_u=qtd_a;
               
               for (i=1;i<=qtd_b;i++){
                   System.out.println("Digite o valor do vetor B");
                   achou = 0;
                   for (j=1;j<=qtd_u;j++){
                       if (vetB[i] == vetU[j]){
                           achou=1;
                       }
                   }
                   if (achou == 0){
                       qtd_u = qtd_u +1;
                       vetU[qtd_u] = vetB[i];
                   }
               }
               for (i=1;i<=qtd_u;i++){
                   System.out.println("Vetor U"+vetU[i]);
               }
        }
        
    }
    
}
