/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_29_08_2011;

import java.util.Scanner;

/**
 *
 * @author gelvazio
 * Tendo 40 pessoas e informadas as respectivas alturas delas,
 * informe a maior altura, a menor altura  e a altura media homes e media altura mulheres
 */
public class Algoritmo_Quinze {
    public static void main(String[] args) {
        Scanner entrada =new Scanner (System.in);
        double i,alt,cont_h=0,cont_m=0,s_h=0,s_m=0,ma=0,me=0;
        String s;
        for (i=1;i<=40;i++){
            System.out.println("Digite a altura:");
            alt=entrada.nextDouble();
            System.out.println("Digite o sexo, sendo m para mulher e m para homen ");
            s = entrada.next();
            if (alt>ma){
                ma=alt;
            }
            if (alt < me){
                me=alt;
            }
            if (s.equals("m")){
                cont_h++;
                s_h=s_h+alt;
            }
            else{
                cont_m++;
                s_m=s_m+alt;
            }
        }
        System.out.println(ma+me);
        System.out.println(s_h/cont_h);
        System.out.println(s_m/cont_m);
        
    }
    
}
