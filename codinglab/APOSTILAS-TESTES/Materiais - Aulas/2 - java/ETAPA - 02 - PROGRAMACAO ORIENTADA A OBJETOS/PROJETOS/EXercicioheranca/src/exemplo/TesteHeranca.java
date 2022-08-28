
package exemplo;

/**
 *
 * @author Gelvazio Camargo
 */
public class TesteHeranca {
    public static void main(String[] args) {
       Calculadora calculadora1 = new Calculadora();
       int resultado1 = calculadora1.soma(15,5);
       System.out.println("15 + 5 = "+resultado1);
       CalculadoraPlus calcplus= new CalculadoraPlus();

       //Utilizacao do metodo herdado da classe Calculadora
       int resultado2 = calcplus.soma(20, 79);
       System.out.println("20 + 79 = "+resultado2);

       //Utilizacao do metodo definido na classe CalculadoraPlus
       double resultado3 = calcplus.multiplicacao(10, 30);
       System.out.println("10 * 30 = "+resultado3);
       
       double resultado4 = calcplus.divisao(20,10);
       System.out.println("20 : 10 = "+resultado4);


}
}
