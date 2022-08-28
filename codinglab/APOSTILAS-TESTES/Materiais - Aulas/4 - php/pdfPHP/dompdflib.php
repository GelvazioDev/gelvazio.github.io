<?php 
// use DompdfDompdf;

use Dompdf\Dompdf;

class domPDFTest {
    public function __construct() {
        $this->testDomPDF();
    }
    
    private function testDomPDF(){
        require_once ("ApiAuxilioEmergencial.php");
        
        $api = new ApiAuxilioEmergencial();
        
        $html = $api->getDadosHtmlAuxilio();
    
        require_once 'dompdf/vendor/autoload.php';
        
        $nome_arquivo = "Nota_Fiscal_01.pdf";
        
        $dompdf = new Dompdf();
    
        // $html= 'conteudo HTML '; //Insira o seu HTML dentro desta variável
    
        $dompdf->loadHtml($html);
    
        $dompdf->setPaper('A4', 'landscape');
        
        $dompdf->render();
        
        // baixa o arquivo pdf
        // $dompdf->stream($nome_arquivo);
    
        $pdf = $dompdf->output(array("compress" => 0));
        
        header('Content-Type: application/pdf');
        header('Content-Length: ' . strlen($pdf));
        header('Content-Disposition: inline; filename="' . $nome_arquivo . '"');
        header('Cache-Control: private, max-age=0, must-revalidate');
        header('Pragma: public');
    
        echo $pdf;        
        
        // mesclar pdfs
        // https://blog.dbins.com.br/mesclar-pdfs-com-php
    }
}

new domPDFTest();
