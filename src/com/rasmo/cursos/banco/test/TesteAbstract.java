package com.rasmo.cursos.banco.test;

import com.rasmo.cursos.banco.model.Cliente;
import com.rasmo.cursos.banco.model.ContaCorrente;
import com.rasmo.cursos.banco.model.ContaPoupanca;

public class TesteAbstract {

    public static void main(String[] args) {
        Cliente ragnar = new Cliente("Ragnar Lothbrok", "45698712354");

        ContaCorrente cc = new ContaCorrente(1678, 4873, ragnar);
        ContaPoupanca cp = new ContaPoupanca(1678, 2578, ragnar);

        cc.gerarExtrato();
        cp.gerarExtrato();
    }
}
