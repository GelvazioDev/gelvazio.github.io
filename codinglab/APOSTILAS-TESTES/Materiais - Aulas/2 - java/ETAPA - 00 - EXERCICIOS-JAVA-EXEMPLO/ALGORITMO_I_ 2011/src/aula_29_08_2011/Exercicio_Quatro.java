/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aula_29_08_2011;

/**
 *
 * @author gelvazio
 *
 * Executar a serie:
 * S = (1/100)+ (4/90)+(9/80)+ ... (100/10)
 * S =
 *
 *
 */
public class Exercicio_Quatro {
    public static void main(String[] args) {
        double s=0,i,d=0,cont1=0,cont2=0,cont3=0;

        d=10;
        for (i=1;i<=6;i++){
              s=s+(i * i)/d;
              d=d-10;
        }
       System.out.println("Resultado:"+s);

        
    }

}

