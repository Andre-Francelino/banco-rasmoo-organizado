package com.rasmo.cursos.banco.model;

public class ContaCorrente extends Conta {

    public ContaCorrente(int agencia, int numero, Cliente titular) {
        super(agencia, numero, titular);
    }

    @Override // polimorfismo
    public void sacar(double valor) {
        double novoValor = valor + 2.5;
        super.sacar(novoValor);
    }

    @Override
    public void gerarExtrato() {
        System.out.println("Gerando extrato para conta corrente do cliente " + this.getTitular().getNome());
    }
}
