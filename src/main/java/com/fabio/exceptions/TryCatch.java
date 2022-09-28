package com.fabio.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = 0;
        double b = 0;
        double c = 0;
        try{
            a = scan.nextInt();
            b = scan.nextInt();
            c = a / b;
            System.out.println("Se der erro isso não será impresso");


        }catch (InputMismatchException e){
            System.out.println("Alert! O valor informado deve ser um número.");
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        scan.close();

    }
}
