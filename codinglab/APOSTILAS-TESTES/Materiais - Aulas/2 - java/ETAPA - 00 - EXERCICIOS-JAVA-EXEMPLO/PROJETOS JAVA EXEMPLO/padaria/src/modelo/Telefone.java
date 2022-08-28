/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author gelvazio
 */
public class Telefone {
    private int tel_sequencia;
    private int cli_codigo;
    private int numero;
    private String tipo;
    private String NomeCliente;

    public Telefone(int tel_sequencia, int cli_codigo, int numero, String tipo, String NomeCliente) {
        this.tel_sequencia = tel_sequencia;
        this.cli_codigo = cli_codigo;
        this.numero = numero;
        this.tipo = tipo;
        this.NomeCliente = NomeCliente;
    }

    public String getNomeCliente() {
        return NomeCliente;
    }

    public void setNomeCliente(String NomeCliente) {
        this.NomeCliente = NomeCliente;
    }

    public int getCli_codigo() {
        return cli_codigo;
    }

    public void setCli_codigo(int cli_codigo) {
        this.cli_codigo = cli_codigo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getTel_sequencia() {
        return tel_sequencia;
    }

    public void setTel_sequencia(int tel_sequencia) {
        this.tel_sequencia = tel_sequencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
} 