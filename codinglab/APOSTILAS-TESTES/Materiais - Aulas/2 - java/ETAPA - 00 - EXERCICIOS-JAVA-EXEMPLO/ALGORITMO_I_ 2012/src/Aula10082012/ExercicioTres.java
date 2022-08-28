/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula10082012;

import java.util.Scanner;
/**
 * Faca um algoritmo que leia tres numeros inteiros,
 * e os escreva em ordem crescente.
 */
public class ExercicioTres {
     public static void main(String[] args) {
  Scanner entrada = new Scanner (System.in); 
   int n1=0,n2=0,n3=0;
   int maior=0,menor=0,intermediario=0;
   System.out.println("Digite o primeiro numero");
   n1=entrada.nextInt();
   System.out.println("Digite o segundo numero");
   n2=entrada.nextInt();
   System.out.println("Digite o terceiro numero");
   n3=entrada.nextInt();
   //Encontrar o Maior
   if ((n1>n2) & (n1>n3)){
     maior=n1;   
   }
    if ((n2>n1) & (n2>n3)){
       maior=n2;
   }
     if ((n3>n2) & (n3>n1)){
       maior=n3;
   }
     //Encontrar o menor
      if ((n1<n2) & (n1<n3)){
      menor=n1;   
      }
    if ((n2<n1) & (n2<n3)){
       menor=n2;
   }
     if ((n3<n2) & (n3<n1)){
       menor=n3;
   }
     //Encontrar o intermediario
      if ((n1>n2) &(n1<n3)||(n1<n2) & (n1>n3)){
     intermediario=n1;   
   }
    if (((n2>n1) & (n2<n3))||((n2<n1)&(n2>n3))) {
       intermediario=n2;
   }
     if (((n3>n2) & (n3<n1))||((n3<n2) & (n3>n1))){
       intermediario=n3;
   }
   System.out.println("O menor numero e: "+menor); 
   System.out.println("O numero intermediario e: "+intermediario); 
   System.out.println("O maior numero e: "+maior); 
   
   }  
}
