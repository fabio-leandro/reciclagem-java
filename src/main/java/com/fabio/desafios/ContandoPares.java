package com.fabio.desafios;

import java.io.IOException;
import java.util.Scanner;

public class ContandoPares {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int contPares = 0;
        int soma = 0;
        int n = scan.nextInt();
        for(int i = n; i > 0; i--){
           String[] num = String.valueOf(i).split("");
           for(String s: num){
               soma = soma + Integer.parseInt(s);
           }
            if(soma % 2 == 0){
                contPares++;
            }
            soma = 0;
        }

        System.out.println(contPares);

        scan.close();

    }
}
/*
Desafio
Dado um inteiro positivo num, retorne o número de inteiros positivos menor ou igual a num cuja soma de dígitos
é par. A soma dos dígitos de um inteiro positivo é a soma de todos os seus dígitos.

Entrada
Como entrada você recerá um valor inteiro e positivo.

Saída
Como saída, será impresso a soma de todos os numeros inteiros positivos menores ou iguais ao num, como nos exemplos a
baixo:

Exemplo 1:
Entrada	     Saída
4	         2

Explicação:

Os únicos inteiros menores ou iguais a 4 cujas somas de dígitos são pares são: [ 2 e 4 ].

Exemplo 2:

Entrada	   Saída
30	       14
 Explicação:

Os 14 inteiros menores ou iguais a 30 cujas somas de dígitos são pares são:

[ 2, 4, 6, 8, 11, 13, 15, 17, 19, 20, 22, 24, 26 e 28 ].

* */
