/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author Marciel
 */
public class Conta {
    private int cnt_numero;
    private String descricao;
    private String data;
    private double valor;
    private String tipo;
    private String situacao;
    private int pes_codigo;

    public Conta(int cnt_numero, String descricao, String data, double valor, String tipo, String situacao, int pes_codigo) {
        this.cnt_numero = cnt_numero;
        this.descricao = descricao;
        this.data = data;
        this.valor = valor;
        this.tipo = tipo;
        this.situacao = situacao;
        this.pes_codigo = pes_codigo;
    }

    public int getCnt_numero() {
        return cnt_numero;
    }

    public void setCnt_numero(int cnt_numero) {
        this.cnt_numero = cnt_numero;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPes_codigo() {
        return pes_codigo;
    }

    public void setPes_codigo(int pes_codigo) {
        this.pes_codigo = pes_codigo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
