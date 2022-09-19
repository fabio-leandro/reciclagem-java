package com.fabio.regex;

public class Aula04CaracteresFronteira {

    public static void main(String[] args) {

        /*
        * ^ inicia
        * $ finaliza
        * |
        * */

        boolean b = "Youtube".matches("^You.*"); //true
        b = "Youtube".matches("^You"); //false
        b = "Youtube".matches(".*tube$"); //true
        b = "Youtube".matches("tube$"); //false
        b = "Se inscreva no Youtube".matches(".*inscreva.*"); //true
        b = "Se inscreva no Youtube".matches("^Se.*Youtube$"); //true
        b = "sim".matches("sim|não"); //true

        System.out.println(b);



    }
}
