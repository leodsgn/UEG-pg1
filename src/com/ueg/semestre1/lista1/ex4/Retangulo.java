package com.ueg.semestre1.lista1.ex4;

/**
 * Created by root on 4/7/2015.
 */
public class Retangulo implements Geometricos {

    private double perimetro;
    private double comprimento;
    private double largura;


    @Override
    public double getComprimento() {
        return comprimento;
    }

    @Override
    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public double getLargura() {
        return largura;
    }

    @Override
    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setPerimetro(double comprimento, double largura) {
        setComprimento(comprimento);
        setLargura(largura);

        this.perimetro = (2*this.comprimento) + (2*this.largura);
    }

    public double getPerimetro(){
        return perimetro;
    }

    public Retangulo(double comprimento, double largura){
        if(comprimento <= 0 || largura <= 0){
            System.out.println("So e permitido numeros maiores que 0 (zero)!");
            return;
        }
        setPerimetro(comprimento, largura);
        System.out.println("Comprimento: " + getComprimento() + ".");
        System.out.println("Largura " + getLargura() + ".");

        System.out.println("Perimetro: " + getPerimetro());
    }

}
