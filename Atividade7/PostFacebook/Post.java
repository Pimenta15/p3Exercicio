package PostFacebook;

public class Post {
    
    private String texto;
    private String link;
    private int numeroCurtidas;
    private int numeroCompartilhamentos;
   
    public Post(String texto, String link) {
        this.texto = texto;
        this.link = link;
        this.numeroCurtidas = 0;
        this.numeroCompartilhamentos = 0;
    }
    public void curtir(){
        this.numeroCurtidas++;
    }
    public void compatilhar(){
        this.numeroCompartilhamentos++;
    }

    public String getTexto() {
        return texto;
    }

    public String getLink() {
        return link;
    }

    public int getNumeroCurtidas() {
        return numeroCurtidas;
    }

    public int getNumeroCompartilhamentos() {
        return numeroCompartilhamentos;
    }
}
