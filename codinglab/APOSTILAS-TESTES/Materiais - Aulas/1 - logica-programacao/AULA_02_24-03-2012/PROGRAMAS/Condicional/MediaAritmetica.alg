algoritmo "Cor do Carro"
// Função :
// Autor :
// Data : 24/3/2012
// Dada uma serie de  5 valores,
// faca um algoritmo que calcule e
// escreva a media destes .Entretanto, se a media obtida for maior que 8,
// devera ser atribuido 10 para a media.
var

valor:real
media:real
Contador:real
soma:real

inicio
    // Seção de Comandos
    soma:=0
    Contador:=1
     // 0 1 2 3 4 5
    enquanto (Contador <=5) faca
    // Contador<=5, neste caso o valor vai estar contando ate o numero 5
    // e Caso mande imprimir o valor do contador o mesmo sera o proprio numero, Contador na posicao =1 Um
    // Contador<5 , neste caso o contador vai iniciar da posicao normal posicao 0 Zero
    // mas caso imprima o valor do contador, o valor sera por exemplo
    // na posicao 5 imprimira o valor "4", pois o contador iniciou a contagem na posicao zero
        escreva("Entre com a nota: ",Contador, "° valor")
        leia(valor)
          soma := soma + valor
          Contador:=Contador+1
    fimenquanto
    
    media := soma/(Contador-1)
    // Contador-1, porcausa que o contador inicia em Contador:=1
    // Caso nao tenha isso o Contador vai pegar mais 1 valor.
      escreval ("A media sem mudar  ",media)
        se  media >=8 entao
            media :=10
        fimse
    escreva ("A media e  ",media)

fimalgoritmo
