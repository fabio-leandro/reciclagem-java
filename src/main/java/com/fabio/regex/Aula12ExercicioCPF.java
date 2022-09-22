package com.fabio.regex;

import java.util.Scanner;

public class Aula12ExercicioCPF {

    public static void main(String[] args) {
        //000.000.000-00
        Scanner scanner = new Scanner(System.in);
        String cpf = scanner.next();

        String regexCpfLimpo = "(\\d{3})(\\d{3})(\\d{3})(\\d{2})";
        String regexCpfFormatado = "$1.$2.$3-$4";
        String newCpf = cpf.replaceAll(regexCpfLimpo,regexCpfFormatado);

        System.out.println(cpf);
        System.out.println(newCpf);
        System.out.println(newCpf.length());
    }
}
