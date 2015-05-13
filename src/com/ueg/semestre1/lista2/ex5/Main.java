package com.ueg.semestre1.lista2.ex5;

import java.util.Scanner;

/**
 * Created by rootcg on 12/05/15.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo! Digite uma string!");
        Scanner in = new Scanner(System.in);

        String entrada = in.nextLine();

        entrada = entrada.replaceAll("[aeiou]", "?");

        System.out.println(entrada);

    }

}
