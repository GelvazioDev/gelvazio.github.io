Algoritmo "exercicio1"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi

// Descrição   :  Faça um algoritmo que leia os valores A, B, C
// e imprima na tela se a soma de A + B é menor que C.

// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 26/07/2022
Var
   // Seção de Declarações das variáveis

   a,b,c:inteiro;

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...

   escreva("Informe o valor de a")
   leia(a)
   escreva("Informe o valor de b")
   leia(b)
   escreva("Informe o valor de c")
   leia(c)

   escreval("Forma 2")

   se (a + b < c) entao
      escreval("A soma de A + B é menor que C!")
   fimse

   // 30 no c
   se (a + b = c) entao
      escreval("A soma de A + B é igual a C!")
   fimse

   // 15 15 = 30 maior que c que e 15
   se (a + b > c) entao
      escreval("A soma de A + B é maior que C!")
   fimse

Fimalgoritmo




