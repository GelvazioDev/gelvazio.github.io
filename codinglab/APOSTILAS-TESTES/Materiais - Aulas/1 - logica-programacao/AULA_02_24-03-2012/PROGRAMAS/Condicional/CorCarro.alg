algoritmo "Cor do Carro"
// Função :
// Autor :
// Data : 24/3/2012
// Dada uma relacao de  5 nomes de carros,
// imprima quantos sao da cor azul
// Sendo que para cada carro
// tem-se uma ficha contendo a cor e o nome
var

Carro:literal
Cor:literal
nome:literal
Contador:real
qtdcor:real

inicio
    // Seção de Comandos
    qtdcor:=0
    Contador:=1
    enquanto (Contador <= 5) faca
        escreva("Entre com o nome do carro ")
        leia(carro)
        escreva("Entre com a cor do carro ")
        leia(cor)
        
            se Maiusc(cor)="AZUL" entao
                qtdcor:=qtdcor+1
                
            fimse

            Contador:=Contador+1
            fimenquanto
       escreva ("Quantidade de carros com a cor azul ",qtdcor)

fimalgoritmo
