package com.ueg.semestre1.lista1.ex1;

/**
 * Created by root on 3/31/2015.
 */
public class Pessoa {
    private double peso;
    private double altura;
    private String name;
    private double imc;

    public Pessoa() {
    }

    public Pessoa(double peso, double altura, String name) {
        setPeso(peso);
        setAltura(altura);
        setName(name);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getImc() {
        this.imc = peso/Math.pow(altura, 2);
        return imc;
    }
}
