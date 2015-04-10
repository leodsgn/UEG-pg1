package com.ueg.semestre1.lista1.ex5;

import java.util.Scanner;

/**
 * Created by root on 4/10/2015.
 */
public class Main_Class {
    public static void main(String[] args){
        Paralelepipido paralelelpipido;
        Scanner in = new Scanner(System.in);

        System.out.println("Por favor, insira os valores correspondentes");
        System.out.println("Comprimento: ");
        double comprimento = in.nextDouble();

        System.out.println("Largura: ");
        double largura = in.nextDouble();

        System.out.println("Altura: ");
        double altura = in.nextDouble();

        paralelelpipido = new Paralelepipido(altura, largura, comprimento);
    }
}
