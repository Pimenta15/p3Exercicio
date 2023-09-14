package Atividade9.Questao1;


import java.util.ArrayList;

public class funcionarioApp {
    public static void main(String[] args) {
          ArrayList<Funcionario> lista = new ArrayList<>();

    Funcionario f1 = new Funcionario("joao", 40, 51000);
    lista.add(f1);

    Funcionario f2 = new Funcionario("samuel", 20, 20000);
    lista.add(f2);

    Funcionario f3 = new Funcionario("rennan", 56, 87000);
    lista.add(f3);

    Funcionario f4 = new Funcionario("arthur",22 , 50000);
    lista.add(f4);

    Funcionario f5 = new Funcionario("roberto", 30, 30000);
    lista.add(f5);

    for (Funcionario funcionario : lista) {
        if (funcionario.getIdade() >= 30 && funcionario.getSalarioAnual() > 50000) {
            System.out.println(funcionario.getNome());
        }
    }


    }

    
  
}

