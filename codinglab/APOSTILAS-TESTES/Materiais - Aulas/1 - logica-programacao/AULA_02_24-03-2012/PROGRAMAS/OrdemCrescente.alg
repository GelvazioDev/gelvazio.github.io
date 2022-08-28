algoritmo "MenorNumerodeTres"
// Função :
// Autor :
// Data : 24/3/2012
// Faca um algoritmo que leia  tres numeros digitados,
//e os coloque em ordem crescente
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


//menor sera o numero um n1
se((n1<=n2) e(n1<=n3)) e (n2<=n3)entao
   menor:=n1
   maior:=n3
   intermediario:=n2
senao
    se((n1<=n2) e(n1<=n3)) e (n3<=n2) entao
          menor:=n1
          maior:=n2
          intermediario:=n3
    senao//menor sera o numero Dois n2
        se ((n2<=n1) e(n2<=n3)) e (n1<=n3) entao
          menor:=n2
          maior:=n3
          intermediario:=n1
          senao
              se ((n2<=n1) e(n2<=n3)) e (n3<=n1) entao
                  menor:=n2
                  maior:=n1
                  intermediario:=n3
                  senao//menor sera o numero Tres n3
                      se ((n3<=n1) e(n3<=n2)) e (n1<=n2) entao
                          menor:=n3
                          maior:=n2
                          intermediario:=n1
                          senao
                              se ((n3<=n1) e(n3<=n2)) e (n2<=n1) entao
                                  menor:=n3
                                  maior:=n1
                                  intermediario:=n2
                                  senao
                                      se (n3=n1) e (n3=n2)e (n2=n1)
                                          escreva ("Os tres valores sao iguais ")
                                  fimse
                          fimse
                   fimse
              fimse
          fimse
    fimse
fimse
    escreval ("Menor        :" ,menor)
    escreval ("Intermediario:" ,intermediario)
    escreval ("Maior        :" ,maior)
fimalgoritmo
