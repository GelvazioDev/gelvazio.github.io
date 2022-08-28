/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package correcao_prova;

import java.util.Scanner;

/**
 *
 * @author aluno
 * Fazer a traducao das cores, 
 * amarelo=yellow
 * verde=green
 * vermelho=red
 * 
 */
public class Exercicio_dois {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        String cor;
        System.out.println("Digite uma das cores 'vermelho, amarelo,verde':");
        cor=entrada.next();
        if (cor.equals("verde")){
        System.out.println("green!");
        }else if(cor.equals("vermelho")){
        System.out.println("red!");
        }else if(cor.equals("amarelo")){
        System.out.println("yellow!");
    }
  } 
}


