algoritmo "MenorNumerodeTres"
// Função :
// Autor :
// Data : 24/3/2012
// Faca um algoritmo que leia o menor numero de tres digitados
var

n1:real
n2:real
n3:real
menor:real



inicio
// Seção de Comandos
escreva ("Escreva o primeiro numero: ")
leia (n1)
escreva ("Escreva o segundo numero: ")
leia (n2)
escreva("Escreva o primeiro numero: ")
leia (n3)



se(n1<n2) e(n1<n3) entao
    escreva ("Menor e ",n1)
senao
    se(n2<n1) e (n2<n3) entao
        escreva ("Menor e ",n2)
    senao
        se (n3<n1) e (n3<n2) entao
            escreva ("Menor e ",n3)
        senao
            escreva ("Os tres valores sao iguais ")
        fimse
    fimse
fimse

fimalgoritmo
