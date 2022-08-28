/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author Marciel
 */
public class Cidade {
    private int cid_codigo;
    private String nome;
    private String est_sigla;

    public Cidade(int cid_codigo, String nome, String est_sigla) {
        this.cid_codigo = cid_codigo;
        this.nome = nome;
        this.est_sigla = est_sigla;
    }

    public int getCid_codigo() {
        return cid_codigo;
    }

    public void setCid_codigo(int cid_codigo) {
        this.cid_codigo = cid_codigo;
    }

    public String getEst_sigla() {
        return est_sigla;
    }

    public void setEst_sigla(String est_sigla) {
        this.est_sigla = est_sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }       
    
}
