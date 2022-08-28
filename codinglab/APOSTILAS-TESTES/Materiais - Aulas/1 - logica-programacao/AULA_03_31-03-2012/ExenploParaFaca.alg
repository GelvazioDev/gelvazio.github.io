algoritmo "semnome"
// Função :
// Autor :
// Data : 31/3/2012
// Seção de Declarações
// Uma empresa tem 5 vendedores que ganham
// por comissao sobre cada produto vendido
// cada vendedor em um determinado mes
// vendeu x produtos, onde cada produto pode ou nao ter
// precos iguais
// A empresa deseja obter um relatorio com o Nome,total de vendas
// e o valor a ser pago a cada vendedor
// A comissao paga pela empresa e de 30 %
// sobre o valor de cada produto vendido.
var
contador:inteiro
comissao:real
nome:literal
preco:real
venda:real
qt:real

inicio
// Seção de Comandos

para contador de 1 ate 5 faca
   //neste para ele incrementa o contador
   //sem precisar colocar contador:=contador+1
   // tambem naom precisa iniciar com 1
   escreval ("Digite o nome do ",contador,"º vendedor")
   leia(nome)
   escreval ("Entre com a quantidade vendida")
   leia (qt)
   escreval ("Entre com o preco do produto:")
   leia (preco)
   comissao := ((preco * qt)* 30/100)

   venda:=venda+(preco * qt)
   escreval("Nome vendedor: ",nome," vendeu o valor de :",comissao)

fimpara
escreva("Total de vendas",venda)

fimalgoritmo
