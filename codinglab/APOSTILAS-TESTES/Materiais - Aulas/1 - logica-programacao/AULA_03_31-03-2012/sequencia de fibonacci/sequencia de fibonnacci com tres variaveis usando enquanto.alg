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
valor1:inteiro
valor2:inteiro
valor3:inteiro

inicio
// Seção de Comandos
valor1:=0
valor2:=0
valor3:=1

enquanto (contador < 13) faca
   // 0 1 1 2 3 5  8 13 21....

    valor1:=valor2+valor3
    valor2:=valor1+valor3
    valor3:=valor2+valor1
    
    
    contador:=contador+1
   escreva(valor1,valor2,valor3)
fimenquanto
fimalgoritmo
