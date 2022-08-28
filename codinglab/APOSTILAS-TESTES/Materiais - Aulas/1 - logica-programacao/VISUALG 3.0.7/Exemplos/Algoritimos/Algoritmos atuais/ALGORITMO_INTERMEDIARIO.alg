algoritmo "Algoritmo"
// Função : achar o numero intermediario
// Autor :  Gelvazio
// Data : 11/10/2019
// Seção de Declarações 
var

vA: INTEIRO
vB: INTEIRO
vC: INTEIRO

inicio
// Seção de Comandos 
ESCREVAL("ESCREVA O NUMERO DE A")
LEIA(vA)
ESCREVAL("ESCREVA O NUMERO DE B")
LEIA(vB)
ESCREVAL("ESCREVA O NUMERO DE C")
LEIA(vC)



SE (vA > vC) E (vA < vB)ENTAO
   ESCREVAL("O INTERMEDIARIO É vA:",vA)
FIMSE

SE (vB > vC) E (vB < vA)ENTAO
   ESCREVAL("O INTERMEDIARIO É vB:",vB)
FIMSE

SE (vC > vA) E (vC < vB) ENTAO
   ESCREVAL("O INTERMEDIARIO É vC:",vC)
FIMSE


fimalgoritmo
