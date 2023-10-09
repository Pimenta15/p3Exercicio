public class Caixa {
    private int Identificador;
    private String conteudo;
    private double peso;
    private double altura;
    public String getIdentificador;
    
    public Caixa(int identificador, String conteudo, double peso, double altura) {
        Identificador = identificador;
        this.conteudo = conteudo;
        this.peso = peso;
        this.altura = altura;
    }

    public int getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(int identificador) {
        Identificador = identificador;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String exibirEtiqueta() {
        return "Caixa [Identificador=" + Identificador + ", conteudo=" + conteudo + ", peso=" + peso + ", altura="+ altura + "]";
    }
}
