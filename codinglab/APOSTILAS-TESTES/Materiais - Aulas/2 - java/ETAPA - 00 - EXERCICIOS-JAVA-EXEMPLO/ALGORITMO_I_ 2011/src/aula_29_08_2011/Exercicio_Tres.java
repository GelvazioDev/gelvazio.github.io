/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aula_29_08_2011;

/**
 *
 * @author gelvazio
 *
 * Exercicio Tres
 * 1)Executar a serie: S = (20 * (21/10)) + ((21 * 22)/11)...((40 * 41)/30)
 * Testes  ate 24
 *           S= 
 *
 * 42 + 44 +  38,92 + 39,42
 * Resultado = 191,8
 *
 *(20 * (21/10)) + ((21 * 22)/11)(22 * (23/13))+ (23 * (24/14))
 *

 */
public class Exercicio_Tres {
    public static void main(String[] args) {
    double s=0,cont1,cont,cont2,cont3,i=0;
            cont1=1;
            cont2=1;
            cont3=1;
            cont=2;
        //S = (20 * (21/10)) + ((21 * 22)/11) + (22 * (23/13))+ (23 * (24/14))
        //S =       42       +        44      +       50,6     +       55,2
        //S=     191,8
            for (cont1=20;cont1<=23;cont1++){
                for (cont2=21;cont2<=24;cont2++){
                    for (cont3=10;cont3<=14;cont3++){
                        for (i=1;i<=10;i++){
                 
            //s=((cont1 * cont2)/cont3);
            s=s+i;

                    }
                    s=cont;
            //s=s+(1/cont1);
            System.out.println("Resultado"+s);
                    }

    }
}
    }}



