package com.fabio.desafios;

import java.io.IOException;
import java.util.Scanner;

public class CalculoSimples {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        double valor = 0;

        for(int i = 0; i < 2;i++){
            int codigo = scan.nextInt();
            int qtd = scan.nextInt();
            double preco = scan.nextDouble();

            valor += (qtd * preco);
        }

        System.out.printf("VALOR A PAGAR: R$%.2f",valor);

        scan.close();

    }
}

/*
Desafio
Neste problema, deve-se ler:

O código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1. O código de uma peça 2, o número de peças
2 e o valor unitário de cada peça 2. Após, calcule e mostre o valor a ser pago.

Entrada
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois inteiros e um
valor com 2 casas decimais.

Saída
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois pontos
e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.

Exemplos de Entrada	    Exemplos de Saída
12 1 5.30
16 2 5.10

                        VALOR A PAGAR: R$ 15.50

13 2 15.30
161 4 5.20

                        VALOR A PAGAR: R$ 51.40


1 1 15.10
2 1 15.10

                        VALOR A PAGAR: R$ 30.20


* */
