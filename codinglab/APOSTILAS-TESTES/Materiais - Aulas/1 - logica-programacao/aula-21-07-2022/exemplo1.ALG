Algoritmo "semnome"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 21/07/2022
Var
// Seção de Declarações das variáveis 

nomePessoa:caractere;

idade:inteiro;

// media de 3 notas
media:real;

notaum:real;
notadois:real;
notatres:real;

quantidadeNotas:inteiro;
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 

// atribui ao valor da variavel
nomePessoa := "Gelvazio"

idade := 36;

Escreval("Meu nome é ", nomePessoa, " e tenho ", idade, " anos de idade")

media := (5 + 5 + 5) / 3

// exemplo de media
escreval("a media e", media)

notaum   := 7;
notadois := 5;
notatres := 4;

media := (notaum + notadois + notatres ) / 3

escreval("a media 2 e", media)
escreval("")
// calculando media recebendo dados do usuario

Escreval("Informa quantas notas voce quer digitar:")

// guarda o valor na memoria
Leia(quantidadeNotas);

// testar com 3
Escreval("a quantidade de notas e", quantidadeNotas)

media := (notaum + notadois + notatres ) / quantidadeNotas;

escreval("A media 3 é: ", media)



Fimalgoritmo