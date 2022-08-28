/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AULA17082012;


/**
 *
 * @author geo
 *  * ESCREVA UM ALGORITMO QUE ESCREVA O VALOR DE S PARA A SEGUINTE SERIE.
 * S= 36*37 + 37*38 + 38*39 +... P/20 TERMOSS
 *      35      36      37 
 */
public class EXERCICIOOITO {
    public static void main (String [] args){
    double s=0,cont,i=0;
    {
        cont=36;
    }
    for (i=0;i<3;i++){
      s=s+(cont*(cont+1)/(cont-1));
      cont++;
    }  
   System.out.println("Resultado "+s);
        
}}
