package com.fabio.desafios.ifood;

import java.io.IOException;
import java.util.Scanner;

public class BuscaSequencial {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};
        int numero = scan.nextInt();
        System.out.println(buscarNumero(numero,elementos));
        scan.close();
    }

    public static String buscarNumero(int numero, int[] array){
        for (int i = 0; i < array.length; i++){
            if(numero == array[i]) return String.format("Achei %d na posicao %d",numero,i);
        }

        return String.format("Numero %d nao encontrado!",numero);
    }
}
/*
Desafio
Uma busca sequencial se caracteriza por percorrermos todos os  elementos de uma estrutura em busca do elemento “X”
desejado. Neste desafio, dada uma estrutura de vetor A [a1, a2...an], percorra
todo o vetor fazendo as comparações deA[N] = X.
Caso a condição seja verdadeira, “X” existe na estrutura e
a busca será concluída com sucesso.

Considere um array de 10 elementos do tipo inteiro:

Os elementos são {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}.

● Implemente uma classe em Java que aloque e carregue esses elementos em um array.

● Implementação da busca sequencial:

● Crie um método em Java que realiza uma busca sequencial.

● Se o valor constar no array, retorne um texto contendo o valor e sua respectiva posição no array.
Caso contrario retorne um texto dizendo que o número não foi encontrado, conforme exemplos abaixo.



Entrada
A entrada consiste em um valor de busca e/ou array

Saída
A saída será a a posição do elemento no array, caso o valor não se encontre na Array, retorne a frase " Numero __
nao encontrado!", como no exemplo abaixo:

EXEMPLO DE ENTRADA

                        EXEMPLO DE SAÍDA

81

                        Achei 81 na posicao 5

10

                        Achei 10 na posicao 8

-16

                        Achei –16 na posicao 2

4

                        Numero 4 nao encontrado!
* */
