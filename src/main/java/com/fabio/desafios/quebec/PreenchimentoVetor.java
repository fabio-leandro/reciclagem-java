package com.fabio.desafios.quebec;

import java.io.IOException;
import java.util.Scanner;

public class PreenchimentoVetor {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        int[] n = new int[1000];
        int N = scan.nextInt();
        for(int i = 0; i < n.length;){
            for(int j = 0; j < N; j++){
                if (i == 1000) break;
                System.out.printf("N[%d] = %d\n", i, j);
                i++;
            }
            if(i == 1000) break;
        }

        scan.close();

    }
}
/*
Desafio
Faça um programa que leia um valor T e preencha um vetor N[1000] com a sequência de valores de 0 até T-1 repetidas
vezes, conforme exemplo abaixo. Imprima o vetor N.

Entrada
A entrada contém um valor inteiro T (2 ≤ T ≤ 50).

Saída
Para cada posição do vetor, escreva "N[i] = x", onde i é a posição do vetor e x é o valor armazenado naquela posição.

Exemplo de Entrada	    Exemplo de Saída
3

                        N[0] = 0
                        N[1] = 1
                        N[2] = 2
                        N[3] = 0
                        N[4] = 1
                        N[5] = 2
                        N[6] = 0
                        N[7] = 1
                        N[8] = 2
* */
