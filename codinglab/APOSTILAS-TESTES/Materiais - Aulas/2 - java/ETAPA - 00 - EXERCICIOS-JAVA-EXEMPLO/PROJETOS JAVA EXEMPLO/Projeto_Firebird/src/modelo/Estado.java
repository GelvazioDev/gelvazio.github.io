/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author Marciel
 */
public class Estado {
    private String est_sigla;
    private String nome;

    public Estado(String est_sigla, String nome){
        this.est_sigla = est_sigla;
        this.nome = nome;
    }

    public void setEst_sigla(String est_sigla){
        this.est_sigla = est_sigla;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEst_sigla(){
        return this.est_sigla;
    }

    public String getNome(){
        return this.nome;
    }        
}
