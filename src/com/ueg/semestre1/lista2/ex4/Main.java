package com.ueg.semestre1.lista2.ex4;

import java.util.Scanner;

/**
 * Created by rootcg on 12/05/15.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo! Digite uma string!");
        Scanner in = new Scanner(System.in);

        String entrada = in.nextLine();

        System.out.println("Agora digite a quantidade de caracteres a ser lido:");

        int quantidadeCaracter = in.nextInt();

        if(quantidadeCaracter > entrada.length()){
            System.out.println("Quantidade Invalida cumpadi!");
        } else {
            for(int i = 0;  i < quantidadeCaracter; i++){
                System.out.print(entrada.charAt(i));
            }
        }


    }
}
