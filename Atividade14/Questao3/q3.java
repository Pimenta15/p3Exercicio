package Atividade14.Questao3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            double numero1 = in.nextDouble();

            System.out.print("Digite o segundo número: ");
            double numero2 = in.nextDouble();

            double resultado = realizarDivisao(numero1, numero2);

            System.out.println("Resultado da divisão: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, digite um número.");
        } catch (ArithmeticException e) {
            System.out.println("Erro de divisão por zero. Não é possível dividir por zero.");
        }
}
    private static double realizarDivisao(double numerador, double denominador) {
        if (denominador == 0) {
            throw new ArithmeticException("Divisão por zero não permitida");
        }
        return numerador / denominador;
    }
}
