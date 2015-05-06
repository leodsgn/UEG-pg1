package com.ueg.semestre1.lista1.ex2;

/**
 * Created by root on 5/5/2015.
 */
public class Piramide {
    private double altura, base, volume;

    public Piramide() {
    }

    public Piramide(double altura, double base) {
        this.altura = altura;
        this.base = base;
        this.volume = (base * altura)/3;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double base, double volume) {
        this.volume = (base * altura)/3;
    }
}
