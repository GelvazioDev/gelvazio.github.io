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
 * Exercicios
 * 5-S=(1/n)+(2/n-1)+(3/n-2) + ...(n-1/2) + n
 *
 *   S= 1   +    2   +   3    +      ...           n-1    +   n - 0  + n - - 1
 *     n      n-1     n-2    n-3   ...               2          1     +   2
 *
 * Se n =5
 * S = (1/5) + (2/(5-1))+ (3/(5-2)) + (4/(5-3)) + (5/5-4)+ (6/5-5) + (5-1/2) +5
 * S = 0,2 +    (0,5) +    (3/-3)   + (4 / 2)    +  (5/1) + (6/0) + (4/2) + 5
 * S =  0,7 +               (-1) +        2      +   5   + 0 + 2 + 5;
 * S = 1,7+ 5 +7
   S = 13,7
 *
 * 
 */
public class Algoritmo_Cinco {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double s=0,n,i,cont1,cont2,cont3;


        cont1=-1;
        
        System.out.println("Digite o numero:");
        n=entrada.nextInt();
             for(i=1;i<n;i++){
                s= s + (i/(n-i +1));
                s=cont1;
            
        }System.out.println("Resultado Um"+s);
    }
}


