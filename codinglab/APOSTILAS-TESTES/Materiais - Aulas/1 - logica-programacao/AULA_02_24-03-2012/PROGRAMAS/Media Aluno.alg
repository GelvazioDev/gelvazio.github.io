algoritmo "Media Aluno"
// Função :
// Autor :
// Data : 24/3/2012
// Faca um algoritmo que leia o nome e as tres notas  de um aluno
//e ao final, escreva o seu nome,
//sua media e se ele foi aprovado.
//Media de aprovacao igual a 8.
var
nome:literal
nota1:real
nota2:real
nota3:real
media:real

inicio
// Seção de Comandos 
 escreval("Escreva o nome do aluno")
leia (nome)
escreval ("Escreva a  nota um do aluno")
leia (nota1)
escreval ("Escreva a  nota dois do aluno")
leia (nota2)
escreval("Escreva a  nota tres do aluno")
leia (nota3)

media := (nota1+nota2+nota3)/3


se media >= 8   entao
escreval("O aluno ",nome," tem a media de , ",media, " e esta Aprovado!!")
senao
escreval("O aluno ",nome," tem a media de , ",media, " e esta Reprovado!!")
fimse




fimalgoritmo
