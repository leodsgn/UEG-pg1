package com.ueg.semestre1.lista1.ex3;

/**
 * Created by root on 5/5/2015.
 */
public class Esfera {
    private double raio;
    protected static final double PI = 3.1415;

    public Esfera() {
    }

    public Esfera(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getArea(){
        double area = (4*PI*Math.pow(raio, 2));
        return area;
    }

    public double getVolume(){
        double volume = ((4/3)*PI*Math.pow(raio, 3));

        return volume;
    }


}
