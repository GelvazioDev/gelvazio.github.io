/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_29_08_2011;

/**
 *
 * @author gelvazio
 * Determinado pais tem populacao de 5 milhoes de habitantes tem população de 5 milhões de pesoas
 * com taxa de natalidade de 4 % e mortalidade de 1,1 %.Um segundo pais tem 7 milhoes 
 * natalidade de 2% e mortalidade de 0,8% .
 * Em quanto tempo o pais um ira ultrapassar o pais dois.
 * População9 milhões
 * 21 anos
 * 
 */
public class Algoritmo_Dez {
    public static void main(String[] args) {
        double i=0,contaano2=0,contaano1=0,cont=0,tn1=0.4,tm1=0.011,pop1=5000000,pop2=7000000,tn2=0.02,tm2=0.008,povo1=0,povo2=0;
        
        contaano1=0;

        while (povo1<=povo2){
        pop1=pop1+((tn1*pop1) -(tm1 *pop1));
        pop2=pop2+(tn2*pop2)-(tm2*pop2);
        contaano1++;
         }
       
         System.out.println("Tempo que levou para passar:"+contaano1); 
         System.out.println("População atual:"+povo1);  
      } 
    } 
