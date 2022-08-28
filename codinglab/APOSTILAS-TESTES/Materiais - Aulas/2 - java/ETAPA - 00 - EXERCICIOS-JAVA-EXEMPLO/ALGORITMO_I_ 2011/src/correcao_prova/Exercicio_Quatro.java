/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package correcao_prova;

import java.util.Scanner;

/**
 *
 * @author aluno
 * 
 * Media da idade de 200 pessoas 
 * qtos é maior qe 18
 */
public class Exercicio_Quatro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double i=0,s=0,idade=0,media=0,cont=0;
        for (i=0;i<200;i++){        
            System.out.println("Digite o taotal de venda:");
            idade=entrada.nextInt();
            s=s+idade;
            if (idade <18){
                cont++;
            }
        }
            System.out.println("Média:"+cont);
            System.out.println("Média:"+media);
            
            
            
    }
}
