/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_24_10_2011;

import java.util.Scanner;

/**
 *
 * @author aluno
 * Fazer a diferenca do Vetor A  eVetor B de n posições cada um.
 * Escrever um novo vetor com os novos elementos.
 * Vetor A 1 3 5 6 7 87 88 54 
 * Vetor B 1 5 6 7 8 9 15 21 
 * Vetor D 3 8 87 88 54 
 * 
 * 
 */
public class Exercicio_Diferença {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        //Verficar  se o elemento esta ou não no conjunto A
        int vetA [] = new int[50];
        int vetB [] = new int[100];
        int vetD [] = new int [100];
        int qtd_a,qtd_b,qtd_d=0,i,j=0,achou=0;
      {
            System.out.println("Digite quantidade de A");
            qtd_a=entrada.nextInt();
            System.out.println("Digite quantidade de B");
            qtd_b=entrada.nextInt();
  
          for (i = 1; i <= qtd_a; i++) {
              System.out.println("Digite o valor do vetor A");
              vetA[i] = entrada.nextInt();
          }
          for (i = 1; i <= qtd_b; i++) {
              System.out.println("Digite o valor do vetor B");
              vetB[i] = entrada.nextInt();
              
          for (j = 1; j <= qtd_a; j++) {
              achou=0;
         
          for (j = 1; j <= qtd_b; j++) 
                  if (vetA[i] == vetB[j]) {
                      achou =1;
                  }
              if (achou == 0){
                  qtd_d=qtd_d+1;
                  vetD[qtd_d] = vetA[i];
                    }
                 }
          } 
           for (j=1;j<=qtd_d;j++){
                   System.out.print("Vetor Diferença!!" +vetD[j]);
           }
        
    }
}

}
 
