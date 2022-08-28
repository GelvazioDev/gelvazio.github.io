/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package calculo;

/**
 *
 * @author Gelvazio Camargo
 */
public class Calculadora {
    double numero1;
    double numero2;
    double resultado;
    double resultado2;

    public double subtrair(double numero1,double numero2){
        return numero1-numero2;

    }

     public double somar(double numero1,double numero2){
        return numero1 + numero2;
          }


      public double dividir(double numero1,double numero2){

        if (numero2 !=0){
              return numero1/numero2;
          }else {
              return 0;
          }

    }


       public double multiplicacao(double numero1,double numero2){
           return numero1 * numero2;

    }

}
