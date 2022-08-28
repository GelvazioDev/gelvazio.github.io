//Exercício 30
// Faça um algoritmo que determine qual o menor valor existente no vetor do Exercício 28.
algoritmo "Exercicio30"
var
  vNumeros: vetor[1..10] de inteiro
  vMenor: inteiro
  vCont: inteiro
inicio
  escreval("Entre com 10 valores quaisquer:")
  Leia(vNumeros[1])
  vMenor := vNumeros[1]

  para vCont de 2 ate 10 faca //200
    leia(vNumeros[vCont])
    se (vNumeros[vCont] < vMenor) entao
      vMenor := vNumeros[vCont]
    fimse
  fimpara

  escreval
  escreval("Valor menor: ", vMenor)
fimalgoritmo

