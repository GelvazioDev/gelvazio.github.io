algoritmo "semnome"
// Função :
// Autor :
// Data : 14/4/2012
// Seção de Declarações
//
var
media:real
nota:inteiro
totalnotas:real
aluno:literal
cont,cont2:inteiro


funcao calculamedia(totalnotas:real;nralunos:inteiro):real
inicio
retorne totalnotas/nralunos
fimfuncao

inicio
para cont de 1 ate 5 faca
   escreval("Nome do Aluno:")
   leia(aluno)
   totalnotas:=0

   escrevaL("Notas do aluno:")
   para cont de 1 ate 3 faca
      leia(nota)
      totalnotas:=totalnotas+nota
      escrevaL("Notas do aluno:")
   fimpara

   media:=calculamedia(totalnotas,3)
   escreval("Media do aluno: ",aluno," é ",media)
fimpara
fimalgoritmo
