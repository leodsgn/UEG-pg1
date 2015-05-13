package com.ueg.semestre1.lista2.ex1;

import java.util.Scanner;

/**
 * Created by Leonardo Ribeiro on 12/05/15.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo! Digite uma quantidade de strings maior ou igual a 10");
        Scanner in = new Scanner(System.in);

        String entrada = in.nextLine();

        System.out.println(entrada);

        if(entrada.length() >= 10){
            System.out.println("Voce digitou a quantidade certa! Isso aew cumpadi!");
        }
        else{
            System.out.println("Voce digitou menos que 10 caracteres! Nem rola isso ai meu!");
        }

    }
}
