algoritmo "Preco Custo"
        // Função :
        // Autor :
        // Data : 17/3/2012
        //O preco de custo de um automovel e calculado pela soma do:
        //"preco de fabrica  + MAIS;
        //Preco dos impostos (15 %)+ MAIS
        //percentual revendedor (25%)
        //Faca um algoritmo que leia o nome do automovel,preco de fabrica,
        //e imprima o nome e o preco final do carro

var
        //Variaveis de entrada
        vPrecoFabrica:real
        vImpostos:real
        vPercRevendedor:real
        vNomeCarro:literal
        vPrecoCusto:real

inicio
       // Seção de Comandos
       vImpostos:=15
       vPercRevendedor:=25
       Escreval("Escreva o nome do carro")
       Leia(vNomeCarro)
       Escreval("Escreva o valor da fabrica do carro")
       Leia(vPrecoFabrica)

       vPrecoCusto:=vPrecoFabrica + (vPrecoFabrica * (vImpostos/100)) + (vPrecoFabrica * (vPercRevendedor/100))
       //Resultados
       Escreval("Nome do carro ",vNomeCarro)
       Escreval("Preco de custo do carro",vPrecoCusto)
fimalgoritmo

