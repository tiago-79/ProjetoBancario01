package br.gov.caixa;

import br.gov.caixa.enumeradores.Conta;

public class ContaInvestimento extends Conta {
    private int fatorRendimento;

    // ------- MÉTODOS --------
    @Override
    public void registrarAcao() {
        System.out.println("Ação na conta investimento teste!");
    }

    // ------- GETS & SETS --------
    public int getFatorRendimento() {
        return fatorRendimento;
    }

    public void setFatorRendimento(int fatorRendimento) {
        this.fatorRendimento = fatorRendimento;
    }
}
