package Atividade12.Biblioteca;

public  class ItemBiblioteca {
    protected String titulo;
    protected int anoPublicacao;
    protected int copias;
    
    public ItemBiblioteca(String titulo, int anoPublicacao, int copias) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.copias = copias;
    }

    public void alugar(){
        if (copias > 0 ) {
            System.out.println("Uma copia de "+ titulo+ " foi alugada");
            System.out.println("");
            copias--;
        }else{
            System.out.println("Não foi possivel alugar "+ titulo + " por falta de copias disponiveis");
            System.out.println("");
        }
    }
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    @Override
    public String toString() {
        return "Titulo: " + this.titulo+ "\nAno de Publicação: "+ anoPublicacao + "\nNumeros de Copias dispiniveis: " + copias;
    }
    
    
}
