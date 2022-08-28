/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioExtraClasseListaUm;

import java.util.Scanner;

/**
 *
 * @author aluno
 * 11) Faça um programa que leia um valor 
 * representando o gasto realizado por um cliente 
 * do restaurante COMABEM e imprima o valor total a ser pago, 
 * considerando os 10% do garçom.
 */
public class Exercicio_doze {
    public static void main (String args []){
        Scanner entrada=new Scanner (System.in);
        double preco=0,garcom=0.1,total=0;
        System.out.println("Digite o valor gasto pelo cliente: ");
        preco=entrada.nextDouble();
        total=preco+(preco*garcom);//10 % do Garçom
        System.out.println("Total a ser pago pelo cliente: "+total);
    }
    
}
