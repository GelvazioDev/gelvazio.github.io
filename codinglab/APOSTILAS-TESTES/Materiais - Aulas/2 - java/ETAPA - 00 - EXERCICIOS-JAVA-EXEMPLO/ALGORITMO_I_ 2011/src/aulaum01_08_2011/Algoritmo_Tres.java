/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulaum01_08_2011;

import java.util.Scanner;

/**
 *
 * @author gelvazio
 * Algoritmo_Tres
 * Escreva um algoritmo que calcule a area e o perimetro de um quadrado e informe
 * qual dos dois valores é o maior.
 */
public class Algoritmo_Tres {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int l,sa,sp,maior;

    System.out.println("Digite a o tamanho do lado do quadrado:");
    l=entrada.nextInt();

    sp = 4 * l;
    sa = l * l;
    if (sp > sa){
        maior =  sp;
        System.out.println("O maior é o Perimetro: "+maior);
    }
 else{
        maior = sa;
        System.out.println("O maior é a Àrea: "+maior);
 }
      
}
}



