package com.ueg.semestre1.lista1.ex7;

/**
 * Created by root on 5/5/2015.
 */
public class Main {
    public static void main(String[] args){
        System.out.println("Segue os dados do Cone");

        Cone cone = new Cone(23, 48);

        System.out.println("Sua area lateral eh de: " + cone.getAreaLateral());
        System.out.println("Sua geratriz eh de: " + cone.getGeratriz());
        System.out.println("Seu volume eh de: " + cone.getVolume());

    }
}
