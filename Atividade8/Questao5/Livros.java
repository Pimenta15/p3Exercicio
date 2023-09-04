package Atividade8.Questao5;

public class Livros {
   
    private String titulo;
    private String autor;
    private int anoPublicacao;
    
    
    @Override
    public String toString() {
        return "Livros [titulo=" + titulo + ", autor=" + autor + ", anoPublicacao=" + anoPublicacao + "]";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
       
        if(anoPublicacao < 0 || anoPublicacao > 2024){
       
            this.anoPublicacao = anoPublicacao;
        }
        else{
        
            System.out.println("Ano invalido");
        }
    }

    
}
