package com.rasmo.cursos.banco.model;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int agencia, int numero, Cliente titular) {
        super(agencia, numero, titular);
    }

    @Override
    public void gerarExtrato() {
        System.out.println("Gerando extrato para conta poupança do cliente " + this.getTitular().getNome());
    }
}
