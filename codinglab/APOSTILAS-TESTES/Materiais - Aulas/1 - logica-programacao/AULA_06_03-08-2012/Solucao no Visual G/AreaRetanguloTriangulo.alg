algoritmo "semnome"
// Função :
//7-Faca um algoritmo que calcule
//a area de um retanfulo e de um triangulo e informe qual o maior.
//Area do Triangulo=A=(base*h(altura) /2
//Area do quadrado=Lado*lado
var
   maior:inteiro
   lado1:inteiro
   lado2:inteiro
   base:inteiro
   altura:inteiro
   areatriangulo:real
   areaquadrado:inteiro
   
inicio
Escreval("Digite a base do triangulo:")
leia(base)
Escreval("Digite a altura do triangulo:")
Leia(altura)
Escreval("Digite o lado Um do quadrado")
Leia(lado1)
Escreval("Digite o lado Dois do quadrado")
leia(lado2)
 areatriangulo:=(base*altura)/2
 areaquadrado:=lado1*lado2
 se (areaquadrado>areatriangulo)entao
    Escreval("O a figura com maior area e o QUADRADO com area de: ",areaquadrado)
 se (areaquadrado<areatriangulo)entao
    Escreval("O a figura com maior area e o TRIANGULO com area de: ",areatriangulo)
 se (areaquadrado=areatriangulo)entao
    Escreva("A area dos dois e igual!!")
fimse
fimse
fimse
 fimalgoritmo
