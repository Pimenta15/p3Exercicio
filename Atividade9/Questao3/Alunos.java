package Atividade9.Questao3;

public class Alunos {
    private String nome;
    private int matricula;
    private double[] notas;

    public Alunos(String nome, int matricula, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public String getStatus() {
        double media = calcularMedia();
        if (media >= 7) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public double[] getNotas() {
        return notas;
    }
}