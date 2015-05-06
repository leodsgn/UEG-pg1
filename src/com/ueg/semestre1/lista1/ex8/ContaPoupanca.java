package com.ueg.semestre1.lista1.ex8;

/**
 * Created by root on 5/6/2015.
 */
public class ContaPoupanca {
    private String nomeCliente;
    private int numeroDaConta;
    private int agencia;
    private double saldo = 0;

    public ContaPoupanca() {
    }

    public ContaPoupanca(String nomeCliente, int numeroDaConta, int agencia) {
        this.nomeCliente = nomeCliente;
        this.numeroDaConta = numeroDaConta;
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void fazerDeposito(double quantia) throws Exception {
        if (quantia <= 0){
            throw new Exception("Valor invalido ou insuficiente! Tente novamente!");
        }
        else {
            this.saldo += quantia;
        }
    }

    public void fazerSaque(double quantia) throws Exception{
        if (quantia > this.saldo){
            throw new Exception("Saldo Insuficiente! Você possui " + this.saldo + ".");
        }
        else {
            this.saldo -= quantia;
        }
    }
}
