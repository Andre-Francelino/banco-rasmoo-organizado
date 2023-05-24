package com.rasmo.cursos.banco.test;

import com.rasmo.cursos.banco.model.Cliente;
import com.rasmo.cursos.banco.model.ContaCorrente;
import com.rasmo.cursos.banco.model.ContaPoupanca;

public class TesteHeranca {

    public static void main(String[] args) {
        Cliente andre = new Cliente("André", "3116041992");
        ContaCorrente cc = new ContaCorrente(1298, 8734, andre);

        cc.depositar(1000);
        cc.sacar(233.76);

        ContaPoupanca cp = new ContaPoupanca(1298, 4368, andre);

        cc.transferir(500, cp);
        cp.depositar(5000);

        System.out.println("O saldo da CC: " + cc.getSaldo());
        System.out.println("O saldo da CP: " + cp.getSaldo());
    }

}