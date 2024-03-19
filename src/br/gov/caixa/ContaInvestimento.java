package br.gov.caixa;

import br.gov.caixa.lib.Conta;
import br.gov.caixa.lib.Status;

import java.util.Date;

public class ContaInvestimento extends Conta {
    private int fatorRendimento;
    @Override
    public void registrarAcao() {
        System.out.println("Ação na conta investimento");
    }

    public int getFatorRendimento() {
        return fatorRendimento;
    }

    public void setFatorRendimento(int fatorRendimento) {
        this.fatorRendimento = fatorRendimento;
    }
}
