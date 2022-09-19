package com.fabio.regex;

public class Aula05Quntificadores {

    public static void main(String[] args) {

        /*
            * X{n}     X,exatamente n vezes
            * X{n,}    X, pelo menos n vezes
            * X{n,m}   X, pelo menos n mas não mais do que m vezes
            * X?       X, 0 ou 1 vez
            * X*       X, 0 ou + vezes
            * X+       X, 1 ou + vezes
        * */

        boolean b = "ABC".matches("\\w{3}"); //true
        b = "1234".matches("\\d{4}"); //true
        b = "12".matches("\\d{3}"); // false
        b = "1234567".matches("\\d{2,}"); //true
        b = "1234567".matches("\\d{12,}"); //false
        b = b = "1234567".matches("\\d{2,7}"); //true
        b = b = "1234567".matches("\\d{2,6}"); //false
        b = b = "".matches(".?"); //true
        b = "A".matches(".?"); //true
        b = "AB".matches(".?"); //false
        b = "".matches(".*"); //true
        b = "1234567890".matches(".*"); //tue
        b = "".matches(".+"); //false
        b = "1234567890".matches(".+"); //tue
        System.out.println(b);

        String data = "19/09/2022";
        String regData = "\\d{2}/\\d{2}/\\d{4}";
        System.out.println(data.matches(regData));

        String cep = "32000-120";
        String regCep = "\\d{5}-\\d{3}";
        System.out.println(cep.matches(regCep));

    }
}
