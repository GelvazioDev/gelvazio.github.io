algoritmo "Exemplo if"
// Função :
// Autor :
// Data : 17/3/2012
// Faca um algoritmo que leia dois valores A,B
//Se valores forem iguais devera se somar os dois ,
//caso contrario,multiplique A por B
//Ao final  do calculo, atribuir e imprimir o valor para a
//variavel C
var
    A:inteiro
    B:inteiro
    C:inteiro
inicio
    // Seção de Comandos
    escreval("Escreva o valor de A")
    leia(A)
    escreval("Escreva o valor de B")
    leia(B)
    escreval

    se  A = B entao
        C:=A+B
        //rotina otimizada
        senao
            C:= A * B  entao
        fimse
    escreval ("Valor de C é, ",C)
fimalgoritmo
