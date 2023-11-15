package Atividade14.Questao5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Triangulo triangulo = new Triangulo();
        Triangulo novoTriangulo = new Triangulo();

        try {
            triangulo = new Triangulo(3, 4, 5);
            triangulo.setLado1(10);

        } catch (DimensoesInvalidasException e) {
            System.out.println("Erro1: " + e.getMessage());
        }

            try {
            System.out.println("Digite l1 para um novo triangulo");
            double novoLado1 = in.nextDouble();
            System.out.println("Digite l2 para um novo triangulo");
            double novoLado2 = in.nextDouble();
            System.out.println("Digite l3 para um novo triangulo");
            double novoLado3 = in.nextDouble();

            
            novoTriangulo = new Triangulo(novoLado1, novoLado2, novoLado3);

    
} catch (DimensoesInvalidasException e) {
            System.out.println("Erro2: " + e.getMessage());
        }
        System.out.println("Triângulo original: Lado1=" + triangulo.getLado1() + " Lado2=" + triangulo.getLado2() + " Lado3=" + triangulo.getLado3());
        System.out.println("Novo triângulo: Lado1=" + novoTriangulo.getLado1() + " Lado2=" + novoTriangulo.getLado2() + " Lado3=" + novoTriangulo.getLado3());
    }
}

