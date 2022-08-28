/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AULA17082012;

import java.util.Scanner;

/**
 *
 * @author geo
 * ESCREVA UM ALGORITMO QUE LEIA UM NUMERO INTEIRO,ESCREVA OS SEUS 20 ANTECESSORES
 *  E OS SEUS 20 SUCESSORES PARES.
 */
public class EXERCICIOCINCO {
     public static void main (String []args){
        Scanner entrada = new Scanner (System.in);
    int n=0,ant=0,suc=0,i;
    System.out.println("Numero: ");
    n=entrada.nextInt();
    for (i=0;i<20;i++){
    suc=n+i;
    suc++;   
    System.out.println("Sucessor: "+suc);
    }
    for (i=0;i<20;i++){
    ant=n-i;
    ant--;
    System.out.println("Antecessor: "+ant);
    }     
}}
