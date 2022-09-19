package com.fabio.regex;

public class Aula01 {

    public static void main(String[] args) {

        String padrao = "Java";
        String texto = "Java";
        boolean b = texto.matches(padrao);
        boolean c = "Java11".matches("Java11");
        System.out.println(b);
        System.out.println(c);

    }
}
