package com.ueg.semestre1.lista1.ex6;

import java.util.Scanner;

/**
 * Created by root on 4/10/2015.
 */
public class Main_Class {
    public static void main(String[] args){
        Cilindro cilindro;
        Scanner in = new Scanner(System.in);

        System.out.println("Insira os valores para o cilindro.");

        System.out.println("Largura: ");
        double largura = in.nextDouble();

        System.out.println("Altura: ");
        double altura = in.nextDouble();

        System.out.println("Comprimento: ");
        double comprimento = in.nextDouble();

        cilindro = new Cilindro(altura, largura, comprimento);

        System.out.println("\n");
        System.out.println("Area Lateral: " + cilindro.AreaLateral());
        System.out.println("Area Total: " + cilindro.AreaTotal());
        System.out.println("Volume: " + cilindro.Volume());
    }
}
