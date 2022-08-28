/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AULA17082012;

import javax.swing.JOptionPane;

/**
 * @author geo
 * A POPULACAO DE UMA CIDADE A E DE 50 MIL HABITANTES.
 * E CRESCE A UMA TAXA DE 4 % AO ANO.
 * UMA CIDADE B TEM POPULACAO DE 60 MIL HABITANTES E CRESCE
 * A UMA TAXA DE 1,5 % AO ANO.
 * QUANTO TEMPO LEVARA PARA A POPULACAO CIDADE A ULTRAPASSAR A CIDADE B 
 */
public class EXERCICIONOVE {
     public static void main (String [] args){
         String A,B;
         double txa=0.04,txb=0.015,popa=50000,popb=60000;
         int ano=0;
         int i;
         for (i=0;i<10;i++){
         popa=popa+((50000*txa)*ano);
         popb=popb+((60000*txb)*ano);
         ano++;
         System.out.println("Ano: "+ano);
         
         if (popa<popb){
             System.out.println("Populacao de B ainda é maior: "+popb+" no tempo de: "+ano+" Anos");
             System.out.println("Populacao de A: "+popa);
             //System.JOptionPane("teste"+popa);
         }
         if (popa>popb){
    System.out.println("Populacao de A é maior: "+popa+" no tempo de: "+ano+" Anos");
    System.out.println("Populacao de B: "+popb);
}
    
}  
     
     }
    
}
