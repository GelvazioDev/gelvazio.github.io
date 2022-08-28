//Exercício 31
// Faça um algoritmo que determine qual o maior valor existente no vetor do exercício número 28
algoritmo "Exercicio31"
var
  vNumeros: vetor[1..10] de inteiro
  vMaior: inteiro
  vCont: inteiro
inicio
  vMaior := 0
  
  escreval("Entre com 10 valores quaisquer:")
  para vCont de 1 ate 10 faca //200
    leia(vNumeros[vCont])
    se (vNumeros[vCont] > vMaior) entao
      vMaior := vNumeros[vCont]
    fimse
  fimpara

  escreval
  escreval("Valor maior: ", vMaior)
fimalgoritmo
