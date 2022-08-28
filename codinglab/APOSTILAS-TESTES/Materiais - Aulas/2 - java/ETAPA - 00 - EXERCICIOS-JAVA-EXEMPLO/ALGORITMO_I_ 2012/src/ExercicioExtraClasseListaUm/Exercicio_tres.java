/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioExtraClasseListaUm;

/**
 *
 * @author aluno
 * 3) Faça um programa que imprima a soma, a diferença, 
 * o produto e a divisão entre os números inteiros 21 e 42.
 */
public class Exercicio_tres {
    public static void main (String args []){
        double n1=21,n2=42,soma=0,diferenca=0,produto=0,divisao=0;
        soma=n1+n2;
        diferenca=n1-n2;
        produto=n1*n2;
        divisao=n1/n2;
        System.out.println("Soma: "+soma);
        System.out.println("Diferença: "+diferenca);
        System.out.println("Produto: "+produto);
        System.out.println("Divisão: "+divisao);
                
    }
    
}
