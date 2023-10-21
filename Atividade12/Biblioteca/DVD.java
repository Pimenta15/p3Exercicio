package Atividade12.Biblioteca;

public  class DVD extends ItemBiblioteca{
    private double minutos;

    public double getMinutos() {
        return minutos;
    }

    public void setMinutos(double minutos) {
        this.minutos = minutos;
    }

    public DVD(String titulo, int anoPublicacao, int copias, double minutos) {
        super(titulo, anoPublicacao, copias);
        this.minutos = minutos;
    }
    
    public double calcularMulta(int diasAtrasado){
        return diasAtrasado*8;
    }

    public String toString() {
        return super.toString() + "\nDuração em minutos: " + minutos+"\n";
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

