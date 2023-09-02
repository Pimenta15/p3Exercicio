package PostFacebook;

public class Face {
    public static void main(String[] args) {
        Post filmin = new Post("Bora de filme?","https://www.netflix.com/browse");
        
        filmin.curtir();
        filmin.curtir();
        filmin.curtir();
        System.out.println("Curtidas: "+filmin.getNumeroCurtidas());
        filmin.compatilhar();
        filmin.compatilhar();
        System.out.println("Compartilhamentos: "+filmin.getNumeroCompartilhamentos());
    }
}
