package com.fabio.regex;

public class Aula10ExercicioData {

    public static void main(String[] args) {

        String data = "2022/09/21";

        String regexData = "(\\d{4})/(\\d{2})/(\\d{2})";

        String newData = data.replaceAll(regexData,"$3/$2/$1");

        System.out.println(data.matches(regexData));
        System.out.println(newData);


    }
}
