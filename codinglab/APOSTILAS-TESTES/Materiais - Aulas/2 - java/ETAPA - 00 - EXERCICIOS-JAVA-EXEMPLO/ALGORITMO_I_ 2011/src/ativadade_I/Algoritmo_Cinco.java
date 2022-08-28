package ativadade_I;

import java.util.Scanner;

/**
 *
 * @author gelvazio
 *
5) Faça um programa que leia um número inteiro e imprima o seu antecedente
 * (inteiro anterior) e o seu sucessor (inteiro posterior).
 */
public class Algoritmo_Cinco{
     public static void main(String[] args) {
         Scanner entrada = new Scanner (System.in);
      int n,ant,suc;

      System.out.println("Digite o numero:");
      n = entrada.nextInt();
      ant = (n -1);
      suc = n +1;


      System.out.println("O antecessor do numero é :"+ant);
      System.out.println("O antecessor do numero é :"+suc);


    }}


