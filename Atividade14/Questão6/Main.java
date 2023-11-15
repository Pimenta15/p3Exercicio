package Atividade14.Questão6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        
        System.out.print("Digite o número da conta: ");
        String numeroConta = in.nextLine();

        System.out.print("Digite o saldo inicial da conta: ");
        double saldoInicial = in.nextDouble();

        ContaCorrente conta = new ContaCorrente(numeroConta, saldoInicial);

        for (int i = 1; i <= 10; i++) {
            try {
                System.out.print("Digite o valor do saque " + i + ": ");
                double valorSaque = in.nextDouble();
                conta.sacar(valorSaque);
                
            } catch (SaldoInsuficienteException e) {
                System.out.println("Erro: " + e.getMessage());
                
                if (e.getMessage().equals("Conta Vazia! não é mais possivel sacar ")){
                    break;
                }
            }
        }

        
    }
}

