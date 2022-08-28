/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package correcao_prova;

import java.util.Scanner;

/**
 *
 * @author aluno
 * Digite qual é o numero maior.
 */
public class Exercicio_um {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1 = 0, n2 = 0, n3 = 0;
        System.out.println("Digite numero um:");
        n1 = entrada.nextInt();
        System.out.println("Digite numero dois:");
        n2 = entrada.nextInt();
        System.out.println("Digite numero tres:");
        n3 = entrada.nextInt();
        if ((n1 > n2) && (n1 > n3)) {
            System.out.println("Maior é:" + n1);
        } else if ((n2 > n1) && (n2 > n3)) {
            System.out.println("Maior é:" + n2);
        } else {
            System.out.println("Maior é:" + n3);
        }
    }
}
