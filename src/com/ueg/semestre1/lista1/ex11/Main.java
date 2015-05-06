package com.ueg.semestre1.lista1.ex11;

/**
 * Created by root on 5/6/2015.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("E ai! Firmeza? Bora ver se tu eh gordo!!!");

        Paciente paciente = new Paciente(87.3, 1.89, "Leozim Beleza");

        System.out.println("Seus dados:");
        System.out.println("Nome: " + paciente.getName());
        System.out.println("Peso: " + paciente.getPeso());
        System.out.println("Altura: " + paciente.getAltura());

        System.out.println("IMC: " + paciente.getImc());

        System.out.println("\n\nBaseado no seu IMC, mano, tu ta com " + paciente.calculaFaixaPeso());
    }
}
