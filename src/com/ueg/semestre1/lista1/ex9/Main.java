package com.ueg.semestre1.lista1.ex9;

/**
 * Created by root on 5/6/2015.
 */
public class Main {
    public static void main(String[] args){

        Funcionario joao = new Funcionario("Joao Mendes Rosa", 372912333, 433, 23);

        System.out.println("Dados do funcionario:");
        System.out.println("Nome: " + joao.getNome());
        System.out.println("CPF: " + joao.getCpf());
        System.out.println("Horas Trabalhadas: " + joao.getHorasTrabalhadas());
        System.out.println("Valor por hora trabalhada: " + joao.getValorPorHoraDeTrabalho());
        System.out.println("\nSalario Total: R$ " + joao.calculaSalario());

    }
}
