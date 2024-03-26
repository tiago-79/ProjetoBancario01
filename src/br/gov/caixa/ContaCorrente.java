package br.gov.caixa;

import br.gov.caixa.enumeradores.Conta;

public class ContaCorrente extends Conta {

    public void investir(int idContaInvestimento, float valor) {
        if (getSaldo() >= valor ) {

        }
    }

    @Override
    public void registrarAcao() {
        System.out.println( this.dataAtualizazao +
                ", " + this.usuario.getClassificacao() +
                ", " + this.usuario.getIdUsuario()
        );
    }
}
