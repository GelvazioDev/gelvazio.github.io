/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AULA17082012;

/**
 *
 * @author geo
 * FACA UM ALGORITMO QUE ESCREVA O VALOR DE S
 * PARA A SEGUINTE SERIE
 * S=1+2+3+4+5...100
 * 
 */
public class EXERCICIOSEXTO {
    public static void main (String []args){
    int i=0,s=0,n=0,soma=0;
        n=1;
        for(i=0;i<100;i++){     
      s=n+i;
      soma=soma+s;
    }
    System.out.println("Resultado: "+soma);
}
}