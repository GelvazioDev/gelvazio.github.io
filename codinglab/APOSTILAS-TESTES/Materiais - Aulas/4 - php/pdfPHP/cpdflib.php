   <?php 
   
   class imprimePDF {
       
       public function __construct($bLoadExemplo = false) {
           if($bLoadExemplo){
               if(isset($_GET["geraPDF"])){
                   if($_GET["geraPDF"]){
                    $this->gerarPDF_Exemplo04();
                   }
               } else {
                   // $this->loadExemploPDF01();
                   // $this->loadExemploPDF02();
                   // $this->loadExemploPDF03();               
                   $this->loadExemploPDF04();                   
               }
           }
       }
       
       private function loadExemploPDF01(){
           // Inclui a classe 'class.ezpdf.php'
           include("pdf-php/src/Cezpdf.php");
    
           // Instancia um novo documento com o nome de pdf
           $pdf = new Cezpdf();
    
           // Seleciona a fonte que será usada. As fontes estão localizadas na pasta "pdf-php/fonts".
           // Use a de sua preferencia.
           $pdf->selectFont('pdf-php/fonts/Helvetica.afm');
    
           // Chama o método "ezText".
           // No 1° parametro passa o texto do documento
           // No 2° parametro define o tamanho da fonte.
           // No 3° parametro é do tipo array. A seguir uma explicação desse 3° parametro:
    
           // justification => seta a posição de um label, pode ser center, right, left, aright, ou aleft
           // leading = > define o tamanho que cada linha usará para se mostrada, deverá  ser um int
           // spacing => define o espaçamento entrelinhas, deverá ser um float
           // você pode usar apenas leading ou apenas spacing, nunca os dois
    
           $pdf->ezText('DevMedia Group!', 20,
               array("justification" => 'center',
                   "spacing" => 2.0));
    
           $pdf->ezText('Olá Pessoal. Obrigado por estarem acompanhando mais este artigo!', 15,
                array("justification" => 'left', "spacing" => 3.0));
    
           $pdf->ezText('Acessem o portal da DevMedia Group: www.devmedia.com.br!', 10,
                array("justification" => 'right', "spacing" => 1.0));
    
           // Gera o PDF
           $pdf->ezStream();
    
       }       
       
       private function loadExemploPDF02(){
           // Inclui a classe 'class.ezpdf.php'
           include("pdf-php/src/Cezpdf.php");
    
           // Instancia um novo documento com o nome de pdf
           $pdf = new Cezpdf();
    
           // Seleciona a fonte que será usada. As fontes estão localizadas na pasta "pdf-php/fonts".
           // Use a de sua preferencia.
           $pdf -> selectFont('pdf-php/fonts/Helvetica.afm');
    
           // Chama o método "ezText".
           // No 1° parametro passa o texto do documento
           // No 2° parametro define o tamanho da fonte.
           // No 3° parametro é do tipo array. A seguir uma explicação desse 3° parametro:
    
           // justification => seta a posição de um label, pode ser center, right, left, aright, ou aleft
           // leading = > define o tamanho que cada linha usará para se mostrada, deverá  ser um int
           // spacing => define o espaçamento entrelinhas, deverá ser um float
           // você pode usar apenas leading ou apenas spacing, nunca os dois
    
           $pdf->ezText('Bem vindo ao Senac!', 20,
               array("justification" => 'center',
                   "spacing" => 2.0));
    
           $pdf->ezText('Olá Pessoal. Obrigado por estarem acompanhando mais este artigo!', 15,        
               array("justification" => 'left', "spacing" => 3.0));
    
           $pdf->ezText('Acessem o portal da DevMedia Group: www.devmedia.com.br!', 10,        
               array("justification" => 'right', "spacing" => 1.0));
    
           // Gera o PDF
           $pdf->ezStream();    
       }       
       
       private function loadExemploPDF03(){
    
           $mesano = 202101;
           $codigoibge = 4214805;
           $pagina = 1;
           
           $aDadosApi = $this->getDadosAuxilioEmergencial($mesano, $codigoibge, $pagina);
           
           // echo '<pre>' . print_r($aDadosApi, true). '</pre>';
           $aDadosApi = json_decode($aDadosApi);
           
           $html = '<!doctype html>
                    <html lang="en">
                      <head>
                        <meta charset="utf-8">
                        <meta name="viewport" content="width=device-width, initial-scale=1">
                        <title>Auxilios Emergenciais</title>
                        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
                      </head>
                      <body>
                      <table class="table table-dark">
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
               $html.= '<th scope="row">' . $cont . '</th>';
               $html.= '<td>' . $beneficiario . '</td>';
               $html.= '<td>' . $valor . '</td>';
               $html.= '<td>' . $parcela . '</td>';
               $html.= '<td>' . $enquadramento . '</td>';
               $html.= '<td>' . $situacao . '</td>';
               $html.= '</tr>';
    
               $cont++;
           }
                      
           $html .= '
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
            </body>
        </html>';
           
           echo $html;               
       }
       
       private function loadExemploPDF04(){
    
           $mesano = 202101;
           $codigoibge = 4214805;
           $pagina = 1;
           
           $aDadosApi = $this->getDadosAuxilioEmergencial($mesano, $codigoibge, $pagina);
           
           // echo '<pre>' . print_r($aDadosApi, true). '</pre>';
           $aDadosApi = json_decode($aDadosApi);
           
           // <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    
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
                            <h1>Landing Page</h1>
                            <br>
                            <a class="button-line" href="index.php?geraPDF=true">PDF</a> 
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
           
           echo $html;               
       }
       
       private function gerarPDF_Exemplo04(){
           $mesano = 202101;
           $codigoibge = 4214805;
           $pagina = 1;
    
           $aDadosApi = $this->getDadosAuxilioEmergencial($mesano, $codigoibge, $pagina);
    
           // echo '<pre>' . print_r($aDadosApi, true). '</pre>';
           $aDadosApi = json_decode($aDadosApi);
    
           // <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    
           $html = '<th scope="col">id</th>
                              <th scope="col">Beneficiario</th>
                              <th scope="col">Valor</th>
                              <th scope="col">Parcela</th>
                              <th scope="col">Enquadro</th>
                              <th scope="col">Situacao</th>
                            </tr>
                          </thead>
                    <tbody>';
           $cont = 1;
    
           // Inclui a classe 'class.ezpdf.php'
           include("pdf-php/src/Cezpdf.php");
    
           // Instancia um novo documento com o nome de pdf
           $pdf = new Cezpdf();
    
           // Seleciona a fonte que será usada. As fontes estão localizadas na pasta "pdf-php/fonts".
           // Use a de sua preferencia.
           $pdf->selectFont('pdf-php/fonts/Helvetica.afm');
    
           // Chama o método "ezText".
           // No 1° parametro passa o texto do documento
           // No 2° parametro define o tamanho da fonte.
           // No 3° parametro é do tipo array. A seguir uma explicação desse 3° parametro:
    
           // justification => seta a posição de um label, pode ser center, right, left, aright, ou aleft
           // leading = > define o tamanho que cada linha usará para se mostrada, deverá  ser um int
           // spacing => define o espaçamento entrelinhas, deverá ser um float
           // você pode usar apenas leading ou apenas spacing, nunca os dois
    
           // cabecalho
           $pdf->ezText('Bem vindo ao Senac!', 20,
               array("justification" => 'center',
                   "spacing" => 2.0));
    
    
           foreach ($aDadosApi as $key => $aValues){
                $html = "";
                
               $beneficiario  = $aValues->beneficiario->nome;
               $valor         = $aValues->valor;
               $parcela       = $aValues->numeroParcela;
               $enquadramento = $aValues->enquadramentoAuxilioEmergencial;
               $situacao      = $aValues->situacaoAuxilioEmergencial;
        
               // $html.= '<tr>';
               // $html.= '    <th scope="row">' . $cont . '</th>';
               // $html.= '    <td align="left">' . $beneficiario . '</td>';
               // $html.= '    <td>' . $valor . '</td>';
               // $html.= '    <td>' . $parcela . '</td>';
               // $html.= '    <td align="left">' . $enquadramento . '</td>';
               // $html.= '    <td align="left">' . $situacao . '</td>';
               // $html.= '</tr>';
        
                $meuTexto = "$cont $beneficiario $valor $parcela $enquadramento $situacao"; 
                // corpo
                $pdf->ezText($meuTexto, 15, array("justification" => 'left', "spacing" => 3.0));
                // $pdf->ezText($cont, 15, array("justification" => 'left', "spacing" => 3.0));
                // $pdf->ezText($beneficiario, 15, array("justification" => 'left', "spacing" => 3.0));
                // $pdf->ezText($valor, 15, array("justification" => 'left', "spacing" => 3.0));
                // $pdf->ezText($parcela, 15, array("justification" => 'left', "spacing" => 3.0));
                // $pdf->ezText($enquadramento, 15, array("justification" => 'left', "spacing" => 3.0));
                // $pdf->ezText($situacao, 15, array("justification" => 'left', "spacing" => 3.0));
    
               $cont++;
           }
    
           // rodape
           $pdf->ezText('Acesse: https://portal.sc.senac.br/', 10,
               array("justification" => 'right', "spacing" => 1.0));
           
           // Gera o PDF
           $pdf->ezStream();
           
       }
       
       private function getDadosAuxilioEmergencial($mesano, $codigoibge, $pagina){
        
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
   }
   
   new imprimePDF(true);