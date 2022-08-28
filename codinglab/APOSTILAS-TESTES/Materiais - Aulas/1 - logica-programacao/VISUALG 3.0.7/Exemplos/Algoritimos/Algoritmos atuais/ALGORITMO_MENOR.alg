algoritmo "semnome"
// Função :FACA UM ALGORITMO QUE APOS O USUARIO INFORMAR 3 NUMEROS, MOSTRE NA TELA
//QUAL O NUMERO MENOR
// Autor :
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

SE (vA < vC) E (vA < vB)ENTAO
   ESCREVAL("O MENOR É vA:",vA)
FIMSE

SE (vB < vC) E (vB < vA)ENTAO
   ESCREVAL("O MENOR É vB:",vB)
FIMSE

SE (vC < vA) E (vC < vB) ENTAO
   ESCREVAL("O MENOR É vC:",vC)
FIMSE


fimalgoritmo

