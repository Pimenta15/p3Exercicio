package Prova3;
import java.util.ArrayList;

public  class Aluno extends Usuario {
    private String curso;
    private String matricula;
    private Double[] notas;
    private Boolean[] presenca;
    private boolean status;

    
    public Aluno(String name, int idade, String curso, String matricula,
            boolean status) {
        super(name, idade);
        this.curso = curso;
        this.matricula = matricula;
        this.notas = new Double[2];
        this.presenca = new Boolean[19];
        this.status = status;
    }

    @Override
    public void atividade() {
        System.out.println("Está assistindo aula");
    }

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

    public Double[] getNotas() {
        return notas;
    }

    public void setNotas(Double[] notas) {
        this.notas = notas;
    }

    public Boolean[] getPresenca() {
        return presenca;
    }

    public void setPresenca(Boolean[] presenca) {
        this.presenca = presenca;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
