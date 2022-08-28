//Exercício 28.	
// Faça um algoritmo que leia, via teclado, 10 valores do tipo inteiro e os guarde na memória.
algoritmo "Exercicio28"
var
  vValores: vetor[1..10] de inteiro
  vCont: inteiro
inicio
  // Leitura
  escreval("Entre com 10 valores quaisquer:")
  para vCont de 1 ate 10 faca
    leia(vValores[vCont])
  fimpara
  escreval
  // Impressão em tela
  escreval("Valores Armazenados")
  para vCont de 1 ate 10 faca
    escreva(" |",vValores[vCont])
  fimpara
fimalgoritmo
