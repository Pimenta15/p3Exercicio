package Atividade12.Biblioteca;

public  class Livro extends ItemBiblioteca {
    
    private String autor;
    
    public Livro(String titulo, int anoPublicacao, int copias, String autor) {
        super(titulo, anoPublicacao, copias);
       this.autor = autor;
    }

    public double calcularMulta(int diasAtrasado){
        return diasAtrasado*10;
    }
    public void devolver(int diasAtrasado){
        if (diasAtrasado == 0) {
            System.out.println("Uma copia de "+ titulo+ " foi devolvida");
            System.out.println("Sem multa a pagar");
            System.out.println("");
            copias++;
        }else{
            System.out.println("Uma copia de "+ titulo+ " foi devolvida");
            System.out.println("Multa de R$"+ calcularMulta(diasAtrasado) + " A ser paga");
            System.out.println("");
            copias++;
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAutor: " + autor+"\n";
    }
    
    
}
