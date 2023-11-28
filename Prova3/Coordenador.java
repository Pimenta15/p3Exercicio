package Prova3;
public class Coordenador  extends Professor{
    private String horarioDeAtendimento;

    public Coordenador(String name, int idade, String curso, String matricula, String horarioDeAtendimento) {
        super(name, idade, curso, matricula);
        this.horarioDeAtendimento = horarioDeAtendimento;
    }
    
    public void solicitacaoAluno(Aluno aluno){
        aluno.setStatus(!aluno.isStatus());
    }

    public void removerTurma(Aluno aluno, Professor professor)throws ExepitionP3{
    for (int i = 0; i < 19; i++) {
        if (professor.getAluno()[i].getName() == aluno.getName() && professor.getAluno()[i].getMatricula() == aluno.getMatricula()){
            professor.getAluno()[i] = null;
        return;}  
        }
        throw new ExepitionP3("Aluno não encontrado");
    }
    
    
    }   

