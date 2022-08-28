/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AULA17082012;

import java.util.Scanner;

/**
 * @author geo
 * FACA UM ALGORITMO QUE LEIA UM NUMERO QUALQUER E DETERMINE AS 
 * SUAS CARACTERISTICAS:
 * PAR OU IMPAR,
 * POSITIVO,NEGATIVO OU NULO(ZERO NULO)
 * 
 */
public class EXERCICIOUM {
   public static void main(String[] args){
        Scanner entrada= new Scanner (System.in); 
        int n1=0;
        int resto=0;
        int r=0;
        int par=0;
        int positivo=0;
        int negativo=0;
        int nulo=0;
        
     
System.out.println("Digite o numero:");
    n1=entrada.nextInt();
    
    if (n1>0){
        positivo=1;
        negativo=0;
    }
    else {
        positivo=0;
        negativo=1; 
    }
    if (positivo==0){
      System.out.println("O numero e Positivo ");  
    }
        
    r=n1/2;
    System.out.println("Valor do R "+r);  
    resto=n1-r;
    par=resto;
    System.out.println("Valor do RESTO "+resto);
 
    
    if(par==0){
        System.out.println("O numero e Par!!"); 
      }
    else {
      System.out.println("O numero e Impar!!");  
    }
     
   }
       /*else if (resto != 0){
        System.out.println("O numero e Par!!");     
    }
     * 
     */
    
   }
/*
//ALGRITMO DO BASTOS
ALGORIMTO NUMERO
 * IN N;
 * {
 * SE (N>0){
 *      SE ((N%2)==0){
 *      ESCREVA("POSITIVO E PAR")
 * }
 * SENAO SE (N==0){
 *     ESCREVA("POSITIVO E IMPAR") 
 * }   
 * }
 * SENAO SE (N==0){
 *      SE ((N%2)==0){
 *      ESCREVA("NEGATIVO E PAR")
 * }
 * SENAO SE (N==0){
 *     ESCREVA("NEGATIVO E IMPAR") 
 * }   
 * }
 * 
 */
   
   
    

