package Atividade14.Questao2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
       
        Scanner in = new Scanner (System.in);
       
        ArrayList<Integer> idades = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            try {
                
                int idade = in.nextInt();
                idades.add(idade);

            } catch (Exception e) {

               System.out.println("Idade invalida: ");
               
            }
        }

        System.out.print("Digite o número da posição a ser removida: ");
         try {
            int posicao = in.nextInt();

            if (posicao < 1 || posicao > idades.size()) {
                System.out.println("Posição inválida");
            } else {
                idades.remove(posicao - 1);

                System.out.println("ArrayList após remoção: " + idades);
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
        }
    }
}
