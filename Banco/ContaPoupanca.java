package Banco;

public class ContaPoupanca extends Conta {
    
    private double taxaRendimento ;
    
    public ContaPoupanca(int agencia, int conta, Cliente cliente) {
        super(agencia, conta, cliente);
        this.taxaRendimento = 0.05;
    }
    public double getTaxaRendimento() {
        return taxaRendimento;
    } 

    public double simularOperacao(int meses){
       if (meses <= 0) {
        throw new IllegalArgumentException("Quabtidade de meses não pode ser zero ou menor");
       }
        for (int i = 1; i != meses; i++) {
            this.saldo += this.saldo+(taxaRendimento*this.saldo);
        }

        return this.saldo;
    }
}
