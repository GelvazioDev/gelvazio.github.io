/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exemplo;

/**
 *
 * @author Gelvazio Camargo
 */
public class Funcionario extends Pessoa {
    private String carteiraProfissional;
    private double salario;
    private String dataAdmissao;

    Funcionario(String nome,String cpf, int idade,double salario){
        super (nome,cpf,idade);
        this.salario = salario;
    }
    public String getCarteiraProfissional() {
return carteiraProfissional;
}
public void setCarteiraProfissional(String carteiraProfissional) {
this.carteiraProfissional = carteiraProfissional;
}
public String getDataAdmissao() {
return dataAdmissao;
}

public void setDataAdmissao(String dataAdmissao) {
this.dataAdmissao = dataAdmissao;
}
public double getSalario() {
return salario;
}
public void setSalario(double salario) {
this.salario = salario;
}
public void imprimeDadosFuncionario(){
    System.out.println("Nome: "+nome+" CPF: "+cpf+" Idade:"+idade);
    System.out.println("Salário: "+salario+" Data de Admissão: "+dataAdmissao+" Carteira Profissional:"+carteiraProfissional);
}
}


