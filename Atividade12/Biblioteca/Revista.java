package Atividade12.Biblioteca;

public  class Revista extends ItemBiblioteca {

    private String edicao;
    
    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public Revista(String titulo, int anoPublicacao, int copias, String edicao) {
        super(titulo, anoPublicacao, copias);
        this.edicao = edicao;
    }

    public double calcularMulta(int diasAtrasado){
        return diasAtrasado*5;
    }

    public String toString() {
        return super.toString() + "\nEdição: " + edicao+"\n";
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
}