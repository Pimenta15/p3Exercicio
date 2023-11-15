package Atividade14.Questao4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class q4 {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] vetor = new int[10];
        int valor = -1;
        int i = 0;
        try {
            
            while (valor != 0)  {
                System.out.print("Digite um valor inteiro (ou 0 para encerrar): ");
                valor = in.nextInt();
                vetor[i] = valor;
                i++;
            }
            System.out.println("Valores digitados:");
            for ( i = 0; i < vetor.length; i++) {
                System.out.println("Elemento " + (i + 1) + ": " + vetor[i]);
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, digite um valor inteiro.");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Limite do vetor ultrapassado!");
        }
    }
}