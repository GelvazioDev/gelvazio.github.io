algoritmo "semnome"
// Função :
// Autor :
// Data : 14/4/2012
// Seção de Declarações
// Dadas duas matrizes A e B de ordem 3 X 3
// Faca um algoritmo que some as duas  e gere a matriz C
// Soma dos respectivos elementos de A e B
// Imprima os valores das tres matrizes
var
l,c:inteiro
A:vetor [1..3,1..3] de inteiro
B:vetor [1..3,1..3] de inteiro
CE:vetor [1..3,1..3] de inteiro
inicio
// Seção de Comandos
// Vetor matriz A
para l de 1 ate 3 faca
   para c de 1 ate 3 faca
      escreval("Digite os numeros da matriz A: ")
      leia(A[l,c])
   fimpara
fimpara
// Vetor matriz B
para l de 1 ate 3 faca
   para c de 1 ate 3 faca
      escreval("Digite os numeros da matriz B: ")
      leia(B[l,c])
   fimpara
fimpara
// Vetor matriz C
para l de 1 ate 3 faca
   para c de 1 ate 3 faca
      CE [l,c]:=A[l,c]+B[l,c]
   fimpara
fimpara


escreval("Imprerssao das matrizes:")
// Vetor matriz A
escreval ("Vetor matriz A")
para l de 1 ate 3 faca
   para c de 1 ate 3 faca
      escreva(A[l,c])
   fimpara
   escreval
fimpara
// Vetor matriz B
escreval ("Vetor matriz B")
para l de 1 ate 3 faca
   para c de 1 ate 3 faca
     escreva(B[l,c])
   fimpara
   escreval
fimpara
// Vetor matriz C
escreval ("Vetor matriz C")
para l de 1 ate 3 faca
   para c de 1 ate 3 faca
      CE [l,c]:=A[l,c]+B[l,c]
      escreva(CE[l,c])
   fimpara
   escreval
fimpara


fimalgoritmo
