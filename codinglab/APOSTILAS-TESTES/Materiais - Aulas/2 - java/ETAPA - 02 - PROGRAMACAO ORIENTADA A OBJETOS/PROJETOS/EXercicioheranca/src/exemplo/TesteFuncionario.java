/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exemplo;

/**
 *
 * @author Gelvazio Camargo
 */
public class TesteFuncionario {
    public static void main(String[] args) {
//Criando o funcionario f
Funcionario f = new Funcionario("Gelvazio","12122121",24,3000.0);
/*f.setNome("Marciel");
f.setCpf("123456");
f.setIdade(29);
 * 
 */
//Atribuindo as caracteristicas especificas de funcionario
f.setSalario(1500.00);
f.setCarteiraProfissional("33455663");
f.setDataAdmissao("01/01/2000");
//Chamando um metodo definido na classe Pessoa
f.imprimeDadosFuncionario();


Funcionario f2 = new Funcionario("Diego","12122121",24,3000.0);

f2.setCarteiraProfissional("33455663");
f2.setDataAdmissao("01/01/2000");

Funcionario[] arrayfuncionario = new Funcionario[2];
arrayfuncionario[0]= f;
arrayfuncionario[1] = f2;

Empresa empresa = new Empresa("UNidavi",arrayfuncionario);

empresa.ImprimeDados();

}
}


