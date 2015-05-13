package com.ueg.semestre1.lista2.ex3;

import java.util.Scanner;

/**
 * Created by rootcg on 12/05/15.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo! Digite uma quantidade de strings maior ou igual a 10");
        Scanner in = new Scanner(System.in);

        String entrada = in.nextLine();

        System.out.println(entrada);

        for(int i = 0;  i < entrada.length(); i++){
            System.out.println(entrada.charAt(i));
        }

        System.out.println("Pirou ne? Eh nois que voa bruxao!");
    }
}
