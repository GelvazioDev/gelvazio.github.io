algoritmo "semnome"
// Função :
// Autor :
// Data : 14/4/2012
// Seção de Declarações
// usar sempre linha L e coluna C  para a matriz
// Matriz de exemplo


var
l,c:inteiro
n:vetor [1..2,1..4] de inteiro

inicio
// Seção de Comandos
para l de 1 ate 2 faca
   para c de 1 ate 4 faca
      escreval("Digite o numero da matriz")
      leia (n [l,c])
   fimpara
fimpara
escreval("Dados da matriz")
para l de 1 ate 2 faca
   para c de 1 ate 4 faca
      escreva (n [l,c])
   fimpara
   escreval
fimpara

fimalgoritmo
