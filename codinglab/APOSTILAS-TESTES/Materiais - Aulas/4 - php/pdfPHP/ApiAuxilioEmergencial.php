<?php

class ApiAuxilioEmergencial {
    
    public function getDadosAuxilioEmergencial($mesano, $codigoibge, $pagina){
        
        $endpoint = "https://api.portaldatransparencia.gov.br/api-de-dados/auxilio-emergencial-beneficiario-por-municipio";
        
        $params = array(
            'codigoIbge' => $codigoibge,
            'mesAno' => $mesano,
            'pagina' => $pagina
        );
        
        $url = $endpoint . '?' . http_build_query($params);
        
        $client = curl_init($endpoint);
        
        curl_setopt($client, CURLOPT_URL, $url);
        
        $headers = ['chave-api-dados: e87c65b7590a28a987705526d3812c4a'];
        
        curl_setopt($client, CURLOPT_HTTPHEADER, $headers);
        
        curl_setopt($client, CURLOPT_RETURNTRANSFER, true);
        
        curl_setopt($client, CURLOPT_CUSTOMREQUEST, "GET");
        
        $response = curl_exec($client);
        
        if (!$response) {
            $erro = curl_error($client);
        }
        
        $oDados = $response;
        
        curl_close($client);
        
        return $oDados;
    }
    
    public function getDadosHtmlAuxilio($bSomenteDados = false){
        $mesano = 202101;
        $codigoibge = 4214805;
        $pagina = 1;
    
        $aDadosApi = $this->getDadosAuxilioEmergencial($mesano, $codigoibge, $pagina);
    
        // echo '<pre>' . print_r($aDadosApi, true). '</pre>';
        $aDadosApi = json_decode($aDadosApi);
        
        if($bSomenteDados){
            return $aDadosApi;            
        }
    
        $html = '<!doctype html>
                    <html lang="en">
                      <head>
                        <meta charset="utf-8">
                        <meta name="viewport" content="width=device-width, initial-scale=1">
                        <title>Auxilios Emergenciais</title>
                        
                        <link rel="stylesheet" href="css/styles.css">
                      </head>
                      <body>
                      <div class="full-screen">
                          <div>
                            <h1>Auxilios Emergenciais - Rio do Sul</h1>
                          </div>                       
                      <table class="table table-dark" border="1">
                        <thead>
                            <tr>
                              <th scope="col">id</th>
                              <th scope="col">Beneficiario</th>
                              <th scope="col">Valor</th>
                              <th scope="col">Parcela</th>
                              <th scope="col">Enquadro</th>
                              <th scope="col">Situacao</th>
                            </tr>
                          </thead>
                    <tbody>';
        $cont = 1;
        foreach ($aDadosApi as $key => $aValues){
            $beneficiario  = $aValues->beneficiario->nome;
            $valor         = $aValues->valor;
            $parcela       = $aValues->numeroParcela;
            $enquadramento = $aValues->enquadramentoAuxilioEmergencial;
            $situacao      = $aValues->situacaoAuxilioEmergencial;
        
            $html.= '<tr>';
            $html.= '    <th scope="row">' . $cont . '</th>';
            $html.= '    <td align="left">' . $beneficiario . '</td>';
            $html.= '    <td>' . $valor . '</td>';
            $html.= '    <td>' . $parcela . '</td>';
            $html.= '    <td align="left">' . $enquadramento . '</td>';
            $html.= '    <td align="left">' . $situacao . '</td>';
            $html.= '</tr>';
        
            $cont++;
        }
    
        $html .= '</div>
            </body>
        </html>';
    
        return $html;
    }
}