/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author gelvazio
 */
public class Cliente {
    private int cli_codigo;
    private String nome;
    private String sexo;
    private String endereco;
    private int end_numero;
    private String bairro;
    private int cid_codigo;
    private String email;
    private int telefone;
    private int datanascimento;
    private String pai;
    private String mae;

    public Cliente(int cli_codigo, String nome, String sexo, String endereco, int end_numero, String bairro, int cid_codigo, String email, int telefone, int datanascimento, String pai, String mae) {
        this.cli_codigo = cli_codigo;
        this.nome = nome;
        this.sexo = sexo;
        this.endereco = endereco;
        this.end_numero = end_numero;
        this.bairro = bairro;
        this.cid_codigo = cid_codigo;
        this.email = email;
        this.telefone = telefone;
        this.datanascimento = datanascimento;
        this.pai = pai;
        this.mae = mae;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getCid_codigo() {
        return cid_codigo;
    }

    public void setCid_codigo(int cid_codigo) {
        this.cid_codigo = cid_codigo;
    }

    public int getCli_codigo() {
        return cli_codigo;
    }

    public void setCli_codigo(int cli_codigo) {
        this.cli_codigo = cli_codigo;
    }

    public int getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(int datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEnd_numero() {
        return end_numero;
    }

    public void setEnd_numero(int end_numero) {
        this.end_numero = end_numero;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    
}