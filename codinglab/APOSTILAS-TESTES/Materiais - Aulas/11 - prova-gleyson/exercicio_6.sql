/*1. Insira os seguintes registros na tabela de logradouros:*/

INSERT INTO treina.tblogradouro (logtipo,logdescricao) 
VALUES ('TRAVESSA','CINCO'),
	   ('AVENIDA','CINCO'),
	   ('AVENIDA','SEIS'),
	   ('RUA','CINCO')


/*	
	2. Insira os seguintes registros na tabela de pessoas:
	('ANTONIO WILSON', MASCULINO,  FÍSICA, 'TRAVESSA CINCO')
	('ELISANE PORTELA','FEMININO','FÍSICA','AVENIDA CINCO'),
	('FERNANDES DE SOUZA','MASCULINO','FÍSICA','AVENIDA SEIS'),
	('MERCEARIA','OUTRO','JURÍDICA','RUA CINCO'),
	
*/


INSERT INTO treina.tbpessoa (pesnome, pessexo, pestipo, logcodigo)
    VALUES ('ANTONIO WILSON', 1, 1, 13),
		   ('ELISANE PORTELA',2,1,14),
		   ('FERNANDES DE SOUZA',1,1,15),
		   ('MERCEARIA',3,2,16)


/*
3. Insira os seguintes registros na tabela de contatos:
Pescodigo	        Ctpnumero    Ctpdescricao  Ctpramal
ANTONIO WILSON     47-99635-1425  CELULAR       null
ELISANE PORTELA    48-98868-3313  CELULAR       null
ELISANE PORTELA    47-99889-2559  CELULAR       null
FERNANDES DE SOUSA 47-3522-1361    FIXO         258
MERCEARIA          47-3539-3258    FIXO         null
*/
INSERT INTO treina.tblogradouro (logcodigo, logtipo, logdescricao)
	VALUES(17, 'AVENIDA', 'SEIS')

INSERT INTO treina.tbpessoa (pesnome,pessexo,pestipo,logcodigo)
    VALUES ('ELISANE PORTELA',2,1,17)

INSERT INTO treina.tbpessoacontato (pescodigo,ctpnumero,ctpdescricao,ctpramal)
	VALUES (17,'47-99635-1425','CELULAR',null),
		   (18,'48-98868-3313','CELULAR',null),
		   (19,'47-3522-1361','FIXO',258),
		   (20,'47-3522-1361','FIXO',null),
		   (21,'47-99889-2559','CELULAR',null)
	

/*	 
Insira os seguintes registros na tabela de imóveis:
Imvdescricao      Imvlargura  Imvcomprimento   Logcodigo
CASA DE MADEIRA 5   13           14          TRAVESSA CINCO
CASA DE ALVENARIA 5  15          19          AVENIDA CINCO
CASA DE MADEIRA 6    14          15          AVENIDA SEIS
CASA DE ALVENARIA 6  17          14          RUA CINCO
CASA DE MADEIRA 7    13          13          AVENIDA SEIS
*/

INSERT INTO treina.tbimovel (imvdescricao,imvlargura,imvcomprimento,logcodigo)
	VALUES ('CASA DE MADERIA 5',13,14,13),
		   ('CASA DE ALVENARIA 5',15,19,14),
		   ('CASA DE MADEIRA 6',14,15,15),
		   ('CASA DE ALVENARIA 6',17,14,16),
		   ('CASA DE MADEIRA 7',13,13,17)

SELECT * FROM treina.tbpessoa 
	INNER JOIN treina.tbpessoacontato on tbpessoa.pescodigo = tbpessoacontato.pescodigo
	INNER JOIN treina.tbimovel on tbpessoa.logcodigo = tbimovel.logcodigo 
	INNER JOIN treina.tblogradouro on tbpessoa.logcodigo = tblogradouro.logcodigo


/*
a. ANTONIO WILSON é proprietário do imóvel CASA DE MADEIRA 6? falso
b. ELISANE PORTELA é proprietária do imóvel CASA DE MADEIRA 7? verdadeiro
c. MERCEARIA é proprietário do imóvel CASA DE MADEIRA 6? falso
d. MERCEARIA é proprietário do imóvel CASA DE ALVENARIA 5?  falso
*/


/*
6. Crie os seguintes registros de taxas:
a. ANTONIO WILSON deve R$ 321,00 de taxas para a CASA DE
MADEIRA 6.
b. ELISANE PORTELA deve R$ 1000,00 de taxas para a CASA DE
MADEIRA 7.
c. MERCEARIA deve R$ 173,80 de taxas para a CASA DE MADEIRA 6.
d. MERCEARIA está com todas as taxas quitadas para a CASA DE
ALVENARIA 5.
*/
