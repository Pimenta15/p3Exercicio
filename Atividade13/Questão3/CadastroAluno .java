package Atividade13.Questão3;

import java.util.ArrayList;
import java.util.List;

class CadastroAluno {
    private List<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void imprimirAlunos() {
        for (Aluno aluno : alunos) {
            System.out.println("Matrícula: " + aluno.getMatricula() +
                               ", Nome: " + aluno.getNome() +
                               ", Idade: " + aluno.getIdade() +
                               ", Curso: " + aluno.getCurso());
        }
    }
}