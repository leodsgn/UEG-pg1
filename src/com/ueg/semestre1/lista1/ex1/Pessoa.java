package com.ueg.semestre1.lista1.ex1;

/**
 * Created by root on 3/31/2015.
 */
public class Pessoa {

    /**
     * Aqui voce coloca os detalhes da pessoa
     */
    private double peso;
    private double altura;
    private String name;
    private double imc;


    /**
     * Construtor da classe ou m�todo inicializador da classe pra quando a mesma for instanciada.
     * Ela pode ser deixada vazia mesmo, caso o usu�rio n�o queira preencher nada no come�o
     */
    public Pessoa() {
    }

    /**
     * Aqui outro m�todo construtor (sim, pode ter mais de um m�todo construtor na classe), caso o usu�rio
     * queira j� preencher os valores.
     *
     * @param peso
     * @param altura
     * @param name
     */
    public Pessoa(double peso, double altura, String name) {
        setPeso(peso);
        setAltura(altura);
        setName(name);
    }

    /**
     * @return o peso inserido no construtor ou nos m�todos setters
     */
    public double getPeso() {
        return peso;
    }

    /**
     * O usu�rio vai inserir o peso para c�lculo.
     * @param peso
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return a altura inserida no construtor ou nos m�todos setters
     */
    public double getAltura() {
        return altura;
    }

    /**
     * O usu�rio vai inserir a altura para c�lculo.
     * @param altura
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return o nome inserido no construtor ou nos m�todos setters
     */
    public String getName() {
        return name;
    }

    /**
     * O usu�rio vai inserir o nome para registro tempor�rio.
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return o resultado IMC (�ndice de Massa Corporea) resultante dos dados de altura e peso
     */
    public double getImc() {
        this.imc = peso/Math.pow(altura, 2);
        return imc;
    }
}
