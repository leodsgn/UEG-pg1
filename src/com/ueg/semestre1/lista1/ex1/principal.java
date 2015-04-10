package com.ueg.semestre1.lista1.ex1;

/**
 * Created by root on 3/31/2015.
 */
public class principal {
    public static void main(String args[]){

        Pessoa leo = new Pessoa(88.0, 1.89, "Leo Ribeiro");
        System.out.println("Nome: " + leo.getName());
        System.out.println("Altura: " + leo.getAltura());
        System.out.println("Peso: " + leo.getPeso() + "Kg");
        System.out.println("Indice de Massa Corporal (IMC): " + leo.getImc());

    }
}
