
package avaliacao06;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner teclado = new Scanner(System.in);
     int n1=0;
     double n2=0;
     int n3=0;



     System.out.println("Dgite o numero 1:");
     n1 = teclado.nextInt();
     System.out.println("Dgite o numero 2:");
     n2 = teclado.nextInt();
     System.out.println("Dgite o numero 3:");
     n3 = teclado.nextInt();

     n2 = n2 % n1;
     n3= (int)n2;



     if (n3 > n1){
System.out.println("O resto de n3:"+n3+"é maior que n1:"+n1);
        }
if (n3 < n1){
System.out.println("O resto de n3:"+n3+"é menor que n1:"+n1);
        }
 else
     
            {
     System.out.println("O resto de n3:"+n3+"é igual a n1:"+n1);
        }


    }
    }


