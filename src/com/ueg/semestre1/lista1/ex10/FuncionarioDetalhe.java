package com.ueg.semestre1.lista1.ex10;

import com.ueg.semestre1.lista1.ex9.Funcionario;

/**
 * Created by root on 5/6/2015.
 */
public class FuncionarioDetalhe extends Funcionario{

    private int numeroDeFilhos;
    private double porcentagemAumentoSalario;
    private double porcentagemInss;


    public FuncionarioDetalhe(String nome, long cpf, int horasTrabalhadas, double valorPorHoraDeTrabalho, int numeroDeFilhos) {
        super(nome, cpf, horasTrabalhadas, valorPorHoraDeTrabalho);
        this.numeroDeFilhos = numeroDeFilhos;
    }

    public int getNumeroDeFilhos() {
        return numeroDeFilhos;
    }

    public void setNumeroDeFilhos(int numeroDeFilhos) {
        this.numeroDeFilhos = numeroDeFilhos;
    }

    public void setPorcentagemAumentoSalario(double porcentagemAumentoSalario) {
        this.porcentagemAumentoSalario = porcentagemAumentoSalario;
    }

    public double getPorcentagemInss() {
        return porcentagemInss;
    }

    public void setPorcentagemInss(double porcentagemInss) {
        this.porcentagemInss = porcentagemInss;
    }

    public double calcularInss(){
        if (super.calculaSalario() <= 2545.0){
            setPorcentagemInss(0.06);
        }
        else{
            setPorcentagemInss(0.1);
        }

        double valorInss = super.calculaSalario()*getPorcentagemInss();
        return valorInss;
    }

    public double calcularImpostoDeRenda(){

        double aliquotaImposto = 0.07;

        double valorDesconto = getNumeroDeFilhos() * 1250.25;
        double valorImposto = ((super.calculaSalario() * 12) * aliquotaImposto) - valorDesconto;

        return valorImposto;
    }
}
