package br.gov.caixa;

import br.gov.caixa.enumeradores.TipoDeAcao;

import java.util.Date;

public class RegistroAcao {
    private Date data;
    private TipoDeAcao tipoDeAcao;
    private long valorPretendido;
    private long valorReal;
    private Usuario usuarioOrigem;
    private Usuario usuarioDestino;
    private String observacao;


//
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public TipoDeAcao getTipoDeAcao() {
        return tipoDeAcao;
    }

    public void setTipoDeAcao(TipoDeAcao tipoDeAcao) {
        this.tipoDeAcao = tipoDeAcao;
    }

    public long getValorPretendido() {
        return valorPretendido;
    }

    public void setValorPretendido(long valorPretendido) {
        this.valorPretendido = valorPretendido;
    }

    public long getValorReal() {
        return valorReal;
    }

    public void setValorReal(long valorReal) {
        this.valorReal = valorReal;
    }

    public Usuario getUsuarioOrigem() {
        return usuarioOrigem;
    }

    public void setUsuarioOrigem(Usuario usuarioOrigem) {
        this.usuarioOrigem = usuarioOrigem;
    }

    public Usuario getUsuarioDestino() {
        return usuarioDestino;
    }

    public void setUsuarioDestino(Usuario usuarioDestino) {
        this.usuarioDestino = usuarioDestino;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
}
