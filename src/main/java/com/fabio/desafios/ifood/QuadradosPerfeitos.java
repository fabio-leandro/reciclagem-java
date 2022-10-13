package com.fabio.desafios.ifood;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuadradosPerfeitos {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        List<Integer> quadrados = new ArrayList<>();
        int contMenorQuantidade = 0;
        for(int i = 1; i <= numero; i++){
            if(Math.sqrt(i) % 1 == 0){
                quadrados.add(i);
            }
        }
        //Partindo do principio que começando do maior quadrado perfeito para o menor será possível
        // achar a menor quantidade
        if(quadrados.contains(numero)){
            contMenorQuantidade = 1;
        }else {

           for(int i = quadrados.size() - 1; i >= 0; i--){
               if(quadrados.get(quadrados.size() -1) + quadrados.get(i) == numero){
                   contMenorQuantidade = 2;
                   break;
               }
           }

           if(contMenorQuantidade == 0){
               for (int i = quadrados.size() - 1; i >= 0; i--){
                   if(numero % quadrados.get(i) == 0 && quadrados.get(i) > 1){
                       contMenorQuantidade = numero / quadrados.get(i);
                       break;
                   }
               }
           }

           if(contMenorQuantidade == 0){
               int soma = 0;
               for(int i = quadrados.size() - 1; i >= 0; i--){
                  while (soma <= numero){
                      soma = soma + quadrados.get(i);
                      if(soma <= numero) {
                          contMenorQuantidade ++;
                      }else {
                          soma = soma - quadrados.get(i);
                          break;
                      }
                  }
               }
           }
        }

        System.out.println(contMenorQuantidade);

        scan.close();
    }
}
/*
Desafio
Dado um inteiro n,
retorne o menor número de números quadrados perfeitos cuja soma seja n.
Um quadrado perfeito é um inteiro que é o quadrado de um inteiro;
em outras palavras, é o produto de algum inteiro consigo mesmo.
Por exemplo, 1, 4, 9 e 16 são quadrados perfeitos, enquanto 3 e 11 não são.

Entrada
A entrada consiste em um número inteiro n, representando o valor total.

Saída
A saída consiste em retornar o menor número de números quadrados perfeitos.

EXEMPLO DE ENTRADA

                            EXEMPLO DE SAÍDA

12

                            3

13

                            2

10

                            2
* */
