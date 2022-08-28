//Exercício 36
//Faça um algoritmo que leia Nome e notas (total de 4) de 5 alunos de um colégio. Após a leitura faça:
// a.	Imprima o Nome e a média dos alunos aprovados (Média >= 7.0).
// b.	Imprima o Nome e a média dos alunos em Recuperação (5.0 >= Média < 7.0).
// c.	Imprima o Nome e a média dos alunos reprovados (Média < 5.0).
// d.	Imprima o percentual de alunos aprovados.
// e.	Imprima o percentual de alunos reprovados.
algoritmo "Exercicio36"
var
  Nomes: Vetor[1..5] de caracter
  Notas: Vetor[1..4] de real
  Nralunos: Inteiro
  cont,cont2: Inteiro
  Media, TotalNotas: Real
  Nraprovados, Nrreprovados:Inteiro
  Percaprovados, Percreprovados: Real
inicio
  Percaprovados := 0
  Percreprovados := 0
  Nralunos := 5

  Para cont de 1 ate Nralunos faca
    escreval("Entre com o nome do aluno: ")
    Leia(Nomes[cont])
    TotalNotas := 0

    Para cont2 de 1 ate 4 faca
      escreval("Informe a ", Cont2,"ª nota do aluno:")
      Leia(Notas[cont2])
      TotalNotas := TotalNotas + Notas[cont2]
    FimPara
    Escreval

    Media := TotalNotas / 4

    escreval("Resultado:")
    Se Media >= 7 entao
      EscrevaL("Aluno ", Nomes[cont]," Aprovado com média ", Media)
      Nraprovados := Nraprovados + 1
    Senao
      Se Media < 5 entao
        EscrevaL("Aluno ", Nomes[cont]," Reprovado com média ", Media)
        Nrreprovados := Nrreprovados + 1
      Senao
        EscrevaL("Aluno ", Nomes[cont]," em Recuperacao com média ", Media)
      FimSe
    FimSe
    Escreval
  FimPara
  
  Escreval
  Percaprovados := (Nraprovados / Nralunos) * 100
  Escreval("Percentual de Aprovados:")
  EscrevaL(Percaprovados," % aprovados")

  Percreprovados := (Nrreprovados / Nralunos) * 100
  Escreval("Percentual de Reprovados:")
  EscrevaL(Percreprovados," % reprovados")
fimalgoritmo
