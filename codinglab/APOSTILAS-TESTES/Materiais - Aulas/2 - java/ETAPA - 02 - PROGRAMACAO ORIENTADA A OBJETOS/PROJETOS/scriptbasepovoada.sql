-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tempo de Geração: Jun 15, 2011 as 01:33 PM
-- Versão do Servidor: 5.5.8
-- Versão do PHP: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Banco de Dados: `financeiro`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `cidade`
--

CREATE TABLE IF NOT EXISTS `cidade` (
  `cid_codigo` int(10) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `est_sigla` varchar(2) NOT NULL,
  PRIMARY KEY (`cid_codigo`),
  KEY `estado_cidade_fk` (`est_sigla`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cidade`
--

INSERT INTO `cidade` (`cid_codigo`, `nome`, `est_sigla`) VALUES
(1, 'Rio do Sul', 'SC'),
(2, 'Curitiba', 'PR');

-- --------------------------------------------------------

--
-- Estrutura da tabela `conta`
--

CREATE TABLE IF NOT EXISTS `conta` (
  `cnt_numero` int(10) NOT NULL,
  `descricao` varchar(120) NOT NULL,
  `data` date NOT NULL,
  `valor` double NOT NULL,
  `tipo` varchar(1) NOT NULL,
  `situacao` varchar(1) NOT NULL,
  `pes_codigo` int(10) NOT NULL,
  PRIMARY KEY (`cnt_numero`),
  KEY `pessoa_conta_fk` (`pes_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `conta`
--

INSERT INTO `conta` (`cnt_numero`, `descricao`, `data`, `valor`, `tipo`, `situacao`, `pes_codigo`) VALUES
(1, 'Lanche na Unidavi', '2011-06-15', 5, 'P', 'P', 1),
(2, 'Abastecimento', '2011-06-15', 50, 'P', 'P', 1),
(3, 'Salário', '2011-06-15', 1500, 'R', 'P', 2),
(4, '13º Salário', '2011-06-30', 1500, 'R', 'A', 2);

-- --------------------------------------------------------

--
-- Estrutura da tabela `estado`
--

CREATE TABLE IF NOT EXISTS `estado` (
  `est_sigla` varchar(2) NOT NULL,
  `nome` varchar(100) NOT NULL,
  PRIMARY KEY (`est_sigla`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `estado`
--

INSERT INTO `estado` (`est_sigla`, `nome`) VALUES
('PR', 'Paraná'),
('SC', 'Santa Catarina');

-- --------------------------------------------------------

--
-- Estrutura da tabela `pessoa`
--

CREATE TABLE IF NOT EXISTS `pessoa` (
  `pes_codigo` int(10) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `idade` int(10) DEFAULT NULL,
  `email` varchar(120) DEFAULT NULL,
  `cid_codigo` int(10) NOT NULL,
  PRIMARY KEY (`pes_codigo`),
  KEY `cidade_pessoa_fk` (`cid_codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `pessoa`
--

INSERT INTO `pessoa` (`pes_codigo`, `nome`, `idade`, `email`, `cid_codigo`) VALUES
(1, 'Marciel de Liz Santos', 29, 'marciel@unidavi.edu.br', 1),
(2, 'José dos Santos', 37, 'jose@webnet.com.br', 2);

--
-- Restrições para as tabelas dumpadas
--

--
-- Restrições para a tabela `cidade`
--
ALTER TABLE `cidade`
  ADD CONSTRAINT `estado_cidade_fk` FOREIGN KEY (`est_sigla`) REFERENCES `estado` (`est_sigla`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Restrições para a tabela `conta`
--
ALTER TABLE `conta`
  ADD CONSTRAINT `pessoa_conta_fk` FOREIGN KEY (`pes_codigo`) REFERENCES `pessoa` (`pes_codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Restrições para a tabela `pessoa`
--
ALTER TABLE `pessoa`
  ADD CONSTRAINT `cidade_pessoa_fk` FOREIGN KEY (`cid_codigo`) REFERENCES `cidade` (`cid_codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION;
