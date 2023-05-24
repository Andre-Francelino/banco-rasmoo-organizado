package com.rasmo.cursos.banco.model;
import com.rasmo.cursos.banco.exception.SaldoInsuficienteException;

public abstract class Conta {
    private int agencia;
    private int numero;
    private Cliente titular;
    private double saldo;
    private static int total;

    public Conta(int agencia, int numero, Cliente titular){
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;

        Conta.total++;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if(this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo insuficiente! Saldo atual: " + this.saldo + ". Valor de saque: " + valor);
        }

        this.saldo -= valor;
    }

    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    // Métodos Getters -> métodos que vão retornar valores
    // Métodos Setters -> métodos que vão atribuir valores
    public double getSaldo() {
        return this.saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia > 0) {
            this.agencia = agencia;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Conta.total;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", titular=" + titular +
                ", saldo=" + saldo +
                '}';
    }

    public abstract void gerarExtrato();
}
