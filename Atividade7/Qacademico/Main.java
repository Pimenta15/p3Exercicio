package Qacademico;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Pimenta", "123.456.789-00");
        a1.setNota1(10);
        a1.setNota2(9);
        a1.setNota3(8);
        a1.setNota4(7);

        double media =  a1.calcularMedia();
        System.out.println("Media: "+ media);

        a1.setNota2(6);
        media = a1.calcularMedia();

        System.out.println("Nova Media: "+ media);

    }
}
