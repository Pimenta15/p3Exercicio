package Atividade13.Questão2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TesteHashSetCPF {
    public static void main(String[] args) {
        Set<String> cpfSet = new HashSet<>();
        try (Scanner in = new Scanner(System.in)) {
            for (int i = 0; i < 10; i++) {
                System.out.print("Digite um CPF: ");
                String cpf = in.next();
                cpfSet.add(cpf);
            }
        }

        System.out.println("CPFs no conjunto:");

        for (String cpf : cpfSet) {
            System.out.println(cpf);
        }
    }
}
