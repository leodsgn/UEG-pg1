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
     * Construtor da classe ou método inicializador da classe pra quando a mesma for instanciada.
     * Ela pode ser deixada vazia mesmo, caso o usuário não queira preencher nada no começo
     */
    public Pessoa() {
    }

    /**
     * Aqui outro método construtor (sim, pode ter mais de um método construtor na classe), caso o usuário
     * queira já preencher os valores.
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
     * @return o peso inserido no construtor ou nos métodos setters
     */
    public double getPeso() {
        return peso;
    }

    /**
     * O usuário vai inserir o peso para cálculo.
     * @param peso
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return a altura inserida no construtor ou nos métodos setters
     */
    public double getAltura() {
        return altura;
    }

    /**
     * O usuário vai inserir a altura para cálculo.
     * @param altura
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return o nome inserido no construtor ou nos métodos setters
     */
    public String getName() {
        return name;
    }

    /**
     * O usuário vai inserir o nome para registro temporário.
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return o resultado IMC (Índice de Massa Corporea) resultante dos dados de altura e peso
     */
    public double getImc() {
        this.imc = peso/Math.pow(altura, 2);
        return imc;
    }
}
