package com.ueg.semestre1.lista2.ex6;

import java.util.Scanner;
import java.lang.Character;

/**
 * Created by rootcg on 12/05/15.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo! Digite uma string!");
        Scanner in = new Scanner(System.in);
        String entrada = in.nextLine();

        String novoValor = "";
        for (int i = 0; i<entrada.length(); i++){
            if (Character.isDigit(entrada.charAt(i))){
                novoValor = new StringBuilder().append(entrada.charAt(i)).toString();
            }
            System.out.print(novoValor);
        }



    }
}
