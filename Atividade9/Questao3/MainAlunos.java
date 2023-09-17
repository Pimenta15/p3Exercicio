package Atividade9.Questao3;



public class MainAlunos {
    public static void main(String[] args) {
        Alunos aluno1 = new Alunos("João", 12345, new double[]{8.5, 7.0, 9.5});
        Alunos aluno2 = new Alunos("Maria", 54321, new double[]{6.0, 6.5, 5.5});

        System.out.println("Aluno 1 - Nome: " + aluno1.getNome());
        System.out.println("Matrícula: " + aluno1.getMatricula());
        System.out.println("Média: " + aluno1.calcularMedia());
        System.out.println("Status: " + aluno1.getStatus());
        System.out.println();

        System.out.println("Aluno 2 - Nome: " + aluno2.getNome());
        System.out.println("Matrícula: " + aluno2.getMatricula());
        System.out.println("Média: " + aluno2.calcularMedia());
        System.out.println("Status: " + aluno2.getStatus());
        System.out.println();
    }
}
