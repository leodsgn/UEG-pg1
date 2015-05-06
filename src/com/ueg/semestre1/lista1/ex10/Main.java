package com.ueg.semestre1.lista1.ex10;

/**
 * Created by root on 5/6/2015.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Abaixo detalhes do Funcionário");

        FuncionarioDetalhe funcionario = new FuncionarioDetalhe("Tomas Ruivim", 3232323, 160, 56, 2);

        System.out.println("Dados do funcionario:");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("CPF: " + funcionario.getCpf());
        System.out.println("Horas Trabalhadas: " + funcionario.getHorasTrabalhadas());
        System.out.println("Valor por hora trabalhada: R$ " + funcionario.getValorPorHoraDeTrabalho());
        System.out.println("\nSalario Total: R$ " + funcionario.calculaSalario());

        System.out.println("Quantidade de filhos: " + funcionario.getNumeroDeFilhos());

        System.out.println("Valor INSS: R$ " + funcionario.calcularInss());
        System.out.println("Valor Imposto de Renda Anual: R$ " + funcionario.calcularImpostoDeRenda());
    }
}
