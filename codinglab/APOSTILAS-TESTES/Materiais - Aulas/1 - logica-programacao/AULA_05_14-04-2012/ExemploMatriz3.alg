algoritmo "semnome"
// Função :
// Autor :
// Data : 14/4/2012
// Seção de Declarações
// Dado uma matriz A de ordem 3x3 faca um algoritmo que:
// a.Calcule a soma dos elementos da primeira coluna
// b.calcule o produto dos elementos da primeira linha
// c.calcule a soma de todos os elementos da matriz;
// d.Calcule a soma da diagonal principal
var
l,c:inteiro
A:vetor [1..3,1..3] de inteiro
soma1coluna:inteiro
produto1linha:inteiro
somamatriz:inteiro
somadiagonal:inteiro


inicio
// Seção de Comandos
  produto1linha:=1
escreval("Digite os dados da matriz")
para l de 1 ate 3 faca
   para c de 1 ate 3 faca
      escreva(A+1[l,c])


      se c=1  entao
         soma1coluna:=soma1coluna+A[l,c]
      fimse

      se l=1 entao

         produto1linha:=produto1linha *( A[l,c])
      fimse


      se  l=c entao
         somadiagonal:= somadiagonal + (A[l,c])
      fimse

      se (l = c ) ou (l <> c) entao
         somamatriz:=somamatriz+(A[l,c])
      fimse
   fimpara
fimpara

escreval("Dados da matriz:")
para l de 1 ate 3 faca
   para c de 1 ate 3 faca
      escreva(A[l,c])
   fimpara
   escreval
fimpara


escreval
escreval("Soma elementos da 1 coluna ")
escreval(soma1coluna)
escreval
escreval("Produto elementos da 1 linha: ")
escreva(produto1linha)
escreval
escreval("Soma elementos da diagonal")
escreval(somadiagonal)
escreval
fimalgoritmo
