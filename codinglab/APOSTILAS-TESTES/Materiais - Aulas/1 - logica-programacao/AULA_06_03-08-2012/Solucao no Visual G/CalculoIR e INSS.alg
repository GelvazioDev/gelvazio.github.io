algoritmo "semnome"
// Função :
// Autor :
// Data : 09/08/2012
//Tabela INSS
//TABELA VIGENTE
//Tabela de contribuição a partir de 1º de Janeiro de 2012
//Salário-de-contribuição (R$)	Alíquota para fins de recolhimento
//ao INSS (%)
//até 1.174,86	8,00
//de 1.174,87 até 1.958,10	9,00
//de 1.958,11 até 3.916,20	11,00

//Tabela IR
//Base de cálculo anual em R$
//Alíquota %	 Parcela a deduzir do imposto em R$
//Até 18.799,32	
//De 18.799,33 até 28.174,20  =  7,5 % que da=1.409,95
//De 28.174,21 até 37.566,12  =  15,0 % que da 3.523,01
//De 37.566,13 até 46.939,56  =  22,5% que da 6.340,47
//Acima de 46.939,56	         = 27,5 % que da 8687,45
//Dica  Salario={Salario bruto-(Salario bruto*INSS)}*IR;
var
  salariobruto:real
  salarioliquido:real
  IR:real
  INSS:real
  desconto:real
  nome:literal
inicio
Escreval("Digite o nome do funcionario")
leia(nome)
Escreval("Digite o salario mensal bruto do funcionario")
leia(salariobruto)

se(salariobruto< 1174.86)entao
  INSS:=salariobruto * 0.08
  escreva("INSS",INSS)
se((salariobruto <= 1958.10) e (salariobruto>1174.86))entao
  INSS:=salariobruto*0.09
se((salariobruto <= 1958.10) e (salariobruto>1174.86))entao
  INSS:=salariobruto*0.11

se(salariobruto<=(18799.32/12)) entao
IR:=0
se ((salarioaruto > 18799.32/12) e (salariobruto>28174.20/12))entao
IR:=1409.95/12
se ((salariobruto > 28174.20/12) e (salariobruto>37566.12/12))entao
IR:=3523.01/12
se ((salariobruto > 37566.13/12) e (salariobruto>46939.56/12))entao
IR:=6340.47/12
senao
IR:=8687.45/12	
//Dica  Salario={Salario bruto-(Salario bruto*INSS)}*IR;
salarioliquido:=((salariobruto-INSS)-IR)

fimse
fimse
fimse
 fimse

fimse
fimse
 fimse
Escreva("O funcionario ",nome, "teve o salario de ",salarioliquido)

fimalgoritmo
