algoritmo "semnome"
// Função :
// Autor :
// Data : 31/3/2012
// Seção de Declarações
// Um hotel cobra 300 R$ por diaria e mais uma taxa adicional
// de servicos
// Se o numero de diarias for menor que 15 a taxa adicional e 15 R$
// Se o numero de diarias for igual a 15 a taxa e de 14 R$
// Se o numero de diarias for maior que 15 a taxa e de 12 R$
// Sendo que se tem 5 pessoas no hotel, e cada uma tem um registro com seu
// nome e numero diarias
// Faca um algoritmo que:
// imprima o nome de cada pessoa;
// imprima o total a pagar de cada pessoa
// imprima tambem o total ganho pelo hotel:
// imprima o numero total de diarias.
var
diaria:real
taxa:real
contador:inteiro
nome:literal
totdiaria:real
totdinheirohotel:real
valor:real


inicio
// Seção de Comandos
contador:=1
enquanto (contador <=5) faca
   escreval ("Digite o nome da",contador,"ª pessoa:")
   leia(nome)
   escreval ("Digite a quantidade de diarias:")
   leia(diaria)

   se (diaria <15) entao
      valor:=(300 * diaria )+ 20
   senao //usar o senao em uma linha e o se em outra linha
      se (diaria = 15) entao
         valor:=(300 * diaria )+ 14
      senao
         valor:=(300 * diaria )+ 12
      fimse
   fimse

   escreval("O nome da pessoa e :",nome,"valor a pagar e :",valor)

   totdiaria:= totdiaria+diaria
   totdinheirohotel:= totdinheirohotel+valor
   contador:=contador+1
fimenquanto
//total de diarias
escreval ("O Total ganho pelo hotel e de :",totdinheirohotel )
escreval ("O Total de diarias do hotel e de :",totdiaria)
//total pago


fimalgoritmo
