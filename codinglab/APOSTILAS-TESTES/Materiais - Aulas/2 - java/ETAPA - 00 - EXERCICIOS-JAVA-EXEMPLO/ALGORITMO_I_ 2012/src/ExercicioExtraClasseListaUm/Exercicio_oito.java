/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioExtraClasseListaUm;

import java.util.Scanner;

/**
 *
 * @author aluno
 * 8) Faça um programa que leia dois valores inteiros representando, 
 * respectivamente, um valor de hora e um de minutos e informe quantos minutos se passaram deste o início do dia. Exemplo:
valores lidos : 13 15
impressão : 795 minutos

 */
public class Exercicio_oito {
    public static void main(String[] args) {
 Scanner entrada = new Scanner (System.in); 
 int h,m,total;

System.out.println("Digite a hora:");
h=entrada.nextInt();// entrada=14:45 saida  =22:24
System.out.println("Digite o minuto:");
 m=entrada.nextInt();
 
 total=(h*60)+m;
 System.out.println("Total de minutos e :"+total);
}
}
