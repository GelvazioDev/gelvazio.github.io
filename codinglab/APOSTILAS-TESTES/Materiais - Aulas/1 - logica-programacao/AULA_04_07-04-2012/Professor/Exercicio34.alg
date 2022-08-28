//Exercício 34
//Faça um algoritmo que leia um nome e o guarde na memória.
// Após a leitura, verifique se a palavra é um palíndromo.
// Um palíndromo é aquela palavra que a sua leitura é a
// mesma da esquerda para a direita e vice versa. Exemplo: ARARA, ANA, etc.
algoritmo "Exercicio34"
var
  vPalavra: vetor[1..5] de caracter
  vPalavraInvertida: vetor[1..5] de caracter
  vLetra: caracter
  vCont: inteiro
  vCont2: inteiro
  vQtdCaracteres: inteiro
  vPalindromo: logico
inicio
  vCont := 0
  escreval("Entre com uma palavra qualquer (letra a letra) contendo no máximo 05 caracteres")
  escreval("Tecle - ENTER - para finalizar a leitura de caracteres")
  leia(vLetra)

  se maiusc(vLetra) = "" entao
     fimalgoritmo
  fimse
  
  enquanto maiusc(vLetra) <> "" faca
    vCont := vCont + 1
    vPalavra[vCont] := vLetra
    leia(vLetra)
  fimenquanto
  
  vCont2 := vCont
  vQtdCaracteres := vCont
  vCont := 1

  vPalindromo := Verdadeiro
  para vCont de 1 ate vCont2 faca
    vPalavraInvertida[vCont2] := vPalavra[vCont]
    se vPalavra[vCont2] <> vPalavra[vCont] entao
      vPalindromo := Falso
    fimse
    
    vCont2 := vCont2 - 1
  fimpara
  
  escreval("Palavra Normal")
  para vCont de 1 ate vQtdCaracteres faca
    escreva(vPalavra[vCont])
  fimpara

  escreval

  escreval("Palavra Invertida")
  para vCont de 1 ate vQtdCaracteres faca
    escreva(vPalavraInvertida[vCont])
  fimpara
  
  escreval
  
  se vPalindromo = verdadeiro entao
     escreval("A palavra digitada é um Palíndromo!")
  senao
     escreval("A palavra digitada não é um Palíndromo!")
  fimse
fimalgoritmo
