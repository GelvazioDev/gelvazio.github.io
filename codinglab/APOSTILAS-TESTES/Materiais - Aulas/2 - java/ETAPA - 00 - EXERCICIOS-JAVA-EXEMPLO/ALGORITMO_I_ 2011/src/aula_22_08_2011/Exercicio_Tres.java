/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_22_08_2011;

import java.util.Scanner;

/**
 *
 * @author aluno
 * 


Exercicio_tres
Desenvolva um algoritmo que leia o preço de tres mercadorias em julho e agosto de 2011.
Com base na variação do periodo, calcule a inflação


 */
public class Exercicio_Tres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double m1j,m2j,m3j,ij,m1a,m2a,m3a,ia,it,i1,i2,i3;
        
        System.out.println("Digite o preco da mercadoria Um em julho:");
        m1j = entrada.nextDouble();
        System.out.println("Digite o preco da mercadoria Dois em julho:");
        m2j = entrada.nextDouble();
        System.out.println("Digite o preco da mercadoria Tres em julho:");
        m3j = entrada.nextDouble();
        
        System.out.println("Digite o preco da mercadoria Um em Agosto:");
        m1a = entrada.nextDouble();
        System.out.println("Digite o preco da mercadoria Dois em Agosto:");
        m2a = entrada.nextDouble();
        System.out.println("Digite o preco da mercadoria Tres em Agosto:");
        m3a = entrada.nextDouble();
        
        /*
        m1j = 100
         * 
         * 10
         * 11
         * 
         * 10
         * 15
         * 
        m1a = x
        x= (m1a*100)/m1j)
         * 
         * Teste de mesa
         * m1j = 20
         * m2j = 30
         * m3j = 40
         * 
         * m1a = 22
         * m2a = 34
         * m3a = 47
         * 
         * 
         * i1 = ((22 * 100)/20;
         * i2 = ((34 * 100)/30;
         * i3 = ((47 * 100)/40;
         * it = (110+113,33+117,5)/3;
         * it = 113,61
        
         * 
         */
        i1 = ((m1a*100)/m1j);
        
        i2 = ((m2a*100)/m2j);
        
        i3 = ((m3a*100)/m3j);
        
        it = ((i1+i2+i3)/3);
        
        
        
        
        
        
        System.out.println("A inflação no período de julho a agosto acumulada foi de  :"+it);
               
        
        
    }
    
}
