algoritmo "semnome"
// Função :
// Autor :
// Data : 14/4/2012
// Seção de Declarações
//
var
a,b:inteiro

procedimento troca (var x,y:inteiro)
var
t:inteiro
inicio
t<-x
x<-y
y<-t
fimprocedimento

inicio
a<-3
b<-4
escreval("A: ",a," B: ",b)
troca(a,b)
escreva (" Troca A: ",a," Troca de B: ",b)
fimalgoritmo
