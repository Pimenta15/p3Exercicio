package Atividade11;

/**
 * Diretor
 */
public class Diretor  extends Funcionario {
    
    
    private String segTurno;
    
    public Diretor(String nome, int inscricao, double salario, String turno, String segTurno) {
        super(nome, inscricao, salario, turno);
        this.segTurno = segTurno;
    }

    public void criarDescontos(){}

    public void encomendarFardas(){}
    
    public void garenciarProfessores(){}

    @Override
    public String toString() {
        return  "Diretor [segTurno=" + segTurno + "]"+super.toString() ;
    }
    
}
