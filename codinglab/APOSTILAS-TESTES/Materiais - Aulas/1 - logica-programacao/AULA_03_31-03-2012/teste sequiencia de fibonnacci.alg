algoritmo "semnome"
// Função :
// Autor :
// Data : 31/3/2012
// Seção de Declarações
// fazer algoritmo para imprimir os 13 primeiros termos da
// sequencia de fibonacci
// ate um  numero dado

var
contador:inteiro
valor2:inteiro
valor1:inteiro
valor3:inteiro
inicio
// Seção de Comandos

valor1:=0
valor2:=1
valor3:=1

para contador 1 ate 13 faca

// valor1:=valor+valor2
//valor2:=valor+valor1
// valor3:=valor1+valor2

valor1:=valor2+valor3
valor2:=valor1+valor3
valor3:=valor1+valor2


escreva(valor3)
fimpara
//    1 = 1 + 3
// tem de ser 1 = 1 + 1
//            2= 2 +1
// 3= 3+2
//5 = 5+3

//1 1 2 3 5 8 13 21

//1=1+1-1
//2=2+1
//proximo termo e igual a soma dos dois termos anteriores
// valor=valor+ valor-valorantes
//3=
//5=5+3
//8=8+5
//13=13+8
//
//1 1 2 3 5 8 13 21




fimalgoritmo
