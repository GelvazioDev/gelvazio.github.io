algoritmo "semnome"
// Função :
// Autor :
// Data : 31/3/2012
// Seção de Declarações
// Faca um algoritmo para:
// a)Ler um valor x qualquer
// b)Calcular Y = (x+1)+(x+2)+(x+3)+(x+4)+(x+5)
// Contar ate 5 somente

var
   y:real
   x:real
   contador:real

inicio
// Seção de Comandos
contador:=1

escreval("Escreva o numero Y ")
leia(x)

 enquanto (contador<=5) faca

 y:= y + (x + contador)

 contador:=contador+1
 fimenquanto
 
 escreval ("Calculo e ",y)


fimalgoritmo
