import java.util.Scanner;

public class Main {

    public void cursos(){
        // curso de java:https://github.com/oguhpereira/aprenda-java
        // http://excript.com/curso-de-java.html

        // EXERCICIOS RESOLVIDOS EM JAVA
        // http://excript.com/exercicios-resolvidos-de-java.html
    }

    public static void main(String[] args) {


        System.out.println("Hello world!");
        // Atalhos do JAVA na IntelliJ
        // sout + TAB => escreve o texto =>System.out.println("");
        // psvm + TAB => escreve o metodo principal inteiro => public static void main(String[] args) {
        // CTRL + D => duplica a linha atual
        // SHIFT + ALT + TECLA PARA CIMA OU PARA BAIXO => move uma linha inteira

        System.out.println("Dados de Testes");



        // Exemplo de tipos de variaveis em JAVA
        // Numericos

        // Literais - Caracteres

        // Booleanos - logicos


        // exemploVariaveisJava();

        // exemplo2Variaveis();

        lendoDadosTeclado();
    }

    public static void lendoDadosTeclado (){
        System.out.println("Digite um número: ");
        Scanner in = new Scanner(System.in );

        System.out.println("Numero lido: " + in.nextLine());
    }

    public static void exemploVariaveisJava (){
        // DECLARAÇÃO E USO DE UMA VARIÁVEL INTEIRA:
        //declarando uma variável numérica inteira
        int valor;
        //atribuindo o valor 100 para a variável
        valor = 100;

        //imprimindo o valor da variável na saída padrão
        System.out.println(valor);

        // EXEMPLO DE USO DE VARIÁVEIS
        int num = 0;
        int minhaVariavel = 100;

        System.out.println(num);
        System.out.println(minhaVariavel);

        double dinheiro = 1.55;
        System.out.println(dinheiro);
    }

    public static void exemplo2Variaveis(){
        int num = 0;
        /*
         * 1) um nome
         * 2) um tipo
         * 3) um tamanho
         * 4) um valor
         * */
        num = 10;

        /*
         * 1) é temporário
         * 2) os dados são removidos da memória
         * quando o PC é desligado
         * 3) volatil
         * 4) o valor antigo sempre é perdido (para sempre)
         * 5) o Java, desaloca a memória
         * */
    }

}
