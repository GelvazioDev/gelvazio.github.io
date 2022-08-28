/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioExtraClasseListaDois;

import java.util.Scanner;

/**
 *
 * @author aluno
 * 3. Fazer um algoritmo para ler um número real X e determinar e imprimir 
 * o seguinte somatório: S = X – X/1 + X/2 – X/3 + ...
 * usando os 20 primeiros termos da série
 */
public class Ex_tres {
    public static void main(String args []){
        Scanner entrada= new Scanner (System.in);
        double x=0,res=1,i=0;
        System.out.println("Digite um numero; ");
        x=entrada.nextDouble();
        for (i=0;i<20;i++){
            res=res+(x/i);            
        }
        System.out.println("Resultado: "+res);
        
    }
    
}
