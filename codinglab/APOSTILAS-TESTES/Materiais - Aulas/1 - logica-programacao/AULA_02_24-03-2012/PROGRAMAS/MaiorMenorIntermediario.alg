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
maior:real
intermediario:real



inicio
// Seção de Comandos
escreva ("Escreva o primeiro numero: ")
leia (n1)
escreva ("Escreva o segundo numero: ")
leia (n2)
escreva("Escreva o primeiro numero: ")
leia (n3)



se((n1<n2) e(n1<n3)) e n2>n1) e    entao
   menor:=n1
   maior:=n2
senao
    se(n2<n1) e (n2<n3) entao
          menor:=n2
    senao
        se (n3<n1) e (n3<n2) entao
           menor:=n3
        senao
            se (n3=n1) e (n3=n2)
             escreva ("Os tres valores sao iguais ")
        fimse
    fimse
fimse

 //Maior numero
se((n2<n2) e(n1<n3))entao
   maior:=n2
senao
    se(n2<n1) e (n2<n3) entao
          menor:=n2
    senao
        se (n3<n1) e (n3<n2) entao
           menor:=n3
        senao
            se (n3=n1) e (n3=n2)
             escreva ("Os tres valores sao iguais ")
        fimse
    fimse
fimse

 //numero intermediario
se((n1<n2) e(n1<n3))entao
   menor:=n1
senao
    se(n2<n1) e (n2<n3) entao
          menor:=n2
    senao
        se (n3<n1) e (n3<n2) entao
           menor:=n3
        senao
            se (n3=n1) e (n3=n2)
             escreva ("Os tres valores sao iguais ")
        fimse
    fimse
fimse
    escreval ("Maior " ,maior)
    escreval ("Menor " ,menor)
    escreval ("Intermediario " ,intermediario)

fimalgoritmo
