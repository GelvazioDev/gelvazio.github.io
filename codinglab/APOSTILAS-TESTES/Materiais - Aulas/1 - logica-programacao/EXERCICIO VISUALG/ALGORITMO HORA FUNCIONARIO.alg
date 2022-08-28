algoritmo "Programa Ponto Funcionario"
// Função :
// Autor :
// Data : 06/08/2012
// Seção de Declarações
Var
 he,me,hs,ms:inteiro
 horas:inteiro
 minutos:inteiro
 totalminutos:real
 minuto:real
 hora:inteiro
 horaconverte:inteiro
 minutototal:real
Inicio
Escreval("Digite a hora de entrada do funcionario:")
Leia(he) // entrada=14:45 saida  =22:24
Escreval("Digite o minuto de entrada do funcionario:")
Leia(me)
Escreval("Digite a hora de saida do funcionario:")
Leia(hs)
Escreval("Digite o minuto de saida do funcionario:")
Leia(ms)

 Se (he<hs) entao
horas:=(hs*60)-(he*60)
Escreval("Horas:",horas) //total   480
Escreval
minutos:=(ms-me)
Escreval("Minutos:" ,minutos)// total   -21
Escreval
totalminutos:=horas+minutos   //480+(-21);
Escreval("Total de Minutos Trabalhados:",totalminutos) //total 459;
minuto:=totalminutos
totalminutos:=totalminutos/60
horaconverte:=int(totalminutos)
Escreval("O funcionario trabalhou:",horaconverte," Horas!!")
minutototal:=minuto-(horaconverte*60)
Escreval("O funcionario trabalhou Minutos:",minutototal," Minutos!!!")

senao
horas:= (24 * 60)-((he*60)+ me)
Escreval("Horas:",horas) //total   480
Escreval
minutos:=((hs*60)+ms)
Escreval("Minutos:" ,minutos)// total   -21
Escreval
totalminutos:=horas+minutos   //480+(-21);
Escreval("Total de Minutos Trabalhados:",totalminutos) //total 459;
minuto:=totalminutos
totalminutos:=totalminutos/60
horaconverte:=int(totalminutos)
Escreval("O funcionario trabalhou:",horaconverte," Horas!!")
minutototal:=minuto-(horaconverte*60)
Escreval("O funcionario trabalhou Minutos:",minutototal," Minutos!!!")

fimse
fimalgoritmo
