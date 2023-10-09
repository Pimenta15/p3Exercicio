import java.util.Stack;

public class PilhaDeCaixas {
    private double alturaMax;
    private Stack<Caixa> pilha;


    public PilhaDeCaixas(double alturaMaximaPermitida) {
        this.alturaMax = alturaMaximaPermitida;
        this.pilha = new Stack<>();
    }

    public double getAlturaMax() {
        return alturaMax;
    }

    public void setAlturaMax(double alturaMaximaPermitida) {
        this.alturaMax = alturaMaximaPermitida;
    }

    
    public boolean empilhar(Caixa caixa) {
        double alturaAtual = getAlturaPilha() + caixa.getAltura();

        
        if (alturaAtual <= alturaMax) {
           
            if (caixa instanceof CaixaFragil) {
                double pesoMaximoSuportado = ((CaixaFragil) caixa).getpSuportar();
                double pesoAtual = getPesoPilha() + caixa.getPeso();

                if (pesoAtual <= pesoMaximoSuportado) {
                    pilha.push(caixa);
                    System.out.println("Caixa empilhada com sucesso!");
                    return true;
                } else {
                    System.out.println(
                            "Peso máximo suportado pela caixa frágil excedido. Não é possível empilhar esta caixa.");
                    return false;
                }
            } else {
                pilha.push(caixa);
                System.out.println("Caixa empilhada com sucesso!");
                return true;
            }
        } else {
            System.out.println("Altura máxima da pilha excedida. Não é possível empilhar esta caixa.");
            return false;
        }
    }

    
    public Caixa desempilhar() {

        if (!pilha.isEmpty()) {

            return pilha.pop();

        } else {

            System.out.println("A pilha de caixas está vazia. Não é possível desempilhar.");

            return null;
        }
    }

    
    public double getAlturaPilha() {

        double alturaPilha = 0;

        for (Caixa caixa : pilha) {

            alturaPilha += caixa.getAltura();

        }
        return alturaPilha;
    }

    
    public double getPesoPilha() {
        double pesoPilha = 0;

        for (Caixa caixa : pilha) {

            pesoPilha += caixa.getPeso();

        }
        return pesoPilha;
    }

    
}
