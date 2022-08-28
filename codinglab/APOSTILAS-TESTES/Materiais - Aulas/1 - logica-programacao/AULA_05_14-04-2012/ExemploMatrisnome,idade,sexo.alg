algoritmo "semnome"
// Função :
// Autor :
// Data : 14/4/2012
// Seção de Declarações
// Faca uma matriz A de ordem 3x3  que:
// leia nome,idade e sexo de nove pessoas
var
l,c:inteiro
nome:vetor [1..3,1..3] de literal
idade:vetor [1..3,1..3] de literal
sexo:vetor [1..3,1..3] de literal

inicio

escreval("Digite os dados das pessoas")
para l de 1 ate 3 faca
   para c de 1 ate 3 faca
      escreval("Nome:")
      leia(nome[l,c])
      escreval("Idade:")
      leia(idade[l,c])
      escreval("Sexo:")
      leia(sexo[l,c])
   fimpara
fimpara

escreval("Dados das pessoas:")
para l de 1 ate 3 faca
   para c de 1 ate 3 faca
      escreva(" Nome: ",nome[l,c])
      escreva(" Idade: ",idade[l,c])
      escreval(" Sexo: ",sexo[l,c])
   fimpara
   escreval
fimpara


fimalgoritmo
