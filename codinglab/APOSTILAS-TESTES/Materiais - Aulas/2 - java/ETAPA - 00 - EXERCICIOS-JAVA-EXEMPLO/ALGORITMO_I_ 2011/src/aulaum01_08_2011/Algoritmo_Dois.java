
package aulaum01_08_2011;

import java.util.Scanner;

/**
 *
 * @author gelvazio
 * Algoritmo_Dois
 * Determine a velocidade de um automovel que percorreu uma distancia S em km,
 * em um intervalo de tempo T,informando em horas.
 */
public class Algoritmo_Dois {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int s,t,ft;

    System.out.println("Digite a distãncia que o automovel percorreu:");
    s=entrada.nextInt();
    System.out.println("Digite o tempo que  o automovel levou para percorrer:");
    t=entrada.nextInt();

    ft = s/t;
     System.out.println("A distãncia percorrida é de:"+ft);
    }
    }
