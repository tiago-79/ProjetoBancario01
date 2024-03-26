package br.gov.caixa.enumeradores;

import br.gov.caixa.RegistroAcao;
import br.gov.caixa.Usuario;
import br.gov.caixa.interfaces.InterfaceConta;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Conta implements InterfaceConta {
    protected int idConta;
    protected float saldo;
    protected Date dataAtualizazao;
    protected Status status;
    protected Usuario usuario;
    protected List<RegistroAcao> registroDeAcoes = new ArrayList<>();


    // ------- MÉTODOS --------
    public void sacar(float valorDoSaque){
        if (valorDoSaque >=  getSaldo()) {
            if (usuario.getClassificacao() == Classificacao.PJ) {
                if (valorDoSaque >= (valorDoSaque + (valorDoSaque * 0.005))){ // se possui saldo para pagar a taxa de 0,005%
                    setSaldo((float) (valorDoSaque + (valorDoSaque * 0.005)));
                }
            } else {
                setSaldo(getSaldo() - valorDoSaque);
            }
        } else {
//            *** SALDO INSUFICIENTE
        }
    }

    public void depositar(float valorDeposito) {
        saldo += valorDeposito;
    }

    public void transferir(float valorTransferencia, int idContaDestino) {

    }

    public float consultarSaldo(int idConta) {
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

    public List<RegistroAcao> getRegistroDeAcoes() {
        return registroDeAcoes;
    }

    public void setRegistroDeAcoes(List<RegistroAcao> registroDeAcoes) {
        this.registroDeAcoes = registroDeAcoes;
    }
}
