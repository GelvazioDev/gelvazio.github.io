Algoritmo "exercicio1"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi

// Descrição   :
// Faça um algoritmo que leia o nome,
// o sexo("F" ou "M") e o estado civil de uma pessoa.
// Caso sexo seja “F” e estado civil seja “CASADA”,
// solicitar o tempo de casada (anos).

Var
   // Seção de Declarações das variáveis
    nome:caractere;
	sexo:caractere;
	estadocivil:caractere;
	tempocasada:inteiro;
Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...

	escreval("Informe o nome:")
	leia(nome)

	escreval("Informe o sexo, sendo F - feminino e M - masculino:")
	leia(sexo)

	escreval("Informe o estado civil, sendo CASADA ou SOLTEIRO OU NAMORANDO:")
	leia(estadocivil)

	//mostra os dados lidos
	escreval("Meu nome e: ", nome)

	se sexo = "F" entao
		escreval("Sou do sexo feminino")
	senao
		escreval("Sou do sexo masculino")
	fimse

    escreval("Meu estado civil e: ", estadocivil)
    
	se (sexo = "F") e (estadocivil = "CASADA") entao
		// condicional
		escreval("Informe o tempo de casada em anos: ")
		leia(tempocasada)

		escreval("Estou casada há ", tempocasada, " anos")
	fimse

// validando caractere
// se sexo = "1"

// validando co inteiro
// se sexo = 1

Fimalgoritmo




