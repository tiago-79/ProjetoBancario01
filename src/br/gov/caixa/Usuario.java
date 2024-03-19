package br.gov.caixa;

import br.gov.caixa.lib.Classificacao;
import br.gov.caixa.lib.Status;

import java.util.Date;

public class Usuario {
    private long idUsuario;
    private Classificacao classificacao;
    private String nomeUsuario;
    private  Date dataDeCadastro;
    private Status status;
    private ContaCorrente contaCorrente;

    public Usuario(long idUsuario, Classificacao classificacao, String nomeUsuario, Date dataDeCadastro, Status status, ContaCorrente contaCorrente) {
        this.idUsuario = idUsuario;
        this.classificacao = classificacao;
        this.nomeUsuario = nomeUsuario;
        this.dataDeCadastro = dataDeCadastro;
        this.status = status;
        this.contaCorrente = contaCorrente;
    }

    // Getters e Setters
    public ContaCorrente getContaCorrente() { return contaCorrente; }

    public void setContaCorrente(ContaCorrente contaCorrente) { this.contaCorrente = contaCorrente; }

    public Classificacao getClassificacao() { return classificacao; }

    public void setClassificacao(Classificacao classificacao) { this.classificacao = classificacao; }

    public Status getStatus() { return status; }

    public void setStatus(Status status) { this.status = status; }

    public long getIdUsuario() {
        return idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public Date getDataDeCadastro() {
        return dataDeCadastro;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public void setDataDeCadastro(Date dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }
}
