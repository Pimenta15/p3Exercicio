package StreetFighter;

public class Luta {
    public static void main(String[] args) {
        Lutador Ryu = new Lutador("Ryu", 100, 10);
        Lutador Bison =  new Lutador("Bison", 100, 12);

        Ryu.AplicarGolpe(Bison);
        Ryu.AplicarGolpe(Bison);
        Ryu.AplicarGolpe(Bison);
        
        System.out.println("Energia Bison: "+ Bison.getEnergia());

        Bison.AplicarGolpe(Ryu);
        Bison.AplicarGolpe(Ryu);
        Bison.AplicarGolpe(Ryu);
        Bison.AplicarGolpe(Ryu);
        Bison.AplicarGolpe(Ryu);
        Bison.AplicarGolpe(Ryu);
        Bison.AplicarGolpe(Ryu);
        Bison.AplicarGolpe(Ryu);

        System.out.println("Energia Ryu: "+ Ryu.getEnergia());
    }
}
