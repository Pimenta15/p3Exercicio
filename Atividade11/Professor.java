package Atividade11;

public class Professor extends Funcionario {
    

    private String diciplina;

    public Professor(String nome, int inscricao, double salario, String turno, String diciplina) {
        super(nome, inscricao, salario, turno);
        this.diciplina = diciplina;
    }

    public void lecionar(){}

    public void criarAtividades(){}

    @Override
    public String toString() {
        return "Professor [diciplina=" + diciplina + "]" + super.toString();
    }

    
}
