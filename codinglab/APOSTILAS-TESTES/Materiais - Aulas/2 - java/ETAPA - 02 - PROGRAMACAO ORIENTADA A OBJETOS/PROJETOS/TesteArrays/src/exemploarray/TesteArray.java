/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package exemploarray;

/**
 *
 * @author Gelvazio Camargo
 */
public class TesteArray {
    public static void main(String[] args){
//declaracao de array e inicialização
float[] teste = {1F,2.5F,3F,4.12F,5.6F};
//para acessarmos as linhas matriz teste[posicao]
for (int i = 0; i < teste.length; i++){
System.out.println(teste[i]);
}
//Numero de caracteres do alfabeto
int numeroCaracters = 26;
// caracter ASCII letra “A”
int ascCaracterA = 25;


    //criamos um array char de 25 posicoes
char[] arrayCaracter = new char[numeroCaracters];
//vamos inicializar o array com letras do alfabeto
for (int i = 0; i < numeroCaracters; i++){
arrayCaracter[i] = (char) (ascCaracterA + i);
}
System.out.println(arrayCaracter);
}//end main
}//end class

