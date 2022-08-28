/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_24_10_2011;

import java.util.Scanner;

/**
 *
 * @author aluno
 * 1. Ler um vetor C de 10 elementos inteiros, 
 * trocar todos os valores negativos do vetor C por 0. Escrever o vetor C modificado
 */
public class Exercicio_um {
    public static void main(String[] args) {
      Scanner entrada = new Scanner (System.in);
      int vet[] = new int[10];
      int a=0,i=0,neg=0;
      
      for (i=0;i<3;i++){
      System.out.println("Digite um valor para o vetor");
      vet [i]=entrada.nextInt();
      if (vet[a] < 0){
          vet[a]=0;
         
      }else{
          vet[a]=vet[a];
      }
    }
      System.out.println("Vetor "+vet[i]);
    
}
}