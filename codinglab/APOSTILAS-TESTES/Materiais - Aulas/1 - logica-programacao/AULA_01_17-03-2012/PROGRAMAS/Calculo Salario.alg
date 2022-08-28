algoritmo "CALCULAMEDIA"
     // Função :
     // Autor :
     // Data : 17/3/2012
     // Dados as seguintes informaçoes de um funcionario:
     //O salario bruto teve um reajuste de 38%.
     //O funcionario recebera uma gratificação de 20% do salario bruto.
     //O salario total é descontado 15% para encargos.
     //Faca um algoritmo para:
     //Imprimir Nome,idade e cargo
     //Imprimir o salario bruto
     //Imprimir o salario liquido
var
       // Variaveis de entrada
       vNome: literal
       vIdade:literal
       vCargo:literal
       vReajuste: real
       vEncargos:real
       vGratificacao: real
       vSalarioBruto:real
       vSalarioLiquido:real
inicio
       // Seção de Comandos
       Escreval("Escreva o nome do funcionario")
       Leia(vNome)
       Escreval("Escreva a idade do funcionario")
       Leia(vIdade)
       Escreval("Escreva o cargo do funcionario")
       Leia(vCargo)
       Escreval("Escreva o salario bruto do funcionario")
       Leia(vSalarioBruto)
       Escreval("Escreva o valor de reajuste do salario do  funcionario")
       Leia(vReajuste)
       Escreval("Escreva o valor da gratificacao do salario do  funcionario")
       Leia(vGratificacao)
       Escreval("Escreva o valor de encargos do salario do  funcionario")
       Leia(vEncargos)
       vSalarioLiquido:= vSalarioBruto+((vSalarioBruto*(vReajuste/100))+(vSalarioBruto*(vGratificacao/100))- (vSalarioBruto*(vEncargos/100)))
       //Resultados
       Escreval("Nome do funcionario ",vNome)
       Escreval("Idade do funcionario ",vIdade)
       Escreval("Cargo do funcionario ",vCargo)
       Escreval("Salario Bruto do funcionario ",vSalarioBruto)
       Escreval("O salario liquido e de ",vSalarioLiquido)
fimalgoritmo

