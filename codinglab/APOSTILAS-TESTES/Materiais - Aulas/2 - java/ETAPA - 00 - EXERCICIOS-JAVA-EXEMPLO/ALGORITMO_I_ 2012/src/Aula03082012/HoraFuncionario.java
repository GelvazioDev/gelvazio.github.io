/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula03082012;

import java.util.Scanner;

/**
 *
 * @author geo
 */
public class HoraFuncionario {
 public static void main(String[] args) {
  Scanner entrada = new Scanner (System.in); 
 int he,me,hs,ms;
 int horas;
 int minutos;
 int totalminutos;
 int minuto;
 int horaconverte;
 int minutototal;

System.out.println("Digite a hora de entrada do funcionario:");
he=entrada.nextInt();// entrada=14:45 saida  =22:24
System.out.println("Digite o minuto de entrada do funcionario:");
me=entrada.nextInt();
System.out.println("Digite a hora de saida do funcionario:");
hs=entrada.nextInt();
System.out.println("Digite o minuto de saida do funcionario:");
ms=entrada.nextInt();

if (he<hs){
horas=(hs*60)-(he*60);
System.out.println("Horas:"+horas); //total   480
        
minutos=(ms-me);
System.out.println("Minutos:" +minutos);// total   -21
//IMPORTANTE!!! PRECISA TER MENOS DE 24 HORAS TRABALHADAS
totalminutos=horas+minutos;   //480+(-21);
System.out.println("Total de Minutos Trabalhados:"+totalminutos); //total 459;
minuto=totalminutos;
totalminutos=totalminutos/60;
horaconverte=totalminutos;
System.out.println("O funcionario trabalhou:"+horaconverte+" Horas!!");
minutototal=minuto-(horaconverte*60);
System.out.println("O funcionario trabalhou Minutos:"+minutototal+" Minutos!!!");
}else{
horas= (24 * 60)-((he*60)+ me);
System.out.println("Horas:"+horas); //total   480
System.out.println();
minutos=((hs*60)+ms);
System.out.println("Minutos:"+ minutos);// total   -21
System.out.println();
totalminutos=horas+minutos;   //480+(-21);
System.out.println("Total de Minutos Trabalhados:"+totalminutos); //total 459;
minuto=totalminutos;
totalminutos=totalminutos/60;
horaconverte=totalminutos;
System.out.println("O funcionario trabalhou:"+horaconverte+" Horas!!");
minutototal=minuto-(horaconverte*60);
System.out.println("O funcionario trabalhou Minutos:"+minutototal+" Minutos!!!");
   
}
}
}