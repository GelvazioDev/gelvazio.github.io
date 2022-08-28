algoritmo "Exemplo if"
// Função :
// Autor :
// Data : 17/3/2012
// Faca um algoritmo que leia os valores A,B,C
//e diga se a soma de A + B é menor que C
var
    vA:inteiro
    vB:inteiro
    vC:inteiro
inicio
    // Seção de Comandos
    escreval("Escreva o valor de A")
    leia(vA)
    escreval("Escreva o valor de B")
    leia(vB)
    escreval("Escreva o valor de C")
    leia(vC)
    escreval

    se vC < (vA+vB)entao
      escreval("C é menor que A+ B")
      //rotina otimizada
    senao
        se vC  >(vA + vB) entao
            escreval ("vC é maior que o valor de vA + vB")
        senao
            escreval("vC é igual a valor de vA + vB")
        fimse
    fimse
fimalgoritmo
