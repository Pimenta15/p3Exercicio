package Atividade11;

/**
 * MainUML
 */
public class MainUML {

    public static void main(String[] args) {
        Diretor d = new Diretor("Augusto", 1, 5000, "Manhã", "Tarde");
        Coordenador c = new Coordenador("Pimenta", 2, 4000, "Manhã");
        Professor p = new Professor("Arthur", 3, 3000, "Manhã", "Programação");
        Secretario s = new Secretario("Eduardo", 4, 2000, "Manhã");

        System.out.println(d);
        System.out.println(c);
        System.out.println(p);
        System.out.println(s);
    }
}