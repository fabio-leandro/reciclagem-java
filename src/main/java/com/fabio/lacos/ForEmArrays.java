package com.fabio.lacos;

public class ForEmArrays {

    public static void main(String[] args) {

        String times[] = {"Cruzeiro", "São Paulo","Flamengo","Palmeiras"};

        for (int i = 0; i < times.length; i++){
            System.out.println(times[i]);
        }

        for(String t: times){
            System.out.println(t);
        }

    }
}
