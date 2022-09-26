package com.fabio.condicional;

public class SwitchCase {

    public static void main(String[] args) {

        String resultado = "D";

        switch (resultado){
            case "A":
                System.out.println("Parabéns você foi aprovado");
                break;
            case "B":
                System.out.println("Você não foi aprovado mais pode tentar prova de recuperação.");
                break;
            case "C":
                System.out.println("Infelizmente você não foi aprovado e terá que repetir de ano.");
                break;
            default:
                System.out.println("Essa avaliação não é válida.");

        }

        String plano = "Completo";
        System.out.println("Seu pacote tem: ");
        switch (plano){
            case "Completo":
                System.out.println("Telefone");
            case "Medio":
                System.out.println("Internet");
            case "Basico":
                System.out.println("TV");
        }


    }
}
