/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AULA17082012;


/**
 *
 * @author geo
 * ESCREVA UM ALGORITMO QUE ESCREVA O VALOR DE S PARA A SEGUINTE SERIE.
 * S= 1 + 1 + 1 + 1 + 1 ... 1
 *        2   3   4   5     99
 */
public class EXERCICIOSETE {
    public static void main (String []args){
    double s=1,r,soma=0;
    int i;
     

    for (i=1;i<5;i++){
        r=s/i;
        System.out.println("Valor de R: "+r);
        soma=soma+r;
            
    }
   System.out.println("Resultado: "+soma);
}}
