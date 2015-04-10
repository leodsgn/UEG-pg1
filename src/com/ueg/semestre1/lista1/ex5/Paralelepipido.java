package com.ueg.semestre1.lista1.ex5;

/**
 * Created by root on 4/10/2015.
 */
public class Paralelepipido{
    private double altura;
    private double largura;
    private double comprimento;

    public Paralelepipido(double altura, double largura, double comprimento){
        setAltura(altura);
        setComprimento(comprimento);
        setLargura(largura);

        System.out.println("Ola! Abaixo voce confere os valores inseridos e suas respostas. \n" +
                "Comprimento: " + comprimento + "\n" +
                "Altura: " + altura + "\n" +
                "Largura: " + largura + "\n\n" +
                "O valor total da AREA e " + Area(getAltura(), getLargura()) + "\n" +
                "O valor total do VOLUME e " + Volume(getComprimento(), getLargura(), getAltura()));
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



    //Área e Volume

    public double Volume(double comprimento, double largura, double altura){
        double volume = altura * comprimento * largura;
        return volume;
    }

    public double Area(double altura, double largura){
        double area = ( 2 * (altura * largura + altura * comprimento + largura * comprimento));
        return area;
    }
}