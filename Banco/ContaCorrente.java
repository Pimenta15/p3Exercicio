package Banco;

public class ContaCorrente extends Conta  {
    
    private double taxaManutencao;
    
    public ContaCorrente(int agencia, int conta, Cliente cliente) {
        super(agencia, conta, cliente);
        this.taxaManutencao = 50;
    }

    public double simularOperacao(int quantidadeMeses) {
        if (quantidadeMeses <= 0) {
            throw new IllegalArgumentException("Quabtidade de meses não pode ser zero ou menor");
        }

        for (int i = 1; i <= quantidadeMeses; i++) {
            this.saldo -= taxaManutencao;
        }

        return this.saldo;
    }


}
