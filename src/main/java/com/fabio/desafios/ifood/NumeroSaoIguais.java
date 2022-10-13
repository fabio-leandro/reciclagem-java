package com.fabio.desafios.ifood;

import java.io.IOException;
import java.util.Scanner;

public class NumeroSaoIguais {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        String resultado = n1 == n2 ?  "Sao iguais!":"Nao sao iguais!";
        System.out.println(resultado);
        scan.close();


    }
}

/*
* Desafio
Nesse desafio, dados dois números, verifique se eles são iguais. Caso sejam, retorne "Sao iguais!”. Caso contrário,
* retorne "Nao sao iguais!” sem as aspas.

Entrada
As entradas serão dois valores, um em cada linha, representados por A e B, que sempre serão números inteiros.

Saída
A saída deverá retornar a frase "Sao iguais!" caso A e B sejam o mesmo valor. Caso contrário, retorne "Nao sao iguais!",
*  sem as aspas.

* EXEMPLO DE ENTRADA

                            EXEMPLO DE SAÍDA

1
2

                            Nao sao iguais!

50
50

                            Sao iguais!

38
90

                            Nao sao iguais!

* */
