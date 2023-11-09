package Atividade13.Questão3;

 /**
  * App
  */
 public class App {
 public static void main(String[] args) {
        CadastroAluno cadastro = new CadastroAluno();
        cadastro.adicionarAluno(new Aluno(1, "Alice", 20, "Engenharia"));
        cadastro.adicionarAluno(new Aluno(2, "Bob", 21, "Medicina"));
        cadastro.adicionarAluno(new Aluno(3, "Charlie", 19, "Direito"));
        cadastro.adicionarAluno(new Aluno(4, "David", 22, "Informática"));
        cadastro.adicionarAluno(new Aluno(5, "Eve", 23, "Arquitetura"));

        System.out.println("Lista de Alunos:");
        cadastro.imprimirAlunos();
    }
}
