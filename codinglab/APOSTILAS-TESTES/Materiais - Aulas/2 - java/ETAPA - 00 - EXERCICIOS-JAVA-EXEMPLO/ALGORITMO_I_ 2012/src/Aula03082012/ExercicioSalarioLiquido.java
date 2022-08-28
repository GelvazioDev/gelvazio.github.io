/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula03082012;

import java.util.Scanner;

/**
 *
 //TABELA VIGENTE
//Tabela de contribuição a partir de 1º de Janeiro de 2012
//Salário-de-contribuição (R$)	Alíquota para fins de recolhimento
//ao INSS (%)
//até 1.174,86	8,00
//de 1.174,87 até 1.958,10	9,00
//de 1.958,11 até 3.916,20	11,00

//Tabela IR
//Base de cálculo anual em R$
//Alíquota %	 Parcela a deduzir do imposto em R$
//Até 18.799,32	
//De 18.799,33 até 28.174,20  =  7,5 % que da=1.409,95
//De 28.174,21 até 37.566,12  =  15,0 % que da 3.523,01
//De 37.566,13 até 46.939,56  =  22,5% que da 6.340,47
//Acima de 46.939,56	         = 27,5 % que da 8687,45
//Dica  Salario={Salario bruto-(Salario bruto*INSS)}*IR;
 */


public class ExercicioSalarioLiquido {
 public static void main(String[] args) {
  Scanner entrada = new Scanner (System.in); 
  double salariobruto,salarioliquido;
  double IR=0;
  double INSS=0;
  double salarioIR;
  int dependente=0;
  double vl_dependente=164.56;
  double total_dependente;
  double salario=0;
  String nome;
    System.out.println("Digite o nome do funcionario");
    nome=entrada.next();
    System.out.println("Digite o salario mensal bruto do funcionario");
    salariobruto=entrada.nextDouble();
    System.out.println("Digite o numero de dependentes");
    dependente=entrada.nextInt();

//Precisa ver sobre colocar o valor maximo de IR por pessoa
//Colocar tb o valor a descontar do IR por dependente
    
if(salariobruto<1174.86){
  INSS=salariobruto * 0.08;
}
if((salariobruto <= 1958.10) & (salariobruto>1174.86)){
  INSS=salariobruto*0.09;
}
if((salariobruto > 1958.11) & (salariobruto<3916.20)){
    INSS=salariobruto*0.11;
} 
System.out.println("INSS somente: "+INSS);
//valor a descontar por dependente=164,56
//Precisa ver sobre colocar o valor maximo de IR por pessoa
//Depois disso jogar na progarmacao da tabela
//Colocar tb o valor a descontar do IR por dependente
total_dependente=dependente*vl_dependente;
salario=salariobruto-INSS;
System.out.println("Total Dependente somente: "+total_dependente);
salarioIR=salariobruto-INSS;
System.out.println("Salario para Calculo do IR sem dependente: "+salarioIR);
salarioIR=salarioIR-total_dependente;
System.out.println("Salario para Calculo do IR JA COM  DEPENDENTES CERTO dependente: "+salarioIR);
if(salarioIR<=1566.61){
IR=0;
System.out.println("IR com base no valor de 1566.61:"+IR);
}
//De 1.566,62 até 2.347,85-7,5 %-117,49

if ((salarioIR > 1566.61) & (salarioIR<2347.86)){
    IR=salarioIR * 0.075;
    if (IR >117.49){
        IR=117.49;
    }
    else {
        IR=IR=salarioIR * 0.075;
    }
   System.out.println("IR com base no valor De 1.566,62 até 2.347,85-7,5 %-117,49:"+IR); 
}
//De 2.347,86 até 3.130,51-15,0 %-293,58
if ((salarioIR > 2347.86) & (salarioIR<3130.51)){
IR=salarioIR * 0.15;
}
//De 3.130,52 até 3.911,63-22,5%-528,37
if ((salarioIR > 3130.52) & (salarioIR<3911.63)){
IR=salarioIR * 0.225;
 }
//Acima de 3.911,63-27,5%-723,95
if (salarioIR>3911.63){
    IR=salarioIR * 0.275;	
    }
//Dica  Salario={Salario bruto-(Salario bruto*INSS)}*IR;

salarioliquido=(salario-IR);
System.out.println("O funcionario pagou de INSS "+INSS);
System.out.println();
System.out.println("O funcionario pagou de IR "+IR);
System.out.println();
System.out.println("Numero total de dependetes"+dependente);
System.out.println();
System.out.println("O funcionario "+nome+" teve o salario de "+salarioliquido);
 }
}