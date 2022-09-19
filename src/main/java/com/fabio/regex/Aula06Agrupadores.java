package com.fabio.regex;

public class Aula06Agrupadores {

    public static void main(String[] args) {
        /*
        *  [...]           Agrupamento
        *  [a-z]           Alcance
        *  [a-e][i-u]      União
        * [a-z&&[aeiou]]   Interseção
        * [^abc]           Exceção
        * [a-z&&[^m-p]     Subtração
        * \X               Fuga literal
        * */

        boolean b = "J".matches("[a-zA-Z]"); //true
        b = "Ja2".matches("[a-zA-Z].*"); //true
        b = "J2a".matches("[a-zA-Z]"); //false
        b = "Yes".matches("[Yy]es"); //true
        b = "yes".matches("[Yy]es"); //true
        b = "Nao".matches("[Nn]ao|[Nn]ot"); //true
        b = "Not".matches("[Nn]ao|[Nn]ot"); //true
        b = "J2".matches("[a-zA-Z][0-9]"); //true
        b = "Beatriz".matches("[A-Z][a-z]*"); //true
        b = "Beatriz123333".matches("[A-Z][a-z]*"); //false
        b = "alho".matches("[ae]lho"); //true
        b = "olho".matches("[ae]lho"); //false
        b = "crau".matches("cr[ae]u"); //true
        System.out.println(b);

        String gmail = "fabio22_@gmail.com";
        String br = "fabiolp22_@gmail.com.br";
        String org = "fabiolp22_@brasil.org.com";

        String regPontoCom = ".+@\\w.+com$|.+@\\w.+com.br$|.+@\\w.+org.com$";
        System.out.println(gmail.matches(regPontoCom));
        System.out.println(br.matches(regPontoCom));
        System.out.println(org.matches(regPontoCom));

    }
}
