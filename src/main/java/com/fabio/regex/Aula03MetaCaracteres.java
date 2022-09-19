package com.fabio.regex;

public class Aula03MetaCaracteres {

    public static void main(String[] args) {

        /*
        * METACARACTERES
        * . qualquer caracter
        * \\d digitos [0-9]
        * \\D não é digitos [^0-9]
        * \\s espaços [\t\n\x0B\f\r]
        * \\S não é espaço [^\s]
        * \\w letra [a-ZA-Z_0-9]
        * \\W não é letra
        * */

        String cep = "32002-230";
        String regCep = "\\d\\d\\d\\d\\d-\\d\\d\\d";
        boolean l = cep.matches(regCep);
        System.out.println(l);

        //testando o \\w
        boolean k = "12AB".matches("\\w\\w\\w\\w"); //true

        //testando o \\s
        boolean i = " ".matches("\\s"); //true
        boolean j = "".matches("\\s"); //false


        // testando o \\D
        boolean g = "124".matches("\\D\\D\\D"); //false
        boolean h = "ABC".matches("\\D\\D\\D"); //true

        // testando o \\d
        boolean d = "0".matches("\\d"); //true
        boolean e = "21".matches("\\d"); // false
        boolean f = "324".matches("\\d\\d\\d"); // true

        // testando o .
        boolean a = "P".matches("."); // true
        boolean b = "Pi".matches("."); //false
        boolean c = "Pi".matches(".."); //true






    }
}
