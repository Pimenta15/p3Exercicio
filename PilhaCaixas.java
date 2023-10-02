import java.util.ArrayList;

public class PilhaCaixas {
    private double alturaMax;
    private double alturaAtual;
    private ArrayList<Caixa> pilha ;
    
    public PilhaCaixas(double alturaMax) {
        this.pilha = new ArrayList<Caixa>();
        this.alturaAtual = 0;
        this.alturaMax = alturaMax;
    }

    public void empilhar(Caixa empilhar){
        this.alturaAtual += empilhar.getAltura();
        if (this.alturaAtual > alturaMax) {
            System.out.println("Não foi possivel empilhar");
        }
    }
    
}
