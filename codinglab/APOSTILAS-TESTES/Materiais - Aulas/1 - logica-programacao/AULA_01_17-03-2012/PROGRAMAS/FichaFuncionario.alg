algoritmo "Ficha Cliente"
     // Função :
     // Autor :
     // Data : 17/3/2012
     //Uma empresa tem para um detereminado funcionario uma ficha contendo o nome,
     //numero de horas trabalhadas e o nro de  dependentes de um funcionario
     // Considerando que:
     // a)A empresa paga 10 reais por hora e 20 reais por dependentes
     //b)Sobre o salario sao feitos descontos de 8,5 % para o INSS e 5% para IR.
     //Faca um algoritmo para ler o Nome,numero horas trabalhadas e numero de dependentes do funcionario
     //Apos a leitura,escreva qual o nome ,salario bruto,valores descontados para cada tipo de imposto (INSS,IR)
     //e finalmente qual o salario liquido do funcionario.
var
     // Variaveis de entrada
       vNome: literal
       vHoras:real
       vTotHoras:real
       vSalHora:real
       vInss: real
       vTotInss:real
       vIR:real
       vTotIR:real
       vDependentes: real
       vVLDependente:real
       vSalarioBruto:real
       vSalarioLiquido:real
inicio
       // Seção de Comandos
       vSalHora:=10
       vInss:=8.5
       vIR:=5.0
       vVLDependente:=20
       Escreval("Escreva o nome do funcionario")
       Leia(vNome)
       Escreval("Escreva o numero de dependentes do funcionario")
       Leia(vDependentes)
       Escreval("Escreva o total de horas do  funcionario")
       Leia(vHoras)

       vSalarioBruto:=(vSalHora * vHoras)+ (vDependentes * vVLDependente)
       vTotInss:=vSalarioBruto * (vInss/100)
       vTotIR:= vSalarioBruto * (vIR/100)

       vSalarioLiquido:= vSalarioBruto - (vTotInss + vTotIR)
       
       //Resultados
       Escreval("Nome do funcionario ",vNome)
       Escreval("Salario Bruto do funcionario ",vSalarioBruto)
       
       Escreval("O valor descontado de INSS e de ",vTotInss)
       Escreval("O valor descontado de IR e de ",vTotIR)
       Escreval("Salario liquido do funcionario ",vSalarioLiquido)
fimalgoritmo

