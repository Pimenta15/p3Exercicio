package Atividade9.Questao1;

/**
 * ContaBancaria
 */
public class Funcionario {
    private String nome;
    private int idade;
    private double salarioAnual;
  
  
  
    public Funcionario(String nome, int idade, double salarioAnual) {
        this.nome = nome;
        this.idade = idade;
        this.salarioAnual = salarioAnual;
    }



    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", idade=" + idade + ", salarioAnual=" + salarioAnual + "]";
    }



    public String getNome() {
        return nome;
    }



    public int getIdade() {
        return idade;
    }



    public double getSalarioAnual() {
        return salarioAnual;
    }


}