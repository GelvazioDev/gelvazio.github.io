//Exercício 35
//Faça um algoritmo que leia Nome idade e sexo de N pessoas. Após a leitura faça:
// a.	Imprima o Nome, idade e sexo das pessoas cuja idade seja maior que a idade da primeira pessoa.
// b.	Imprima o Nome e idade de todas as mulheres.
// c.	Imprima o Nome dos homens menores de 21 anos.

algoritmo "Exercicio35"
var
  NrPessoas:Inteiro
  Nomes: Vetor [1..5] de caracter
  Idades: Vetor [1..5] de inteiro
  Sexo: Vetor [1..5] de caracter
  Cont:inteiro
inicio
  Nrpessoas := 5
  escreval("Entre com o Nome Idade e Sexo do conjunto de pessoas: ")
  Para Cont de 1 ate Nrpessoas faca
    escreva(" | Nome: ")
    Leia(Nomes[Cont])
    escreva(" | Idade: ")
    Leia(Idades[Cont])
    escreva(" | Sexo: ")
    Leia(Sexo[Cont])
    escreval
  FimPara
  limpatela

  //LETRA A
  escreval("Pessoa de idade maior que a primeira: ")
  Para Cont de 1 ate Nrpessoas faca
    Se Idades[Cont] > Idades[1] entao
      EscrevaL(" Nomes:",Nomes[Cont])
      EscrevaL(" Idade:",Idades[Cont])
      EscrevaL(" Sexo:",Sexo[Cont])
      Escreval(" -------")
    FimSe
  FimPara
  Escreval

  //LETRA B
  escreval("Mulheres: ")
  Para Cont de 1 ate Nrpessoas faca
    Se Sexo[Cont] = "F" entao
      EscrevaL(" Nome:",Nomes[Cont])
      EscrevaL(" Idade:",Idades[Cont])
      Escreval(" -------")
    FimSe
  FimPara
  Escreval

  //LETRA C
  escreval("Homens menores de 21 anos: ")
  Para Cont de 1 ate Nrpessoas faca
    Se (Sexo[Cont] = "M") e (Idades[Cont] < 21 ) entao
      EscrevaL(" Nome:",Nomes[Cont])
      Escreval(" -------")
    FimSe
  FimPara
fimalgoritmo
