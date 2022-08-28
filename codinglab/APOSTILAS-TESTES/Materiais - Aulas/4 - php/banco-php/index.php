<?php
/**
 * Chamada da api Pessoa.
 *
 * User: Gelvazio Camargo
 * Date: 10/12/2020
 * Time: 17:40
 */
 
 <?php
use \Psr\Http\Message\ServerRequestInterface as Request;
use Psr\Http\Message\ResponseInterface as Response;

class ControllerApiPessoa {

 /**
     *
     * @var Query
     */
    private $Query;

    public function getQuery() {
        if (!isset($this->Query)) {
            $this->Query = new Query();
        }
        return $this->Query;
    }

    public function setQuery(Query $Query) {
        $this->Query = $Query;
    }
	
    public function getPessoa() {
        $sSql = "SELECT * FROM pessoa ORDER BY cd_pessoa";
        $aDados = $this->getQuery()->selectAll($sSql);
		
        return $aDados;
    }

    public function getConsultaPessoa() {
        $sSql = "SELECT * FROM pessoa ORDER BY pescodigo";
        $aDados = $this->getQuery()->selectAll($sSql);
        return $response->withJson($aDados, 200);
    }
	
	public function executaSQL(){		
		$sSql = "DELETE FROM TREINA.TBPESSOA WHERE PESCODIGO = 1";
		$sSql = "INSERTO INTO ....";
		$sSql = "UPDATE TREINA.TBPESSOA ....";
		
		$this->getQuery()->executaQuery($sSql);
	}
	
}
		