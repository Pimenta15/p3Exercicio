package Atividade14.Questão6;

public class ContaCorrente {
    
    private String numeroConta;
    private double saldo;

    
    public ContaCorrente(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    
    public void sacar(double valor) throws SaldoInsuficienteException {
        if(this.saldo == 0){
             throw new SaldoInsuficienteException("Conta Vazia! não é mais possivel sacar ");
            }
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar o saque.");
        }
        saldo -= valor;
        System.out.println("Saque de " + valor + " realizado com sucesso. Novo saldo: " + saldo);
    }


    public String getNumeroConta() {
        return numeroConta;
    }


    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }


    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
