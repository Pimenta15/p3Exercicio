/**
 * CaixaFragil
 */
public class CaixaFragil extends Caixa{
    private double pSuportar;

    public CaixaFragil(int identificador, String conteudo, double peso, double altura,    double pSuportar) {
        super(identificador, conteudo, peso, altura);
        this.pSuportar =  pSuportar;   
    }

    public String exibirEtiqueta() {
        return "Caixa [\nIdentificador=" + super.getIdentificador() + ", \nconteudo=" + super.getConteudo() + ", \npeso=" + super.getPeso() + ", \naltura="+ super.getAltura() + "\nPeso Maximo suportado sobre= "+ this.pSuportar+"\n]";
    }
    
}