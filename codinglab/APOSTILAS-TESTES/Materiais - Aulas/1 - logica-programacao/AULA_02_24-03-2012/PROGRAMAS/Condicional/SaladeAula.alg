algoritmo "Idade Maior que 30"
// Função :
// Autor :
// Data : 24/3/2012
// Suponha que para cada aluno de uma sala
// exista uma ficha contendo o nome e a idade de
// 05 alunos.Faca algoritmo que determine
// quantos alunos tem idade maior que 30.
var
 aluno   :literal
 idade   :real
 qtdaluno:real
 maior30 :real
 Contador:real


inicio
    // Seção de Comandos
    maior30:=0
    Contador:=1

    enquanto (Contador <=5) faca
        escreva("Entre com o nome do aluno: ")
        leia(aluno)
        escreval("Entre com a idade do: ",Contador, "° aluno")
        leia(idade)
        
        se idade > 30 entao
            maior30:=maior30+1
        fimse
        

          Contador:=Contador+1
    fimenquanto

      escreval ("Quantidade de  alunos que tem idade maior que 30 anos:",maior30)

fimalgoritmo
