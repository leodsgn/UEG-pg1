package com.ueg.semestre1.lista1.ex6;


public class Cilindro {
    private static final double PI = 3.1415;
    private double altura;
    private double largura;
    private double comprimento;
    private double raio;

    public Cilindro(double altura, double largura, double comprimento) {
        setAltura(altura);
        setComprimento(comprimento);
        setLargura(largura);
        this.raio = 2*largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double AreaLateral(){
        double areaLateral = (2*PI*raio*getAltura());
        return areaLateral;
    }

    public double AreaTotal(){
        double areaTotal = 2*PI*raio*(getAltura()+ raio);
        return areaTotal;
    }

    public double Volume(){
        double volume = PI*raio*raio*getAltura();
        return volume;
    }
}
