package com.rasmo.cursos.banco.test;

import java.io.FileNotFoundException;

public class TesteCheckedExceptions {

    public static void main(String[] args) {
        try {
            exemploChecked();
        } catch (FileNotFoundException e){
            System.out.println("Deu ruim aqui! " + e.getMessage());
        }

    }

    public static void exemploChecked() throws FileNotFoundException {
        throw new FileNotFoundException("Segura essa bomba aí...FileNotFound.");
    }

    public static void exemploUnchecked() {
        throw new RuntimeException("Deu ruim!  RuntimeException.");
    }
}
