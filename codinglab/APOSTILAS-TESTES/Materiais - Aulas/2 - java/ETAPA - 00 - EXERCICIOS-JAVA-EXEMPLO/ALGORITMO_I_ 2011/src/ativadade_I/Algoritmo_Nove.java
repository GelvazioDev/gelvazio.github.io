package ativadade_I;

import java.util.Scanner;

/**
 *
 * 9) Faça um programa que leia o horário de entrada (hora e
 * minuto) e o horário de saída (hora e minuto) de um empregado e imprima quanto
 * tempo, no formato hora:minuto, o empregado ficou na empresa.
 */
public class Algoritmo_Nove {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int he, hs, me, ms, te, ts, ft, fts, ftm, ft2, ts1, ts2;
        System.out.println("Digite a hora de entrada:");
        he = entrada.nextInt();
        System.out.println("Digite os minutos de entrada:");
        me = entrada.nextInt();
        System.out.println("Digite a hora de saída:");
        hs = entrada.nextInt();
        System.out.println("Digite os minutos de de saída:");
        ms = entrada.nextInt();
        if (he < hs) {
            te = (he * 60) + me;
            ts = (hs * 60) + ms;
            ft = ts - te;
            ftm = ft % 60;
            ft2 = (ft / 60);
            System.out.println("O total ft é:" + ft);
            System.out.println("O total ftm é:" + ftm);
            System.out.println("O total ft2 é:" + ft2);
            System.out.println();
            System.out.print("O funcionario ficou na empresa " + ft2);
            System.out.print(" : horas " + ftm + " minutos");
        } else {
            ts1 = (24 * 60) - (he * 60 + me);
            ts2 = (hs * 60) + ms;
            fts = ts2 + ts1;
            ftm = fts % 60;
            ft2 = (fts / 60);
            System.out.println("O total ft é:" + fts);
            System.out.println("O total ftm é:" + ftm);
            System.out.println("O total ft2 é:" + ft2);
            System.out.println();
            System.out.print("O funcionario ficou na empresa " + ft2);
            System.out.print(" : horas " + ftm + " minutos");
        }
    }
}
