package Atividade13.Questão1;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Circulo> circulos = new ArrayList<>();
        circulos.add(new Circulo(3.0));
        circulos.add(new Circulo(5.0));
        circulos.add(new Circulo(2.5));
        circulos.add(new Circulo(4.0));
        circulos.add(new Circulo(1.0));

        for (Circulo circulo : circulos) {
            System.out.println("Área do círculo: " + circulo.calcularArea());
        }
    }
}
