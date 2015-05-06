package com.ueg.semestre1.lista1.ex8;

/**
 * Created by root on 5/6/2015.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Bem vindo ao Banco do Chico Bento Vida Loka!");

        ContaPoupanca conta = new ContaPoupanca("Leozim Maneiro", 141628, 9391 );

        System.out.println("Segue abaixo dados do cliente!");
        System.out.println("Cliente: " + conta.getNomeCliente());
        System.out.println("Agencia: " + conta.getAgencia());
        System.out.println("Conta: " + conta.getNumeroDaConta());
        System.out.println("Saldo atual (inicial): " + conta.getSaldo());

        System.out.println("Fazendo um deposito negativo, da treta.");
        conta.fazerDeposito(18);

        System.out.println("Fazer saque maior do que tem em saldo, tambem da treta.");
        conta.fazerSaque(12);

        System.out.println("Fazendo mais depositos..");
        conta.fazerDeposito(912850230.22);

        System.out.println("Caraca, mermao, agora sou playboy! Meu saldo eh de R$ " + conta.getSaldo());

        System.out.println("Depois dessa, vou ate fazer um saque de R$ 32322.22");
        conta.fazerSaque(32322.22);

        System.out.println("Ainda sobra R$ " + conta.getSaldo());

    }
}
