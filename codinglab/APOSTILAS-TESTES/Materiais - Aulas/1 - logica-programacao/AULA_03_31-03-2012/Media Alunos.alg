algoritmo "semnome"
// Função :
// Autor :
// Data : 31/3/2012
// Seção de Declarações
// Dado o nome e notas de n alunos
// a)Imprima nome e media dos alunos aprovados.
// Media >=7
// b)Imprima nome e media dos alunos em recuperacao.
// Media >= 5 < ?
// c)Imprima nome e media dos alunos reprovados
// Media menor que 5
var
nome:literal
nota:real
media:real
soma:real
contnota:inteiro
inicio
// Seção de Comandos
escreval ("Entre com nome do aluno ou F para terminar:")
leia (nome)
//Laco de repeticao para ler um numero indefinido de alunos
//Digita-se F para finalizar a leitura
Enquanto (maiusc (nome) <> "F")faca
   media:=0
   soma:=0
   contnota:=1
   //Laco de repeticao para leitura das 03 notas
   enquanto (contnota <= 3)faca
      escreval ("Entre com a ",contnota,"ª Nota do aluno  ",nome)
      leia(nota)
      //soma o valor total das notas
      soma:=soma+nota
      //incrementa o contador das notas
      contnota:=contnota+1
   fimenquanto

   media:=soma/3

   se (media >=7) entao//nesta condicao so vai entrar media igual ou maior que sete
      escreval("Aluno ",nome," com Media ",media," está Aprovado!")
   senao
      se (media >=5) entao//neste caso a media ja nao e maior ou igual a 7
         escreval("Aluno ",nome," com Media ",media," está em Recuperacao!")
      senao
         escreval("Aluno ",nome," com Media ",media," está Reprovado!")
      fimse
   fimse

   escreval ("Entre com nome do aluno ou F para terminar:")
   //Neste caso vai pedir o nome do novo aluno ou a letra F para finalizar o algoritmo.
   leia (nome)
fimenquanto
fimalgoritmo
