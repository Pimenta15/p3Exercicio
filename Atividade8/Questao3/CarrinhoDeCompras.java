package Atividade8.Questao3;

public class CarrinhoDeCompras {
    
    private int qtdItens;
    private double preço;

    public void adicionar(Item itens , int qtdItens){
        this.qtdItens += qtdItens;
        this.preço += qtdItens*itens.getPreco();
    }

     public void retirar (Item itens , int qtdItens){
        this.qtdItens -= qtdItens;
        this.preço -= qtdItens*itens.getPreco();
    }

    public int getQtdItens() {
        return qtdItens;
    }

    public double getPreço() {
        return preço;
    }

}
