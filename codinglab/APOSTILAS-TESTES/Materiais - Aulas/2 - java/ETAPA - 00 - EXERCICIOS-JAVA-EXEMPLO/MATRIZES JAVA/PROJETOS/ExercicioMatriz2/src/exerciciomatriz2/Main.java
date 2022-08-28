/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exerciciomatriz2;

import java.util.Scanner;

/**
 *
 * @author Gelvazio
 */
public class Main {

    /**
     * /**
     * A11 A12 A13 A14
     * A21 A22 A23 A24
     * A31 A32 A33 A34
     * A41 A42 A43 A44
     *
     * Fazer uma matriz com quatro condições:
     * A-Acima da Diagonal;
     * B-Abaixo Diagonal;
     * C-Diagonal Principal;
     * D-Diagonal Secundaria
     *
     * Esta Matriz estara representando a versão:
     * A-Acima da Diagonal;
     */
     
    public static void main(String[] args) {
       int I,J;
     int[] []A = new int[10][10];
      Scanner entrada;
      entrada = new Scanner(System.in);

      {
          for (I=1;I<=3;I++)
          {
              for (J=1;J<=3;J++)
              {
      System.out.println("Digite o elemento;" +I+""+J);
     A[I] [J]= entrada.nextInt();

              }
          }
      }
       for (I=1;I<=3;I++)
          {
              for (J=1;J<=3;J++)
              {
              System.out.print(A[I][J]+"");
              }
    System.out.println();

          }
      }
    }
