/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_15_08_2011;


import java.util.Scanner;
import java.lang.Math.*;

/**
 *
 * @author aluno
 * Fornecido os coeficientes de uma equação do 2 grau,
 * faça um algoritmo que calcule as raizes se houverem
 * 
 */
public class Exercicio_Tres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double a,b,c,r,x1,x2;
        
        System.out.println("Digite o valor do numero Um:");
        a = entrada.nextDouble();
        System.out.println("Digite o valor do numero Dois:");
        b = entrada.nextDouble();
        System.out.println("Digite o valor do numero Tres:");
        c = entrada.nextDouble();
        
        if ((Math.pow(b,2) - ((4 *a)*c))<0){
        System.out.println("Não existe raiz para numero negativo!!!");
        }
        
        if  (((Math.pow(b,2) - ((4 *a *c)) ) > 0) && ((Math.pow(b,2) - ((4 *a *c)) ) == 0)){
        x1 = ((- b)+ Math.sqrt(Math.pow(b,2)-((4 *a)*c))); 
        x2 = ((- b)- Math.sqrt(Math.pow(b,2)-((4 *a)*c)));
        
        
        
         
        System.out.println("O x1 da raiz é "+x1);
        System.out.println("O x2 da raiz é "+x2);
        
    } 
  }
}
