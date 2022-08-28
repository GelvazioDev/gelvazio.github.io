//Exercício 29
// Amplie o exercício anterior emitindo um relatório com todos os números pares que você leu.
algoritmo "Exercicio29"
var
  vNumeros: vetor[1..10] de inteiro
  vNumerosPares: vetor[1..10] de inteiro
  vCont: inteiro
inicio
  // Leitura
  escreval("Entre com 10 valores quaisquer:")
  para vCont de 1 ate 10 faca 0
    leia(vNumeros[vCont])
    
    se (vNumeros[vCont] mod 2 = 0) entao
       vNumerosPares[vCont] := vNumeros[vCont]
    fimse
  fimpara
  escreval
  
  // Impressão em tela
  escreval("Lista de Números Pares")
  para vCont de 1 ate 10 faca
    se vNumerosPares[vCont] <> 0 entao
      escreva(" |",vNumerosPares[vCont])
    fimse
  fimpara
fimalgoritmo
