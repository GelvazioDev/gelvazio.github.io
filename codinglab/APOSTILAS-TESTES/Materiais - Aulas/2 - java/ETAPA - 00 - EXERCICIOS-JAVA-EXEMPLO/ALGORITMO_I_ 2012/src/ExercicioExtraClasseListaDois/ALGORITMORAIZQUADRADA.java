/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioExtraClasseListaDois;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class ALGORITMORAIZQUADRADA {
    public static void main (String args []){
        Scanner entrada=new Scanner (System.in);
        double x=0,n=0;
        int i=0;
        
        {
            System.out.println("Digite o numero para calcular a raiz quadrada: ");
            n=entrada.nextDouble();
            x=n/2;
            for (i=0;i<20;i++){
                x=((x*x)+n)/(2*x);
            }
            System.out.println("Resultado: "+x);
            
        }
    }
    
}
