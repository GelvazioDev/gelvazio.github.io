/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula10082012;

import java.util.Scanner;

/**
 *
 * Faca um algoritmo que informados o dia atual e a data de nascimento,
 * calcule a idade da pessoa.
 * Informar:
 * Nascimento
 * 20  12  1995
 * 
 * data de hoje = 10   08  2012
 * 
 * Dizer quantos anos tem a pessoa
 */
public class ExercicioUm {
    public static void main(String[] args) {
  Scanner entrada = new Scanner (System.in); 
  
  int dianasc=0;//dia do nascimento
  int diaatual=0;//dia atual
  int mesnasc=0;//mes nascimento
  int mesatual=0;//mes atual
  int anonasc=0;//ano nascimento
  int anoatual=0;//ano atual
  int idade=0;//idade atual
  int totdia=0;
 
  
  
  System.out.println("Digite o dia do nascimento");
  dianasc=entrada.nextInt();
  System.out.println("Digite o dia atual");
  diaatual=entrada.nextInt();
  System.out.println("Digite o mes do nascimento");
  mesnasc=entrada.nextInt();
  System.out.println("Digite o mes atual");
  mesatual=entrada.nextInt();
  System.out.println("Digite o ano do nascimento");
  anonasc=entrada.nextInt();
  System.out.println("Digite o ano atual");
  anoatual=entrada.nextInt();

if (anoatual<anonasc){
    anonasc=anonasc*12+mesnasc;
    anoatual=anoatual*12 + mesatual;
    idade=(anoatual-anonasc)/12;
    }
if (anoatual==anonasc){
    {
      totdia=diaatual-dianasc;  
    }
    
    anonasc=anonasc*12+mesnasc;
    anoatual=anoatual*12 + mesatual;
    idade=(anoatual-anonasc)/12; 
  }
else{
    anonasc=anonasc*12+mesnasc;
    anoatual=anoatual*12 + mesatual;
    idade=(anoatual-anonasc)/12; 
} 

  System.out.println("A idade e de :"+idade+"anos");
}
}