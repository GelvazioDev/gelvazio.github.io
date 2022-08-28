/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AULA24082012;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class testeropmano {
  public static void main (String [] args){
    Scanner entrada = new  Scanner (System.in);
    int n=0;
    String romano="";
    int[] numbers = {1000,900,500,400,100,90,50,40,10,9,5,4,1};                                       
    String[] letras = { "M", "CM",  "D",  "CD", "C",  "XC", "L",  "XL",  "X",  "IX", "V",  "IV", "I" };
 System.out.println("Digite o numero:");
 n =entrada.nextInt();
  for (int i = 0; i < numbers.length; i++) {
           while (n >= numbers[i]) {
              System.out.println("Numero:"+n);
              romano += letras[i];
              System.out.println("Romano:"+romano);
              n -= numbers[i];
           }
        }
     System.out.println("Resultado:"+romano);

     }
 
}
