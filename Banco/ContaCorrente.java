package Banco;

public class ContaCorrente extends Conta  {
    
    private double taxaManutencao;
    
    public ContaCorrente(int agencia, int conta, Cliente cliente) {
        super(agencia, conta, cliente);
        this.taxaManutencao = 50;
    }

    public double simularOperacao(int quantidadeMeses) {
        if (quantidadeMeses <= 0) {
            System.out.println("A quantidade de meses deve ser maior que zero.");//error message
            return this.saldo;
        }

        for (int i = 1; i <= quantidadeMeses; i++) {
            this.saldo -= taxaManutencao;
        }

        return this.saldo;
    }


}
