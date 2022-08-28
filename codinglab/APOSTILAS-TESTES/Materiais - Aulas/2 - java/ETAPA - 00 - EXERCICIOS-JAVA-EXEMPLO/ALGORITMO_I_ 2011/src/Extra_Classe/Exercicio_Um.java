
package Extra_Classe;

import java.util.Scanner;

/**
 *
 * @author aluno
 * 1. Ler um vetor A de 10 elementos inteiros, trocar todos os valores negativos
 * do vetor C por 0. Escrever o vetor C modificado
 * Exemplo:
 * Vetor A  = 1 -8 6 9 -6 7
 * Vetor B = 1  0 6 9 0 7

 */
public class Exercicio_Um {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int vetA [] = new int[10];
        int vetB [] = new int[10];
        int qtd_a,qtd_b=0,i,j=0;
         {
            System.out.println("Digite quantidade de A");
            qtd_a=entrada.nextInt();

            for (i=1;i<=qtd_a;i++){
               System.out.println("Digite o valor do vetor A");
               vetA[i]=entrada.nextInt();

            if(vetA[i] < 0){
                 qtd_b++;
                    vetB[i]=0;

                }
            if (vetA[i] >= 0){
                  // qtd_b = qtd_b +1;
                 qtd_b++;
                   vetB[j]=vetA[i];

               }
            }
            for(j=1;j<=qtd_b;j++){
                System.out.print( " " +vetB[j]);
            }

         }

    }

}
