algoritmo "semnome"
// Função :
// Autor :
// Data : 13/04/2012
// Exercício 35
//Faça um algoritmo que leia Nome idade e sexo de N pessoas. Após a leitura faça:
// a.	Imprima o Nome, idade e sexo das pessoas cuja idade seja
// maior que a idade da primeira pessoa.
// b.	Imprima o Nome e idade de todas as mulheres.
// c.	Imprima o Nome dos homens menores de 21 anos.
var
 nome:literal
 idade:inteiro
 sexo:literal
 contador:inteiro
 primeira:inteiro
 mulher:inteiro
 menoridade:inteiro
 npessoas:inteiro
inicio
// Seção de Comandos
 npessoas:=5

  escreval("Digite as  pessoas")

 para contador de 1 ate npessoas faca
 escreval("Digite nome do aluno: ")
 leia(nome[contador])
 escreval("Digite idade do aluno: ")
 leia(idade [contador])
escreval("Digite sexo do aluno: ")
 leia(sexo [contador])
fimpara

 para primeira de 1 ate npessoas faca
  se idade > primeira  entao
  primeira:=idade      [1]

  escreva("Nome Maior idade: ",nome   [primeira])
  escreva("Idade Maior idade: ",idade [primeira])
  escreva("Sexo Maior idade: ",sexo   [primeira])
 fimpara

para  mulher de 1 ate npessoas faca
 se maiusc sexo = "M" entao

  escreva("Nome Mulher: ",nome   [mulher])
  escreva("Idade Mulher: ",idade [mulher])
  escreva("Sexo Mulher: ",sexo   [mulher])
  fimpara
  
  para   menoridade de 1 ate npessoas faca
  se maiusc sexo = "H" e idade < 21 entao

  escreva("Nome Homem menor 21 anos: ",nome   [menoridade])
  escreva("Idade Homem menor 21 anos: ",idade [menoridade])
  escreva("Sexo Homem menor 21 anos: ",sexo   [menoridade])
  fimpara
   
   
 fimpara
 
 fimpara
 
 














 
fimalgoritmo
