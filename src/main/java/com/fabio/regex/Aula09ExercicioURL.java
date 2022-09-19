package com.fabio.regex;

public class Aula09ExercicioURL {

    public static void main(String[] args) {

        String url = "www.loja.com.br/clientes-2021.html";
        String regexUrl = "www.loja.com.br/\\w{2,}-\\d{4}.html";
        boolean teste = url.matches(regexUrl);
        System.out.println(teste);

        regexUrl = "(www.loja.com.br)/(\\w{2,})-(\\d{4}).html";

        String resultadoTroca = url.replaceAll(regexUrl,"http://$1/$3/$2.jsp");

        System.out.println(url);
        System.out.println(resultadoTroca);

    }
}
