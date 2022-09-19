package com.fabio.regex;

public class Aula08Substituicoes {

    public static void main(String[] args) {

        String doce = "Qual é o Doce mais doCe que o doce de arroz DOCe";
        String r = doce.replaceAll("(?i)doce","DOCINHO");
        System.out.println(r);

        String rato = "O rato roeu a roupa do rei de Roma";
        String newRato = rato.replaceAll("(?i)r[aeiou]","XX");
        System.out.println(newRato);

        System.out.println("Tabular esse texto".replaceAll("\\s","\n"));



    }
}
