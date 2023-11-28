package Prova3;

import java.util.ArrayList;

public abstract class Usuario {
    protected String name;
    protected int idade;

    public Usuario(String name, int idade) {
        this.name = name;
        this.idade = idade;
    }

    public abstract void atividade();
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
