package com.fabio.desafios.ifood;

import java.io.IOException;
import java.util.Scanner;

public class SomandoMultiplos {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();
        int limiteNumero = scan.nextInt();
        int soma = 0;
        for (int i = numero; i <= limiteNumero; i++){
            if(i % numero == 0){
                soma += i;
            }
        }
        System.out.println(soma);

        scan.close();

    }
}

/*
Desafio
Dado um número A e o seu limite N, encontre a soma de todos os múltiplos A até o seu limite N.

Entrada
A entrada deverá ser composta pelo valor A na primeira linha, seguido do valor N na segunda.

Saída
A saída deverá retornar o valor da soma de todos os múltiplos A até o seu limite N.

Exemplo 1
Entrada	        Saída
5
20	            50

Exemplo 2
Entrada	       Saída
3
18	           63
* */
