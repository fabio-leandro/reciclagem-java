package com.fabio.desafios.ifood;

import java.io.IOException;
import java.util.Scanner;

public class ValidacaoParenteses {

    public static void main(String[] args) throws IOException {

        Scanner scanner= new Scanner(System.in);
        boolean caracter = ehValido(scanner.nextLine());
        System.out.println(caracter);

    }

    public static boolean ehValido(String s) {
        if(s.charAt(0) == '(' && s.charAt(1) == ')') return true;
        if(s.charAt(0) == '{' && s.charAt(1) == '}') return true;
        if(s.charAt(0) == '[' && s.charAt(1) == ']') return true;
        return false;
    }
}

/*
Desafio
Dada uma string com apenas os seguintes caracteres '(', ')', '{', '}', '[', ']' determine se uma determinada string é
válida.

Entrada
Uma string é considerada válida se:

Caracteres de abertura devem ser fechadas pelo mesmo tipo. Abertura devem ser fechados com uma chave correspondente.
Uma string vazia é considerada válida.

Saída
A saída corresponde a um valor Booleano como no exemplo abaixo:

Entrada	        Saída
[ ]
                true
( )
                true
[ )
                false
* */
