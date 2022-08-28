/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exemploproduto;

/**
 *
 * @author aluno
 */
public class produto {
    private int codigo;
    private String nome;
    private String marca;
    private double preco;
    private double porcento;


     public void inicializaDados(int codigo,String nome,String marca,double preco){
      this.codigo = codigo;
      this.nome = nome;
      this.marca = marca;
      this.preco = preco;

   }
   
 public void alteraPreco(double preco,double porcento){
     if (preco > 0){
        this.preco = (((preco * porcento)/100)+preco);
        }else{
         System.out.println("Preco Invalido!!!");
     }
    }
      public void imprime(){
        System.out.println("Codigo:"+ codigo);
        System.out.println("Preco:"+ preco);
        System.out.println("Marca:"+ marca);
        System.out.println("Nome:"+  nome);
    }

    }
