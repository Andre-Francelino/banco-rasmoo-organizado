package com.rasmo.cursos.banco.test;

import com.rasmo.cursos.banco.model.Cliente;
import com.rasmo.cursos.banco.model.ContaCorrente;
import com.rasmo.cursos.banco.model.ContaPoupanca;

public class TestePolimorfismo {

    public static void main(String[] args) {
        Cliente ana = new Cliente("Ana Paula", "2516011998");
        ContaCorrente cc = new ContaCorrente(5643, 10032, ana);
        ContaPoupanca cp = new ContaPoupanca(3643, 8721, ana);

        cc.depositar(1000);
        cp.depositar(10000);

        cc.sacar(100);
        cp.sacar(1000);

        cp.transferir(500, cc);
        cc.transferir(100, cp);

        System.out.println("Saldo CC: " + cc.getSaldo());
        System.out.println("Saldo CP: " + cp.getSaldo());

        System.out.println(cc.toString());
        System.out.println(cp.toString());
    }
}
