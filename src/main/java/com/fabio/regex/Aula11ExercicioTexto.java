package com.fabio.regex;

public class Aula11ExercicioTexto {

    public static void main(String[] args) {

        String texto = "Meu nome é Fábio. Eu gosto do nome Fábio. Acho que Fábio é um nome bonito e abençoado.";

        String newTexto = texto.replaceAll("(?i)fábio","FABIO");

        System.out.println(newTexto);



    }

}
