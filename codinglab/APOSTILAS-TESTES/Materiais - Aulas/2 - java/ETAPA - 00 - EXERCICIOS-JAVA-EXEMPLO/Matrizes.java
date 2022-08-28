package trabalho_11_04_2013;

import java.util.Scanner;

/**
 * @author geo
 */
public class Matrizes {
    Scanner entrada = new Scanner(System.in);
    static int i;
    static int j;
	
  public int LerMatrizA(int a[][])
    {
      for(i=1; 1<3;i++)
      {
        for(j=1; j<3;j++) 
        {
          System.out.println("Digite o numero "+i+" da Matriz A = ");
          a[i][j]=entrada.nextInt();
          return a[i][j];
        }
      }
        
    }
   public int LerMatrizB(int b[][])
    {
      for(i=1; 1<3;i++)
      {
        for(j=1; j<3;j++) 
        {
          System.out.println("Digite o numero "+i+" da Matriz B = ");
          b[i][j]=entrada.nextInt();
          return b[i][j];
        }
      }
      
    }
   public void SomaMatrizes(String[] args) {
       int a [][]=new int[3][3];
       int b [][]=new int[3][3];        
       int c [][]=new int[3][3];
       int i,j,auxA,auxB;
       
       for (i=1;i<3;i++){
           for(j=1;j<3;j++){
                auxA=a[i][j];
                auxB=b[i][j];
                c[i][j]=auxA+auxB;
           }
       }

}
    public int LerMatrizC(int c[][])
    {
      for(i=1; 1<3;i++)
      {
        for(j=1; j<3;j++) 
        {
          System.out.println("Numero "+i+" da Matriz C  = "+c[i][j]);
        }
      }
 }
public static void main(String[] args) {
        System.out.println("Leitura dos dados da Matriz A!!");
        //procedimento LerMatrizA(so vai ler)
        LerMatrizA(int[][]);
        System.out.println("Leitura dos dados da Matriz A!!");
        //procedimento LerMatrizB(so vai ler)
        System.out.println("Soma dos dados das Matrizes A e B!!");
        //procedimento SomarMatrizes(so vai ler)
        System.out.println("Impressao dos dados da Matriz A!!");
        //procedimento ImprimirMatrizA(so vai imprimir)
        System.out.println("Impressao dos dados da Matriz B!!");
        //procedimento ImprimirMatrizB(so vai imprimir)
        System.out.println("Impressao dos dados da Matriz C!!");
        //procedimento ImprimirMatrizC(so vai imprimir)
}
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

}

