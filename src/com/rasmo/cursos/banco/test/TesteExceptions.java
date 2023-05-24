package com.rasmo.cursos.banco.test;

import com.rasmo.cursos.banco.model.Cliente;
import com.rasmo.cursos.banco.model.Conta;

public class TesteExceptions {

    public static void main(String[] args) {
        try {
            int resultado = 10/2;
            System.out.println("O resultado da divisão é: " + resultado);
            Cliente cliente = new Cliente("André", "12345678910");
            Conta conta = new Conta(3242, 8732, cliente) {
                @Override
                public void gerarExtrato() {

                }
            };
            conta.depositar(1000);
            conta.sacar(1100);
            System.out.println("O saldo da minha conta é: " + conta.getSaldo());

        } catch (RuntimeException ex) {
            System.out.println("O motivo do erro foi: " + ex.getMessage());
        } finally {
            System.out.println("Esse bloco sempre será executado.");
        }
        System.out.println("Opa! Agora eu sou chamado!");
    }
}
