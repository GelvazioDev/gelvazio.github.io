Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 21/07/2022
Var
// Seção de Declarações das variáveis 

NB:real;
NA:caractere;
NMAT:inteiro;
SX:caractere;
nome:caracter;
sobrenome:caracter;

idade:inteiro;
saldoDiponivel:real;
valorCarteira:real;

temIdadeFazerCarteira:logico;
temDinheiroFazerCarteira:logico;

variavelTeste:caractere;

Inicio
// exemplo operadores
// EXEMPLO OPERADOR E
// ALGORITMO:
// VALIDACAO PARA VER SE POSSO TIRAR A
// CARTEIRA DE MOTORISTA

idade          := 19;
saldoDiponivel := 3500;
valorCarteira  := 2200;

temIdadeFazerCarteira := FALSO;
se (idade > 18) entao
   temIdadeFazerCarteira := VERDADEIRO;
fimse

temDinheiroFazerCarteira := FALSO;
se (saldoDiponivel > valorCarteira) entao
   temDinheiroFazerCarteira := VERDADEIRO;
fimse

se temIdadeFazerCarteira E temDinheiroFazerCarteira entao
   escreval("Posso tirar a carteira e pagar!")
fimse

variavelTeste := "Joao";


escreva("refrirador: " , variavelTeste);


Fimalgoritmo