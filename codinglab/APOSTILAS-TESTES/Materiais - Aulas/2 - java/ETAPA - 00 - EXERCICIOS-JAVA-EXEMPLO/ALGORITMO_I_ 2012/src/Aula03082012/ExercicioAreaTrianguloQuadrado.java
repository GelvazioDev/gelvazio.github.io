/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula03082012;

import java.util.Scanner;

/**
 *
 * // Função :
//7-Faca um algoritmo que calcule
//a area de um retanfulo e de um triangulo e informe qual o maior.
//Area do Triangulo=A=(base*h(altura) /2
//Area do quadrado=Lado*lado
 */
public class ExercicioAreaTrianguloQuadrado {
     public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
int lado1,lado2,base,altura,areaquadrado;
double areatriangulo;
System.out.println("Digite a base do triangulo");
base=entrada.nextInt();
System.out.println("Digite a altura do triangulo:");
altura=entrada.nextInt();
System.out.println("Digite o lado Um do quadrado");
lado1=entrada.nextInt();
System.out.println("Digite o lado Dois do quadrado");
lado2=entrada.nextInt();
 areatriangulo=(base*altura)/2;
 areaquadrado=lado1*lado2;
 
 if(areaquadrado>areatriangulo){
    System.out.println("O a figura com maior area e o QUADRADO com area de: "+areaquadrado);
 }
    if(areaquadrado<areatriangulo){
    System.out.println("O a figura com maior area e o TRIANGULO com area de: "+areatriangulo);
 }
  if(areaquadrado==areatriangulo){
    System.out.println("A area dos dois e igual!!");
            }      

    }
}