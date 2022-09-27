package com.fabio.lacos;

import java.util.concurrent.ThreadLocalRandom;

public class LacoDoWhile {

    public static void main(String[] args) {
        int aleatorio;
        do{
            aleatorio = ThreadLocalRandom.current().nextInt(2,12);
            System.out.println(aleatorio);
        }while (aleatorio % 2 == 0);

    }
}
