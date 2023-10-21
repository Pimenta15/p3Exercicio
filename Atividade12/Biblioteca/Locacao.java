package Atividade12.Biblioteca;

public class Locacao {
    public static void main(String[] args) {
        Livro HP = new Livro("Harry Potter", 2014, 5, "J.K. Rowling");
        DVD RL = new DVD("Rei Leão", 1994, 2, 88);
        Revista recreio = new Revista("Recreio", 2000, 1,"1" );

        System.out.println(HP);
        HP.alugar();
        HP.alugar();
        HP.alugar();
        System.out.println(HP);
        HP.alugar();
        HP.alugar();
        HP.alugar();
        System.out.println(HP);

        HP.devolver(0);
        HP.devolver(2);
        HP.devolver(5);
        HP.devolver(10);
        System.out.println(HP);

        System.out.println(RL);
        RL.alugar();
        System.out.println(RL);
        RL.alugar();
        RL.alugar();
        RL.devolver(0);
        System.out.println(RL);
        RL.devolver(10);
        System.out.println(RL);

        System.out.println(recreio);
        recreio.alugar();
        recreio.alugar();
        System.out.println(recreio);
        recreio.devolver(10);
        System.out.println( recreio);
        


    }
}
