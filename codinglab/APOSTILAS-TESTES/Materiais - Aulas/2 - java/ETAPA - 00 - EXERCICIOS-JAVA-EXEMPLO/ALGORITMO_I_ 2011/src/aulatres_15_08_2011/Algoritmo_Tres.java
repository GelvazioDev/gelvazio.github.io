/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulatres_15_08_2011;

import java.util.Scanner;
import java.math.*; 

/**
 *
 * @author gelvazio
 */
public class Algoritmo_Tres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n1,n2,n3,x1=0,x2=0,aux1,aux2;
        System.err.println("Digite o numero um");
        n1 = entrada.nextDouble();
        System.err.println("Digite o numero dois");
        n2 = entrada.nextDouble();
         System.err.println("Digite o numero tres");
        n3 = entrada.nextDouble();

        if (n1 != 0 && n2 != 0 && n3 != 0){
            
            aux1 = Math.pow(n2,2);
            x1 = -n2 +( Math.sqrt (aux1 - 4 * n1 * n3))/2*n1;
            aux2 = Math.pow(n2,2);
            x2 = -n2 -( Math.sqrt (aux2 - 4 * n1 * n3))/2*n1;
            
        
        }
 else {
            System.out.println("O numero nao é diferente de zero");
 }
System.out.println("Resultado UM R1 "+x1);
System.out.println("Resultado UM R2 "+x2);



    }

}
