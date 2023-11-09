package Atividade13.Questão5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import Atividade13.Questão3.Aluno;

public class TesteMapaAluno {
    public static void main(String[] args) {
        Map<Integer, Aluno> mapaAlunos = new HashMap<>();
        Aluno aluno1 = new Aluno(1, "Alice", 20, "Engenharia");
        Aluno aluno2 = new Aluno(2, "Bob", 21, "Medicina");
        Aluno aluno3 = new Aluno(3, "Charlie", 19, "Direito");
        Aluno aluno4 = new Aluno(4, "David", 22, "Informática");
        Aluno aluno5 = new Aluno(5, "Eve", 23, "Arquitetura");

        mapaAlunos.put(aluno1.getMatricula(), aluno1);
        mapaAlunos.put(aluno2.getMatricula(), aluno2);
        mapaAlunos.put(aluno3.getMatricula(), aluno3);
        mapaAlunos.put(aluno4.getMatricula(), aluno4);
        mapaAlunos.put(aluno5.getMatricula(), aluno5);

        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Digite a matrícula do aluno: ");
            int matricula = in.nextInt();

            if (mapaAlunos.containsKey(matricula)) {
                Aluno aluno = mapaAlunos.get(matricula);
                System.out.println("Dados do aluno:");
                System.out.println("Matrícula: " + aluno.getMatricula());
                System.out.println("Nome: " + aluno.getNome());
                System.out.println("Idade: " + aluno.getIdade());
                System.out.println("Curso: " + aluno.getCurso());
            } else {
                System.out.println("Aluno não encontrado!");
            }
        }
    }
}

