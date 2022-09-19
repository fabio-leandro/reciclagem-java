package com.fabio.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aula07ClassesInternas {

    public static void main(String[] args) {

        String doce = "Qual é o Doce mais doCe que o doce de arroz DOCe";
        Matcher matcher = Pattern.compile("(?i)doce").matcher(doce);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
