package com.rasmo.cursos.banco.test;

import com.rasmo.cursos.banco.model.Cliente;
import com.rasmo.cursos.banco.model.Conta;

public class TesteSaldoInsuficienteException {

    public static void main(String[] args) {
        Cliente sam = new Cliente("Sam Winchester", "98765432122");
        Conta conta = new Conta(9231, 8273, sam) {
            @Override
            public void gerarExtrato() {

            }
        };
        conta.depositar(500);
        conta.sacar(700);
    }

}
