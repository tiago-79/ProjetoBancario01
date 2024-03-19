package br.gov.caixa;

import br.gov.caixa.lib.Conta;
import br.gov.caixa.lib.Status;

import java.util.Date;

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
