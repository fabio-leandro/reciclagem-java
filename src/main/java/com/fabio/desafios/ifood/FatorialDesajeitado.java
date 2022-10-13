package com.fabio.desafios.ifood;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FatorialDesajeitado {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        // * / + -
        int numero = scan.nextInt();
        List<Object> expressao = new ArrayList<>();
        List<Integer> multiDivisao = new ArrayList<>();
        List<Object> expressaoSomaSubtracao = new ArrayList<>();
        int resultado = 0;
        char tag = '*';
        if(numero == 1) resultado = 1;
        else {
            //Criando expressao com Lista
            for (int i = numero; i >= 1;i--){
                if(tag == '*'){
                    expressao.add(i);
                    expressao.add(tag);
                    tag = '/';
                }else if(tag == '/'){
                    expressao.add(i);
                    expressao.add(tag);
                    tag = '+';
                }else if(tag == '+'){
                    expressao.add(i);
                    expressao.add(tag);
                    tag = '-';
                }else if(tag == '-'){
                    expressao.add(i);
                    expressao.add(tag);
                    tag = '*';
                }
            }
            //Removendo o último item da lista que não será necessário
            expressao.remove(expressao.size() - 1);

            //Adicionado as multiplicaçãoes e divisões no Array
            int res = 1;
            for (int i = 0; i < expressao.size();i++){
                if(expressao.get(i).equals('*')){
                    res = res * ( (int) expressao.get(i-1) * (int) expressao.get(i+1));
                    if((int) expressao.get(i+1) == 1 || !expressao.get(i+2).equals('/')) multiDivisao.add(res);
                }
                if(expressao.get(i).equals('/')){
                    res = res / (int) expressao.get(i+1);
                    multiDivisao.add(res);
                    res = 1;
                }
            }

            //Montando expressão soma e subtração final no Array
            int contArray = 0;
            expressaoSomaSubtracao.add(multiDivisao.get(contArray));
            contArray++;
            for (int i = 0; i < expressao.size();i++){
                if(expressao.get(i).equals('+')){
                    expressaoSomaSubtracao.add(expressao.get(i));
                    expressaoSomaSubtracao.add(expressao.get(i+1));
                }
                if (expressao.get(i).equals('-')){
                    expressaoSomaSubtracao.add(expressao.get(i));

                    if(contArray < multiDivisao.size()){
                        expressaoSomaSubtracao.add(multiDivisao.get(contArray));
                        contArray++;
                    }else {
                        expressaoSomaSubtracao.add(expressao.get(i+1));
                    }
                }
            }
            //Fazendo a conta final
            resultado = (int) expressaoSomaSubtracao.get(0);
            for (int i = 0; i < expressaoSomaSubtracao.size(); i++){
                if(expressaoSomaSubtracao.get(i).equals('+')){
                    resultado = resultado + (int) expressaoSomaSubtracao.get(i+1);
                } else if(expressaoSomaSubtracao.get(i).equals('-')){
                    resultado = resultado - (int) expressaoSomaSubtracao.get(i+1);
                }

            }
        }

        System.out.println(resultado);

        scan.close();

    }
}
/*
Desafio
O fatorial de um número inteiro positivo N é o produto de todos os inteiros positivos menores ou iguais a n.
Fazemos um fatorial desajeitado usando os inteiros em ordem decrescente, trocando as operações de multiplicação
por uma rotação fixa de operações cuja ordem é: multiplicar '*', dividir '/', adicionar '+' e subtrair '-'.
Por exemplo, desajeitado(10) = 10 * 9 / 8 + 7 - 6 * 5 / 4 + 3 - 2 * 1. Lembre-se que no fatorial desajeitado as
operações ainda são aplicadas usando a ordem usual de operações aritméticas. Além disso, a divisão neste caso
sempre resulta em um número inteiro, por exemplo, 90 / 8 = 11. Dado um inteiro N, retorne o fatorial desajeitado
de n.

Entrada
A entrada consiste em um valor inteiro positivo N.

Saída
A saída consiste em retornar o valor do seu fatorial desajeitado de N, conforme exemplo abaixo.

Exemplo 1:
Entrada	       Saída
4	            7
Explicação: 7 = 4 * 3 / 2 + 1

Entrada	     Saída
10	         12
Explicação: 12 = 10 * 9 / 8 + 7 - 6 * 5 / 4 + 3 - 2 * 1

* */
