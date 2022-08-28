/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package correcao_prova;

import java.util.Scanner;

/**
 *
 * @author aluno
 * Prestação.
 * Calcule o salario do mes de um funcuionario.
 * O funcionario gangha 3000, mais 500 reais por carro vendido,
 * mais 5% do valor total de cada carro vendido.
 * Quanto o funcionario ganha ao fim do mes?
 */
public class Exercicio_Tres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double salario=3000,com1=500,com2=0.05,carro=0,i=0,total=0,preco=0,tot=0;
        String nome;  
        System.out.println("Digite nome do carro:");
        nome=entrada.next(); 
        System.out.println("Digite quantos carros vendeu no mes:");
        carro=entrada.nextDouble();
       
        System.out.println("Digite o taotal de venda:");
        tot=entrada.nextDouble(); 
        total=salario+(com1*carro)+com2*tot; 
        System.out.println("O salario do mes do funcionario é :"+total);  
    }
}

