package com.fabio.condicional;

public class Ternario {

    public static void main(String[] args) {

        double nota = 4.5;

        String resultado = nota >= 7 ? "Aprovado":"Reprovado";
        System.out.println(resultado);

        resultado = nota >= 7 ? "Aprovado": nota < 7 && nota >= 5 ? "Recuperação":"Reprovado";

        System.out.println(resultado);
    }
}
