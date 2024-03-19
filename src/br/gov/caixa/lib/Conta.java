package br.gov.caixa.lib;

import br.gov.caixa.Usuario;

import java.util.Date;

public abstract class Conta {
    protected int idConta;
    protected float saldo;
    protected Date dataAtualizazao;
    protected Status status;
    protected Usuario usuario;

    // ------- MÉTODOS --------
    public void sacar(float valorDoSaque){
        if (valorDoSaque >=  saldo) {
            if (usuario.getClassificacao() == Classificacao.PJ) {
                if (valorDoSaque >= (valorDoSaque + (valorDoSaque * 0.005))){ // se possui saldo para pagar a taxa de 0,005%
                    saldo = (float) (valorDoSaque + (valorDoSaque * 0.005));
                }
            } else {
                saldo -= valorDoSaque;
            }
        }
    }

    public void depositar(float valorDeposito) {
        saldo += valorDeposito;
    }

    public void transferir(float valorTransferencia, int idContaDestino) {

    }

    public float consultaSaldo (int idConta) {
        return saldo;
    }

    public abstract void registrarAcao();
    
    // ------- GETS & SETS --------
    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Date getDataAtualizazao() {
        return dataAtualizazao;
    }

    public void setDataAtualizazao(Date dataAtualizazao) {
        this.dataAtualizazao = dataAtualizazao;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }


}
