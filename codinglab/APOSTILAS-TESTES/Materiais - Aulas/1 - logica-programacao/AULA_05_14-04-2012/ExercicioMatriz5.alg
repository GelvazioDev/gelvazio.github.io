algoritmo "semnome"
// Função :
// Autor :
// Data : 14/4/2012
// Seção de Declarações
// Dadoa uma matriz de ordem  3X3 faca um algoritmo que verifique
// se a matriz e simetrica
// Matriz simetrica e a matriz original M igual a sua matriz Transposta
var
A:vetor[1..3,1..3] de inteiro
B:vetor[1..3,1..3] de inteiro
simetrica:logico
l,c:inteiro
inicio
// Seção de Comandos
// matriz simetrica
// 3 5 6
// 5 2 4
// 6 4 8
escreval ("Dados da matriz")
para l de 1 ate 3 faca
   para c de 1 ate 3 faca
      leia (A[l,c])
   fimpara
fimpara
//-----------------------------------

escreval("Matriz Normal")
para l de 1 ate 3 faca
   para c de 1 ate 3 faca
      escreva(A[l,c])
   fimpara
   escreval
fimpara
//-----------------------------------

escreval("Matriz Transposta")
para l de 1 ate 3 faca
   para c de 1 ate 3 faca
      B[l,c]:=A[c,l]
      escreva(B[l,c])
   fimpara
   escreval
fimpara
//-----------------------------------------
simetrica:=verdadeiro
para l de 1 ate 3 faca
   para c de 1 ate 3 faca
      se (A[l,c])<>(A[c,l]) entao
         simetrica:=falso
         interrompa
      fimse
   fimpara
fimpara
//----------------------------------------
se simetrica=verdadeiro  entao
   escreva("Matriz e simetrica!!")
senao
   escreva("Matriz nao e  simetrica!!")
fimse
fimalgoritmo
