package com.fabio.regex;

public class Aula02Modificadores {

    public static void main(String[] args) {

        /*
        * MODIFICADORES
        * (?i) Ignora maiúscula e minúscula
        * (?x) Comentarios
        * (?m) Multilinhas
        * (?s) Dottal
        * */

        boolean teste = "Java".matches("java");
        boolean teste1 = "Java".matches("(?i)java");
        System.out.println(teste);
        System.out.println(teste1);

    }
}
