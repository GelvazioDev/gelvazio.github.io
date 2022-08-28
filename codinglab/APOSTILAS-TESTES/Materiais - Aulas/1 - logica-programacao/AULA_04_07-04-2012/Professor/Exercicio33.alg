//Exercício 33
// Amplie o exercício 32 imprimindo o menor Nome do vetor (usar função Compr() do VisualG)
// A função Compr() retorna o número de caracteres inseridos numa variável.
// Ex.: Caso o usuário digitar o nome Maria, o Compr() retornará o valor 05.
algoritmo "Exercicio33"
var
  vNomes: vetor[1..10] de caracter
  vNomeMenor: literal
  vMenor: inteiro
  vCont: inteiro
inicio
  // Leitura
  escreval("Entre com 10 valores quaisquer:")
  para vCont de 1 ate 10 faca
    leia(vNomes[vCont])
  fimpara

  vMenor := Compr(vNomes[1])
  para vCont de 1 ate 10 faca
    se Compr(vNomes[vCont]) < vMenor entao
       vNomeMenor := vNomes[vCont]
    fimse
  fimpara
  
  escreval("Menor nome do vetor é: ", vNomeMenor)
fimalgoritmo
