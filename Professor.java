
import java.util.ArrayList;
import java.util.Random;

public class Professor extends Usuario{
    private String curso;
    private String matricula;
    private Aluno[] aluno;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Aluno[] getAluno() {
        return aluno;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }

    public Professor(String name, int idade, String curso, String matricula) {
        super(name, idade);
        this.curso = curso;
        this.matricula = matricula;
        this.aluno = new Aluno[9];
    }

    @Override
    public void atividade() {
        System.out.println("Está dando aula para:");
        for ( int i = 0; i < aluno.length; i++) {
            System.out.println(aluno[i].getName());
        }
    }

    public double[] media() throws ExepitionP3{
        double[] media = new double[aluno.length]; 

        for (int i = 0; i < aluno.length; i++) {
            if(IOperacoes.media(aluno[i]) == -1){
                throw new ExepitionP3("Turma não finalizada");
            }
            media[i] = IOperacoes.media(aluno[i]);
        }
        return media;
    }

    public void presenca(){

        for (int i = 0; i < aluno.length; i++) {
            Boolean[] presenca = new Boolean[19];
          for (int j = 0; j < 20; j++) {
              Random random = new Random();
              double numero = random.nextDouble();
              if (numero >= 0.8) {
                presenca[j] = false;
            }else{
                presenca[j] = true;
            }
            
        }  
        aluno[i].setPresenca(presenca);
        }
    }
}
