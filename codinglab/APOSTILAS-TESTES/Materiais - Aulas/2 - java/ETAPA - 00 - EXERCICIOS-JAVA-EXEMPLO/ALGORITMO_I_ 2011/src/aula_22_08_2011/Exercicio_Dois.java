
package aula_22_08_2011;

import java.util.Scanner;

/**
 *
 * @author aluno
 * 
 * Exercicio_Dois
Suponha que voce foi ao supermercado e comprou:
 n Kg de café á x reais;
 k litros de leite á y reais;
 m Kg de farinha a z reais;
Faça um algoritmo que imprima o ticket de compra.
Primeiro produto: R$ 0,00
Segundo  //     : R$ 0.00


 */
public class Exercicio_Dois {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double ncafe=0,precocafe=0,kleite=0,precoleite=0,mfarinha=0,precofarinha=0;
        double tc=0,tl=0,tf=0;
        
        System.out.println("Digite quantos Kg de cafe voce comprou: ");
        ncafe = entrada.nextDouble();
        System.out.println("Digite quantos Reais pagou cada  Kg de cafe  que voce comprou: ");
        precocafe = entrada.nextDouble();
        
        System.out.println("Digite quantos litros de leite voce comprou: ");
        kleite = entrada.nextDouble();
        System.out.println("Digite quantos Reais voce  pagou para  cada  litro de leite  que  voce comprou: ");
        precoleite = entrada.nextDouble();
        
        System.out.println("Digite quantos Kg de Farinha voce comprou: ");
        mfarinha = entrada.nextDouble();
        System.out.println("Digite quantos Reais voce  pagou para  cada  Kg de farinha  que  voce comprou: ");
        precofarinha = entrada.nextDouble();
        
        
        tc  = (ncafe * precocafe);
        
        tl = (kleite * precoleite);
        
        tf = (mfarinha * precofarinha);
        
        System.out.println("    CUPOM FISCAL   ");
        System.out.println("Café:         "+tc);
        System.out.println("Leite:        "+tl);
        System.out.println("Farinha:      "+tf);
        
        
        
        
    }
    
}
