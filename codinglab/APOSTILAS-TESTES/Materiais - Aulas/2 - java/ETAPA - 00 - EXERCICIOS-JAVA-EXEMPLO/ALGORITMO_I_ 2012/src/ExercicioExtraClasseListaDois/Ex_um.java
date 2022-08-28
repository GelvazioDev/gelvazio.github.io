/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioExtraClasseListaDois;

import java.util.Scanner;

/**
 *
 * @author aluno
 * 1. Sendo H = 1 + ½ +1/3 + ¼ + ... + 1/N, 
 * faça um algoritmo para calcular H, sendo que N é digitado pelo usuário.
 * Teste
 * Para um n=4
 * S=1+(1/2)+(1/3)+(1/4)
 * S=1+0,5+0,33+0,25
 * S=1,88+0,25
 * S=2,13
 */
public class Ex_um {
    public static void main(String args[]){
        Scanner entrada=new Scanner (System.in);
        double res=0,i=0,n=0;
        System.out.println("Digite um numero: "); 
        n=entrada.nextDouble();
        for(i=1;i<=n;i++){
        res=res+(1/i);     
  
    }
              System.out.println("Resultado: "+res);
    
}}
