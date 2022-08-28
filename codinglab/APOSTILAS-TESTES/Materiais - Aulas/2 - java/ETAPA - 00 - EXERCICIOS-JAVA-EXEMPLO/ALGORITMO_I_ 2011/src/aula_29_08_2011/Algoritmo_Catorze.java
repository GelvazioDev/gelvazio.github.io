/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_29_08_2011;

import java.util.Scanner;

/**
 *
 * @author gelvazio
 * Ler 5 numeros inteiros e achar o maior e o menor.
 */
public class Algoritmo_Catorze {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double ma=0,me=0,n=0,i=0;
        for (i=1;i<=4;i++){
            System.out.println("Numero");
            n=entrada.nextDouble();
            if (n>ma){
                ma=n;
            }
            if (n<me){
                me=n;
            }
        }
        System.out.println(ma+me);
        
    }
    
}
