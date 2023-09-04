package Atividade8.Questao1;

public class ContaBancaria {
    
    private String nome;
    private int num;
    private double saldo;
   
    public ContaBancaria(String nome, int num) {
        this.nome = nome;
        this.num = num;
        this.saldo = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
}
