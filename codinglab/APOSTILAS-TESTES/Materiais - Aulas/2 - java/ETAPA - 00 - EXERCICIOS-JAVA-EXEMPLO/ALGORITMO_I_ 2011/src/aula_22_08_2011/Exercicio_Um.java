
package aula_22_08_2011;

import java.util.Scanner;
import java.lang.Math.*;

/**
 *
 * @author aluno
 * Exercicio_Um
Faça um algoritmo qeu calcule o volume de uma esfera.
Formula = V = 4 * PI  * R ao cubo

 */
public class Exercicio_Um {
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        double n =0,v=0,r=0,res=0;
        System.out.println("Digite o raio da esfera");
        r= entrada.nextDouble();
        
        v
                = ((4  * Math.PI) * (Math.pow(r,3)));
        
        
        
        System.out.println("O volume da esfera é : "+r);
        
    }
    
}
