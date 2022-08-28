Algoritmo "Ex. 8"

// Descri??o   : Escreva um algoritmo que
// leia tres valores inteiros
// e diferentes e mostre-os em ordem decrescente.
// Autor(a)    : Yasmim A. Roeder
// Data atual  : 24/07/2022
Var
   a, b, c: inteiro
   maior, menor, meio : inteiro
Inicio

   escreval ("Insira tres numero inteiros diferentes")
   leia (a, b, c)

	// teste 1 = 1 2 3   =>maior:3  meio:2 menor: 1
	// teste 2 = 3 2 1   =>maior:3  meio:2 menor: 1
	// teste 3 = 3 20 1  =>maior:20 meio:3 menor: 1
	// teste 3 = 1 20 3  =>maior:20 meio:3 menor: 1
	
   limpatela

   se (a>b) e (a>c) entao
      maior := a
      se (b>c) entao
         meio := b
         menor := c
      senao
         se (c>b) entao
            meio := c
            menor := b
         fimse
      fimse
   senao
      se (b>a) e (b>c) entao
         maior := b
         se (a>c) entao
            meio := a
            menor := c

         senao
            se (c>a) entao
               meio := c
               menor := a
            fimse
         fimse
      senao
         se (c>a) e (c>b) entao
            maior := c
            se (a>b) entao
               meio := a
               menor := b

            senao
               se (b>a) entao
                  meio := b
                  menor := a
               fimse

            fimse

         fimse
      fimse
   fimse

   Escreval ("A ordem decrescente ?: ", maior, ", ", meio, ", ", menor)


Fimalgoritmo