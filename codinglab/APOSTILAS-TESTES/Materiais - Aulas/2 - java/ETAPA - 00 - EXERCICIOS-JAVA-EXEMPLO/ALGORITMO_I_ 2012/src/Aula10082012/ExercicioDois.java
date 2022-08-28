/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula10082012;

import java.util.Scanner;

/**
 *
 * Faca um algoritmo que leia quatro valores
 * INTEIROS  e escreva o maior deles..
 */
public class ExercicioDois {
   public static void main(String[] args) {
  Scanner entrada = new Scanner (System.in); 
   int n1=0,n2=0,n3=0,n4=0;
   int maior=0;//Esta variavel ira armazenar o maior numero
   System.out.println("Digite o primeiro numero");
   n1=entrada.nextInt();
   System.out.println("Digite o segundo numero");
   n2=entrada.nextInt();
   System.out.println("Digite o terceiro numero");
   n3=entrada.nextInt();
   System.out.println("Digite o quarto numero");
   n4=entrada.nextInt();
   
   if ((n1>n2) & (n1>n3)&(n1>n4)){
       maior=n1;
   }
    if ((n2>n1) & (n2>n3)&(n2>n4)){
       maior=n2;
   }
     if ((n3>n2) & (n3>n1)&(n3>n4)){
       maior=n3;
   }
      if ((n4>n2) & (n4>n1)&(n4>n3)){
       maior=n4;
   }
     
   System.out.println("O maior numero e o numero: "+maior); 
   
   }
}
