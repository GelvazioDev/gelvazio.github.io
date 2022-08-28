/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_24_10_2011;

import java.util.Scanner;

/**
 *
 * @author gelvazio
 * Vetor A = 4 5 2 3 1 7 
 * Vetor B = 1 5 4 2 8 6 
 * Vetor U = 1 5 4 2 
 * 
 * 
 */
public class Exercicio_Uniao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int vetA [] = new int[50];
        int vetB [] = new int[50];
        int vetU [] = new int[100];
        int qtd_a,qtd_b,qtd_u,i,j,achou=0;
        {
            qtd_u=0;
            
            System.out.println("Qtde de A");
            qtd_a=entrada.nextInt();
            System.out.println("Qtde de B");
            qtd_a=entrada.nextInt();
            
            for (i=1;i<qtd_a;i++){
                System.out.println("Valor do Vetor A");
                vetA[i]=entrada.nextInt();
            }   
            for (j=1;j<qtd_a;j++){
                System.out.println("Valor do Vetor B");
                vetB[i]=entrada.nextInt();
                
            }
            qtd_u=qtd_a;
            
            for (j=1;j<qtd_a;j++){
               if (vetB[i]==vetA[i]){
                    achou=0;
                }
               if (vetB[i]!=vetA[i]){
                   achou=1;
               }
                
            }
            if (achou==0){
                qtd_u=qtd_u+1;
                vetU[i]=vetA[i];
            }
            
           for (j=1;j<qtd_u;j++){
               System.out.println("Resultado do vetor"+vetU[j]);
           }
            
            
        }
        
        
    }
    
}
