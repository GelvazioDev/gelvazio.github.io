/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ativadade_I;

import java.util.Scanner;

/**
 *
 * @author gelvazio
 *
8) Faça um programa que leia dois valores inteiros representando,
 * respectivamente, um valor de hora e um de minutos e
 * informe quantos minutos se passaram deste o início do dia. Exemplo:
valores lidos : 13 15
impressão : 795 minutos

 */
public class Algoritmo_Oito {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int h,m,t;
        System.out.println("Digite as horas:");
        h = entrada.nextInt();
        System.out.println("Digite os minutos:");
        m = entrada.nextInt();
        t = (h * 60) + m;
        System.out.println("Passaram-se:"+t+" minutos do dia!");
        }

}
