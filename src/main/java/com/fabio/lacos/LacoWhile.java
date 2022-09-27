package com.fabio.lacos;

import java.util.concurrent.ThreadLocalRandom;

public class LacoWhile {

    public static void main(String[] args) {

        boolean sair = false;

        while (!sair){
           int aleatorio = ThreadLocalRandom.current().nextInt(2,10);
            System.out.println(aleatorio);
            if(aleatorio % 2 == 0) {
                sair = true;
            }
        }
    }
}
