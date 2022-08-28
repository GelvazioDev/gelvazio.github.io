/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pacotecondicao;

/**
 *
 * @author aluno
 */
public class Carro {
    private String cor;
    private int ano;
    private String marca;
    private String nome;

   
   
   public void inicializaDados(String cor,int ano,String marca,String nome){
      this.cor = cor;
      this.ano = ano;
      this.marca = marca;
      this.nome = nome;
       
   }
    public void imprime(){
        System.out.println("Cor:"+ cor);
        System.out.println("Ano:"+ ano);
        System.out.println("Marca:"+ marca);
        System.out.println("Nome:"+  nome);
    }
 public void alteraCor(String cor){
     if (cor.length() > 2){
        this.cor = cor;
     }else{
         System.out.println("Cor Invalida!!!");
     }
 }
}
