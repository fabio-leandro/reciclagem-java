package com.fabio.desafios.ifood;

import java.io.IOException;
import java.util.Scanner;

public class ClassificandoMatrizes {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        int tamanhoArray = scan.nextInt();
        int[] numeros = new int[tamanhoArray];
        int[] numsOrganizados = new int[tamanhoArray];

        for(int i = 0; i < numeros.length; i++){
            numeros[i] = scan.nextInt();
        }

        int controle = 0;
        for (int n:numeros){
            if(n % 2 == 0){
                numsOrganizados[controle] = n;
                controle++;
            }
        }

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] % 2 != 0 && numsOrganizados[i] == 0){
                numsOrganizados[i] = numeros[i];
            }
        }

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] % 2 != 0){
                for(int j = 0; j < numsOrganizados.length;j++){
                    if(numsOrganizados[j] == 0){
                        numsOrganizados[j] = numeros[i];
                        break;
                    }
                }
            }
        }

        for (int n: numsOrganizados){
            System.out.println(n);
        }

        scan.close();
    }
}
/*
Desafio
Dado um array inteiro nums, mova todos os inteiros pares no início do array seguido por todos os inteiros ímpares.

Retorne qualquer array que satisfaça essa condição.


Entrada
A primeira linha da entrada deverá conter um inteiro que corresponda ao tamanho do array. As linhas seguintes
deverão conter os valores que esse array receberá.

Saída
A saída deverá retornar todos os valores pares para o começo do array, seguido pelos ímpares, conforme exemplo
abaixo:

Entrada	        Saída
4
3
1
2
4

                2
                4
                3
                1

Entrada	        Saída
1
0
                0
* */
