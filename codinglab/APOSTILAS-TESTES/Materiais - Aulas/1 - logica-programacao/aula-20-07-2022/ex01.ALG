Algoritmo "semnome"
// Crie uma variavel e coloque o seu
// nome nela e mostre na tela;

Var
// Seção de Declarações das variáveis 

nome:caracter;
// meses da ultima atualizacao
data:inteiro;
ativo:logico;
Inicio
   nome := "Gelvazio Camargo"
   // em meses
   data := 5;
   
   // Regra de negocios:Sistema tem uma regra de negocios, que
   // desativa cliente com data de atualizacao de
   // cadastro maior que 3 meses
   
   // booleano - cadastro do cliente inicia ativo
   Escreval("Data atualizacao do cadastro", data)
   // rotina 1
   // cliente com cadastro atualizado a mais de 3 meses
   se data > 3 entao
      ativo := falso;
      Escreval("Meu cadastro esta com situacao inativo!")
   senao
      ativo := verdadeiro;
      Escreval("Meu cadastro esta com situacao ativo!")
   fimse
   
   // rotina 2
   // Calcular limite de credito dos clientes ativos
   se ativo = verdadeiro entao
      Escreval("Calculando limite de credito...")
   senao
      Escreval("Cliente com cadastro inativo!Consulte a loja!")
      Escreval("Data de atualizacao cadastro maior que 3 meses.")
      Escreval("Ultima atualizacao há:", data, " meses")
   fimse
   
Fimalgoritmo