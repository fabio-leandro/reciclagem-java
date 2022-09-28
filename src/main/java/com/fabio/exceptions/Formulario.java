package com.fabio.exceptions;

import java.util.Scanner;

public class Formulario {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String nome = scan.next();
        String regexNome = "^[A-Z][a-z]+";
        try{
            if(!nome.matches(regexNome)){
                throw new ValidationException("Lançando Exception: Nome inválido.");
            }
        }
        catch (ValidationException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Bloco Finally");
        }

        System.out.println("Com ou sem exception. Isso aqui está sendo impresso porque a exceção foi tratada.");
        scan.close();

    }
}
