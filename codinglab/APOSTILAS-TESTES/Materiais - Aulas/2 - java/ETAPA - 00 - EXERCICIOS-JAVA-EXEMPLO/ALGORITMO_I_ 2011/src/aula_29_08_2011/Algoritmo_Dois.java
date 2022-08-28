/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aula_29_08_2011;

import java.util.Scanner;

/*
 * Exercicio_Dois
 * 1)Executar a serie: S = 1 + (1/2)+(1/3)+(1/4)+...+(1/100)
 *
 *
 * S = 1/1 + (1/2)+(1/3)+(1/4)+...+(1/6)
 * Resultado = 1 + 0.5 + 0,33 +0.25+ 0.20+0.16
 *RES = 1,5 + 0,58+ 0,2+0,16
 * res = 2,44
 *
 *
 *
 *
 */

public class Algoritmo_Dois {
  public static void main(String[] args) {
        double s=0,cont1,cont2,cont3;
            cont1=1;
            cont2=1;
            cont3=1;
        //S = (1/1) + (1/2)+(1/3)+(1/4)+...+(1/100)
            for (cont2=1;cont2<=100;cont2++)
           
            s=(cont1/cont2)+s;
            
            System.out.println("Resultado um "+s);
           /*
            cont1++;
            System.out.println("Resultado dois "+cont1);
            s= s+1;
            System.out.println("Resultado tres "+s);
            *
            *
            * 
            */
    }
}
    
 
    

 
