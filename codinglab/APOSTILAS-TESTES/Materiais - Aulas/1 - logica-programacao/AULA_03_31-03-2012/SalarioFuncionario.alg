algoritmo "semnome"
// Função :
// Autor :
// Data : 31/3/2012
// Seção de Declarações
// Dado Nome e salario de um numero indeterminado
// de funcionarios,
// imprima o nome e o salario do funcionario
// que tem o maior salario,
// bem como o nome do funcionario que possuir o menor salario
var
nome:literal
salario:real
nomesalmaior:literal
nomesalmenor:literal
menorsalario:real
maiorsalario:real
inicio
// Seção de Comandos
escreval ("Digite o nome do funcionario ou F para terminar")
leia (nome)
se maiusc (nome) <> "F" entao

   escreval("Digite o salario")
   leia(salario)
fimse
maiorsalario:=salario
menorsalario:=salario
nomesalmenor:=nome
nomesalmaior:=nome

enquanto (maiusc (nome) <> "F") faca
   se (salario > maiorsalario) entao
      maiorsalario:=salario
      nomesalmaior:=nome
   fimse

   se (salario < menorsalario)entao
      menorsalario:=salario
      nomesalmenor:=nome
   fimse

   escreval ("Digite o nome do funcionario ou F para terminar")
   leia (nome)
   se maiusc (nome) <> "F" entao

      escreval("Digite o salario")
      leia(salario)
   fimse
fimenquanto

escreval ("Nome funcionario salario maior ",nomesalmaior," com o salario de ",maiorsalario)
escreval ("Nome funcionario salario menor ",nomesalmenor," com o salario de ",menorsalario)

fimalgoritmo
