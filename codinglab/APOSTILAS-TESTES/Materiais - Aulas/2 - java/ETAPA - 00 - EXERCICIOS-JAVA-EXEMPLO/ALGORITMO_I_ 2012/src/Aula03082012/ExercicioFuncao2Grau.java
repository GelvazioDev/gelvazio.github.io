/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula03082012;

import java.util.Scanner;

/**
 *8-Faca um algoritmo que calcule o resultado da seguinte equação:
 * (x elevado ao 3)+(2x elevado a 2)+6.
 *Usar a funcao Math.pow
 */
public class ExercicioFuncao2Grau {
  public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
  double x=0;
  double res=0;

  
  //Conta (x elevado ao 3)+(2x elevado a 2)+6
  //x ao cubo=2x elevado a 2 + 6
  //
  System.out.println("digite numero");
    x=entrada.nextDouble();
  res=((Math.pow(x,3))+(2*(Math.pow(x,2))+6));
    System.out.println("Resultado: "+res);
   }
}
