package com.fabio.desafios.ifood;

import java.io.IOException;
import java.util.Scanner;

public class ChamadaRecursiva {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        int soma = somatorio(numero);
        System.out.println(soma);
        scan.close();
    }

    public static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }
}

/*
Descrição
Neste desafio, receba um número inteiro N, calcule e imprima o somatório de todos os números de N até 0.

Entrada
A Entrada será composta por um número inteiro, N.

Saída
Será impresso o somatório de N até 0, como no exemplo a baixo:

EXEMPLO DE ENTRADA

                            EXEMPLO DE SAÍDA

10	                        55
4	                        10
15	                        120
* */
