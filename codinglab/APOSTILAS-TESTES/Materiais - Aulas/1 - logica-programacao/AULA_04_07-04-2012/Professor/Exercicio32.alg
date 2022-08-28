//Exercício 32
// Faça um algoritmo que leia 10 nomes e os guarde na memória.
algoritmo "Exercicio32"
var
  vNomes: vetor[1..10] de caracter
  vCont: inteiro
inicio
  // Leitura
  escreval("Entre com 10 nomes quaisquer:")
  para vCont de 1 ate 10 faca
    leia(vNomes[vCont])
  fimpara
  escreval
  // Impressão em tela
  escreval("Valores Armazenados")
  para vCont de 1 ate 10 faca //200
    escreva(" |",vNomes[vCont])
  fimpara
fimalgoritmo
