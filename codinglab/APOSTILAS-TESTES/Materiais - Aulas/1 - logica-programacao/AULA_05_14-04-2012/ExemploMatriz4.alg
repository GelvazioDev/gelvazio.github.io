algoritmo "semnome"
// Função :
// Autor :
// Data : 14/4/2012
// Seção de Declarações
// Dada uma matriz 2x3 de valores reais
// faca um algoritmo que faca a leitura destes valores e imprimir:
// a:Soma dos dados de cada coluna
// b.listar valores menores que a media
var
l,c,i:inteiro
totcolunas:vetor[1..3] de inteiro
A:vetor[1..2,1..3] de inteiro
totcolunas1:inteiro
totcolunas2:inteiro
totcolunas3:inteiro
menormedia:real
media:real
tot:inteiro


inicio
// Seção de Comandos
// pode usar vetor para armazenar os dados

escreval("Digite os dados da matriz:")
para l de 1 ate 2 faca
   para c de 1 ate 3 faca
      leia (A [l,c])
      tot := tot + A[l,c]
      totcolunas[c] := totcolunas[c] + A[l,c]

      se c=1 entao
         totcolunas1:=totcolunas1+A[l,c]
      fimse

      se c=2 entao
         totcolunas2:=totcolunas2+A[l,c]
      fimse

      se c=3 entao
         totcolunas3:=totcolunas3+A[l,c]
      fimse
   fimpara
fimpara

media:=tot/6


escreval("Valores menores que a media: ",media)
para l de 1 ate 2 faca
   para c de 1 ate 3 faca
      se A[l,c] < media entao
         escreva("|",A[l,c])
      fimse
   fimpara
fimpara
escreval

escreval("Impressao da Matriz: ")
para l de 1 ate 2 faca
   para c de 1 ate 3 faca
      escreva(" |",A[l,c])
   fimpara
   escreval
fimpara

para c de 1 ate 3 faca
  escreva("----")
fimpara
escreval

para c de 1 ate 3 faca
  escreva(" |",totcolunas[c])
fimpara
escreval

escreval("Soma Coluna 1 :",totcolunas1)
escreval("Soma Coluna 2 :",totcolunas2)
escreval("Soma Coluna 3 :",totcolunas3)
escreval("Soma Total da Matriz:",tot)
escreval("Media da Matriz:",media)
fimalgoritmo
