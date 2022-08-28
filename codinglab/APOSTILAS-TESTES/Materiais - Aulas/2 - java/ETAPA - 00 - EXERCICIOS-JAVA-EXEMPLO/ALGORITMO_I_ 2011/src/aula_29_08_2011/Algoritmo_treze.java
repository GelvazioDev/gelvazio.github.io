/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_29_08_2011;

import java.util.Scanner;

/**
 *
 * @author gelvazio
 * 
 * Dizer quando um numero for perfeito
 * So é perfeito quando a soma dos divisores for igual a ele mesmo.
 */
public class Algoritmo_treze {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double s=0,i=0,n=0;
        System.out.println("Digite o numero:");
        n=entrada.nextInt();
        
        for (i=1;i<=n/2;i++){
            if ((n%i)==0){
                s=s+i;
            }
        }
        if ((n==1) || (s==n)){
            System.out.println("Quadrado Perfeito");
        }
        else{
            System.out.println("Não é quadrado perfeito!");
        }
    }
    
}
