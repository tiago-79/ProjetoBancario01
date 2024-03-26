package br.gov.caixa.interfaces;

public interface InterfaceConta {
    public void sacar(float valorDoSaque);
    void depositar(float valorDeposito);
    void transferir(float valorTransferencia, int idContaDestino);
    float consultarSaldo(int idConta);
}
