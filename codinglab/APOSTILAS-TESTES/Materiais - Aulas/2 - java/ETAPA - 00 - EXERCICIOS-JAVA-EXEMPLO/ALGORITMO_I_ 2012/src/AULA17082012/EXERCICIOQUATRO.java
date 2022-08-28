/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AULA17082012;

import java.util.Scanner;

/**
 *
 * @author geo
 * FACA UM ALGORITMO,PARA LER 100 NUMEROS,CONTAR QUANTOS SAO POSITIVOS,
 * QUANTOS SAO IMPARES, QUANTOS SAO NEGATIVOS E PARES AO MESMO TEMPO,
 * E ENCONTRAR A MEDIA DESTES NUMEROS.TODOS OS CALCULOS 
 * PROCESSADOS DEVERAO SER IMPRESSOS.
 */
public class EXERCICIOQUATRO {
      public static void main (String []args){
        Scanner entrada = new Scanner (System.in);
        int posi=0,neg=0,par=0,impar=0,i=0,n=0,negpar=0,soma=0,r=0;
        double media=0;

        
        
        for (i=0;i<5;i++){
        System.out.println("Digite o "+i+ "numero");
        n=entrada.nextInt();
       if (n>0){
        r=n%2;//r armazena o resto da operacao,se ele for zero e par,senao e impar
       // System.out.println("Valor de R "+r);
       if (r==0){
           posi++;
           par++;
           soma =soma +n;
  }
  else if(r!=0){
           posi++;
           impar++; 
           soma =soma +n;
  }   
  }
  if (n<0){
       if (n % 2==0){
           neg++;
           par++;
           negpar++;
           soma =soma +n;
  }
       else if (n % 2 !=0){
           neg++;
           impar++;
           soma =soma +n;
 } 
        }
        
        
      }
        media=soma/i;
    System.out.println("Numeros Positivos: "+posi);
    System.out.println("Numeros Impares: "+impar);
    System.out.println("Numeros Pares: "+par);
    System.out.println("Numeros Negativos: "+neg);
    System.out.println("Numeros Negativos e Pares: "+negpar);
    System.out.println("Media: "+media);

      }}