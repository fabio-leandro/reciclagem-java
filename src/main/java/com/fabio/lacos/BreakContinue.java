package com.fabio.lacos;

public class BreakContinue {

    public static void main(String[] args) {

        String times[] = {"Cruzeiro", "São Paulo","Atletico MG","Flamengo","Palmeiras"};

        for (int i = 0; i < times.length; i++){

            if(times[i].equals("Atletico MG")){
                System.out.println("Encontramos um time aspirante a time grande");
                System.out.println("É melhor sair fora.");
                break;
            }
            System.out.println(times[i]);
        }

        System.out.println("**************************************************************");

        for (int i = 0; i < times.length; i++){

            if(times[i].equals("Atletico MG")){
                System.out.println("Esse time não está preparado para ser grande");
                continue;
            }
            System.out.println(times[i]);
        }

    }
}
