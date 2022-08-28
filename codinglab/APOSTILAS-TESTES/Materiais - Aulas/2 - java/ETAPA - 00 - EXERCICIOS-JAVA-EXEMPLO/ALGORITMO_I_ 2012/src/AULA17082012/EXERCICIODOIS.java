/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AULA17082012;

import java.util.Scanner;

/**
 *
 * @author geo
 * FACA UM ALGORITMO QUE INFORMADOS TRES NUMEROS REAIS,
 * INDIQUE SE ESTES NUMEROS FORMAM UM TRIANGULO
 * EQUILATERO=
 * ISOSCELES=
 * ESCALENO=
 * OBSERVE QUE NAO NECESSARIAMENTE TRES MEDIDAS QUAISQUER FORMAM UM TRIANGULO
 * (PESQUISAR FORMULAS DO TRIANGULO)
 * EXEMPLO:
 * CONDICAO DE EXISTENCIA DE UM TRIANGULO
| b - c | < a < b + c
| a - c | < b < a + c
| a - b | < c < a + b

 */
public class EXERCICIODOIS {
       public static void main (String [] args){
        Scanner entrada= new Scanner (System.in); 
        double a,b,c=0;
    
System.out.println("Digite o lado A do triangulo:");
    a=entrada.nextDouble();
System.out.println("Digite o lado B do triangulo:");
    b=entrada.nextDouble();
System.out.println("Digite o lado C do triangulo:");
    c=entrada.nextDouble();
    
    if (((( b - c) < a) & (a<(b + c))) || ((( a - c) < b) & (b<(a + c))) || (((  a - b) < c) & (c<(a + b)))){
        if ((a==b)&(b==c)){
        System.out.println("O triangulo é: 'EQUILATERO'");
        }      
       if((a!=b)&(a!=c)&(b!=c)){
          System.out.println("O triangulo é: 'ESCALENO'");
        } 
        else { 
         System.out.println("O triangulo é: 'ISOSCELES'");  
        }
    }
             
                                            
    }
    
    }
    
     
 

