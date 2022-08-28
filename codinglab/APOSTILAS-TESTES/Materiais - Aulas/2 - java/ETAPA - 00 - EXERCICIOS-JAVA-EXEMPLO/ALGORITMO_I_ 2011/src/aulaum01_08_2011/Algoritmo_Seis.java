/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aulaum01_08_2011;

import java.util.Scanner;

/**
 *
 * @author gelvazio
 * Algoritmo_Seis
 * Escreva um algoritmo que leia 2 valores inteiros representando respectivamente
 * hora e minutos.INforme o tempo em minutos e segundos.Ex: 210 minutos
 *                                                        12600 segundos
 */
public class Algoritmo_Seis {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int h,m,th,ts,ftm,fts;

    System.out.println("Digite as horas:");
    h=entrada.nextInt();
    System.out.println("Digite os minutos:");
    m =entrada.nextInt();
    th = (h * 60) * 60;
    ts = (m * 60);
    fts = th + ts;


    ftm =fts/60;

    System.out.println("O total de segundos é:"+fts);
    System.out.println("O total de minutos é:"+ftm);
    }

}
