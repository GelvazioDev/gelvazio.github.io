/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioExtraClasseListaDois;

import java.util.Scanner;

/**
 *
 * @author aluno
 * 4. Escreva um algoritmo para ler um conjunto de 
 * 40 formulários contendo cada um a altura e o sexo de 
 * uma pessoa (somente ‘M’ ou ‘F’) e imprimir
• A maior altura e a menor altura da turma
• A média da altura das mulheres
• A média da altura dos homens

 */
public class Ex_quatro {
    public static void main(String args []){
        Scanner entrada = new Scanner (System.in);
        double mediahomem=0,mediamulher=0,maior=1,menor=0;
        String sexo="";
        int contamulher=0,contahomem=0,somamulher=0,somahomem=0;
        int alturamulher=0,alturahomem=0,i=0;
        int a []=new int [10];
        int b []=new int [10];
     for (i=0;i<3;i++){
         System.out.println("Digite o sexo da pessoa 'M' masculino e 'F' feminino: ");
            sexo=entrada.next();
               alturahomem=b[i];
           if (sexo.equals("F")){
               System.out.println("Digite a altura da mulher: ");
               alturamulher=entrada.nextInt();
               alturamulher=a[i];
               somamulher=somamulher+alturamulher;
               mediamulher=somamulher/contamulher;
               contamulher++;
                }
            else if(sexo.equals("M")){
            System.out.println("Digite a altura do homem: ");
            alturahomem=entrada.nextInt();
                somahomem=somahomem+alturahomem;
                mediamulher=somamulher/contamulher;
                contahomem++;
                }
          
    {//Ver qual e a maior altura
            if (alturamulher>maior){
             maior=alturamulher;
        }
            else if(alturahomem>maior){
                maior=alturahomem;
            }
            else{
                maior=maior*1;     
         }
   }
   {//Ver qual e a menor altura
    if (alturamulher>menor){
        menor=alturamulher;
        }
    else if (alturahomem>menor){
        menor=alturahomem;
}
    else{
        menor=menor*1;
}
   }
            
        }
        System.out.println("Maior altura do total: "+maior);
        System.out.println("Menor altura do total: "+menor);
        System.out.println("Media da altura das mulheres: "+mediamulher);
        System.out.println("Media da altura dos homens:" +mediahomem);
        
    }
    
}
