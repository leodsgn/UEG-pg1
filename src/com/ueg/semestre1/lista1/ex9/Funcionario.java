package com.ueg.semestre1.lista1.ex9;

/**
 * Created by root on 5/6/2015.
 */
public class Funcionario {
    private String nome;
    private long cpf;
    private int horasTrabalhadas;
    private double valorPorHoraDeTrabalho;

    public Funcionario(String nome, long cpf, int horasTrabalhadas, double valorPorHoraDeTrabalho) {
        this.nome = nome;
        this.cpf = cpf;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHoraDeTrabalho = valorPorHoraDeTrabalho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorPorHoraDeTrabalho() {
        return valorPorHoraDeTrabalho;
    }

    public void setValorPorHoraDeTrabalho(double valorPorHoraDeTrabalho) {
        this.valorPorHoraDeTrabalho = valorPorHoraDeTrabalho;
    }

    public double calculaSalario(){
        double salario = getHorasTrabalhadas() * getValorPorHoraDeTrabalho();
        return salario;
    }

}
