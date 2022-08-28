/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AULA24082012;

import java.util.Scanner;

/**
 *
 * @author aluno
 * ALGARISMOS ROMANOS

I - 1 
II - 2 
III - 3 
IV - 4 
V - 5 
VI - 6 
VII - 7 
VIII - 8 
IX - 9 
X - 10


XI - 11 
XII - 12 
XIII - 13
XIV - 14
XV - 15
XVI - 16
XVII - 17
XVIII - 18
XIX - 19 


XX - 20 
XXX - 30 
XL - 40 
L - 50 
LX - 60 
LXX - 70 
LXXX - 80 
XC - 90 

C - 100 
CC - 200 
CCC - 300
CD - 400 
D - 500
DC - 600 
DCC - 700
DCCC - 800
CM - 900
 
M - 1000 
MM - 2000

Exemplos:

Número arábico    Número Romano
1900                      MCM
1950                      MCML
1975                      MCMLXXV
2000                      MM

Os numerais I, X e C, escritos à direita de numerais maiores, somam-se seus valores aos desses numerais.

Exemplos: 
VII = 7 ( 5 + 2 )
X   = 10
IX = 10 (10-1)
LX = 60 ( 50 + 10 )	
LXXIII = 73 (50+20+3)
CX = 110 (100+10) 
CXXX = 130 (100+30) 
MCC = 1.200 (1.000+200)

Os numerais I, X e C, escritos à esquerda de numerais maiores, subtraem-se seus valores aos desses numerais.

Exemplos: 
IV = 4 (5-1) 
IX = 9 (10-1) 
XL = 40 (50-10)
XC = 90 (100-10) 
CD = 400 (500-100) 
CM = 900 (1.000-100)

Colocando-se um traço horizontal sobre um ou mais numerais, multiplica-se seu valor por 1.000.

Exemplos: 
V = 5.000 
IX = 9.000 
X = 10.000
 */
public class EXERICICOROMANO {
    public static void main (String [] args){
    Scanner entrada = new  Scanner (System.in);
    int n=0;
    String romano="";
    int[] numbers = {1000,900,500,400,100,90,50,40,10,9,5,4,1};                                       
    String[] letras = { "M",  "CM",  "D",  "CD", "C",  "XC", "L",  "XL",  "X",  "IX", "V",  "IV", "I" };
 System.out.println("Digite o numero:");
 n =entrada.nextInt();
   for (int i = 0; i < numbers.length; i++) {
           while (n >= numbers[i]) {
              System.out.println("Numero:"+n);
              romano = letras[i];
              System.out.println("Romano:"+n);
              n = numbers[i];
           }
        }
     System.out.println("Resultado:"+romano);
     }
 
}

