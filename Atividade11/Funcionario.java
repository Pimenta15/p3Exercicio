package Atividade11;

public class Funcionario {
    
    private String nome;
    private int inscricao;
    private double salario;
    private String turno;

    public Funcionario(String nome, int inscricao, double salario, String turno) {
        this.nome = nome;
        this.inscricao = inscricao;
        this.salario = salario;
        this.turno = turno;
    }

    public void horariosDisponiveis(){}

    public void horarioTrabalho(){}
    
    public void informacoesFuncionario(){}
    
    public void funcaoDesempenhar(){}

    @Override
    
    public String toString() {
        return "Funcionario [nome=" + nome + ", inscricao=" + inscricao + ", salario=" + salario + ", turno=" + turno
                + "]";
    }
}
