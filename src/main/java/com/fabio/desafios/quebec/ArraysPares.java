package com.fabio.desafios.quebec;


public class ArraysPares {

    public static void main(String[] args) {

        int[] inteiros = {2, 3, 5, 7, 11, 13, 18, 34};

            for(int n: inteiros){
                if(n % 2 == 0){
                    System.out.println(n);
                }
            }
    }

}

/*
Desafio
O objetivo deste desafio é resolvê-lo utilizando o seu conhecimento sobre Arrays, uma estrutura de dados que armazena
uma coleção de dados em um bloco de memória. Dado uma array de valores {2, 3, 5, 7, 11, 13, 18, 34}, desenvolva um
programa que retorne como resultado apenas os números pares dessa array.

Entrada
A entrada consiste em um array de números inteiros positivos.

Saída
A saída do desafio equivale aos números pares do Array, como mostra o exemplo a baixo:

Entrada                                 Saída

 2, 3, 5, 7, 11, 13, 18, 34

                                        2
                                        18
                                        34



* */
