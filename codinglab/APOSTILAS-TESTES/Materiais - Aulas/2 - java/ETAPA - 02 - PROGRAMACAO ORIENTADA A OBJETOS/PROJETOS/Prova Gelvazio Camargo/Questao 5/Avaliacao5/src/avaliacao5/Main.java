
package avaliacao5;

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
        Scanner entrada =new Scanner(System.in);
        String nome = new String();
        String RG = new String();
        String conjugue = new String();
        String sexo=new String();
        String estado= new String();
        double renda=0;

         
         System.out.println("Digite o nome da pessoa:");
         nome=entrada.next();
         System.out.println("Digite o RG da pessoa:");
         RG=entrada.next();
         System.out.println("Digite o nome do conjugue:");
         conjugue=entrada.next();
         System.out.println("Digite o estado civil do conjugue sendo: solterio,casado,divorciado,desquitado,amasiado");
         estado=entrada.next();
         System.out.println("Digite o sexo da pessoa sendo F(feminino),M(masculino),indefinido(indefinido):");
         sexo =entrada.next();
         System.out.println("Digite a renda bruta da pessoa:");
         renda =entrada.nextDouble();



         if (estado.equals("casado"))
             System.out.println("Casado");
         if (estado.equals("solteiro"))
            System.out.println("Solteiro");
         if (estado.equals("divorciado"))
             System.out.println("Divorciado");
         if (estado.equals("desquitado"))
            System.out.println("Desquitado");
         if (estado.equals("Amasiado"))
            System.out.println("Amasiado");
if (sexo.equals("F")){
System.out.println("O Senhor(a)"+nome+"portadora do RG de numero"
 +RG+ ","+estado+"com"+conjugue+ ",do sexo Feminino,possui renda bruta no mes de R$"+renda );
         
        }

         if (sexo.equals("M")){
            System.out.println("O Senhor(a)"+nome+"portadora do RG de numero"
 +RG+ ","+estado+"com"+conjugue+ ",do sexo Masculino,possui renda bruta no mes de R$"+renda);
        }

          if (sexo.equals("indefinido")){
            System.out.println("O Senhor(a)"+nome+"portadora do RG de numero"
 +RG+ ","+estado+"com"+conjugue+ ",do sexo indefinido,possui renda bruta no mes de R$"+renda);
        }
         
         }
}
