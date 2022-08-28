algoritmo "Exercicio repita"
// Função :
// Autor :
// Dado o modelo, ano fabricação, cor e placa de 5 carros
// Faca um algoritmo que:
// a)Imprima quantos carros sao da cor verde e o
// percentual em relacao ao total

// b)Imprima quantos foram fabricados antes de 1990
// percentual em relacao ao total

// c)Imprima quantos sao da Fiat e o percentual
// em relacao ao total

var
 modelo           :literal
 anofabricacao    :inteiro
 cor              :literal
 placa            :literal
 percentcor       :real
 percentfabricacao:real
 percentmodelo    :real
 contcor          :real
 contfabricacao   :real
 contmodelo       :real
 Contador         :real

inicio
    // Seção de Comandos
    contfabricacao:=0
    contmodelo:=0
    contcor:=0
    Contador:=1

    enquanto (Contador <=5) faca
        escreva("Entre com o modelo do",Contador,"° carro: ")
        leia(modelo)
        escreva("Entre com o ano de fabricacao: ")
        leia(anofabricacao)
        escreva("Entre com a cor do carro: ")
        leia(cor)
        escreva("Entre com a placa do carro: ")
        leia(placa)
        Contador:=Contador+1
      // a)Imprima quantos carros sao da cor verde e o
      // percentual em relacao ao total
      se Maiusc(cor)="VERDE" entao
          contcor:=contcor+1
      fimse
        // b)Imprima quantos foram fabricados antes de 1990
        // percentual em relacao ao total
        se anofabricacao <1990 entao
            contfabricacao:=contfabricacao+1
        fimse
            // c)Imprima quantos sao da Fiat e o percentual
            // em relacao ao total
            se Maiusc(modelo)="FIAT" entao
                contmodelo:=contmodelo+1
            fimse
      
    fimenquanto
      // Colocar as variaveis do percentual fora do enquanto,
      // pois se estiver dentro ele vai pegar sempre a porcentagem de cada carro digitado
      percentcor:=(contcor/5) *100
      percentfabricacao:=(contfabricacao/5)*100
      percentmodelo:=(contmodelo/5)*100

      escreval ("Quantidade de carros da cor verde              :",contcor)
      escreval ("Porcentagem de carros da cor verde             :",percentcor)
      
      escreval ("Quantidade de carros fabricados antes de 1990  :",contfabricacao)
      escreval ("Porcentagem  de carros fabricados antes de 1990:",percentfabricacao)
      
      escreval ("Quantidade de carros que sao da FIAT           :",contmodelo)
      escreval ("Porcentagem  de carros que sao da FIAT         :",percentmodelo)

fimalgoritmo
