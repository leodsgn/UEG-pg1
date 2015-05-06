package com.ueg.semestre1.lista1.ex7;

/**
 * Created by root on 5/5/2015.
 */
public class Cone {
    private double raio, altura, geratriz;
    protected static final double PI = 3.1415;

    public Cone() {
    }

    public Cone(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    public double getGeratriz(){
        this.geratriz = (Math.sqrt((this.altura) + (this.raio)));
        return geratriz;
    }

    public double getAreaLateral(){

        double areaLateral = (PI*this.raio*getGeratriz());
        return areaLateral;
    }

    public double getAreaTotal(){
        double areaTotal = (PI*this.raio*(this.geratriz+this.raio));
        return areaTotal;
    }

    public double getVolume(){
        double volume = (1.0/3.0*PI*this.raio*this.altura);
        return volume;
    }


}
