package StreetFighter;

public class Lutador {
    private String nome;
    private int energia;
    private int forca;
   
    public Lutador(String nome, int energia, int forca) {
        this.nome = nome;
        this.energia = energia;
        this.forca = forca;
    }

    public void ReduzirEnergia(Lutador inimigo){
        inimigo.energia = inimigo.energia - this.forca;
    }
    
    public void AplicarGolpe(Lutador inimigo){
        ReduzirEnergia(inimigo);
        System.out.println(nome + " Aplicou golpe em: "+ inimigo.nome);
        
    }

     public int getEnergia() {
        return energia;
    }
}
