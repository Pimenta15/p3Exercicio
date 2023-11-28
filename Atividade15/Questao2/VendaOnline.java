package Atividade15.Questao2;

import Atividade15.Questão1.ModoVenda;

public class VendaOnline implements ModoVenda {
    @Override
    public void efetuarVenda(String produto, String cliente, int quantidade) {
       
        System.out.println("Venda online - Produto: " + produto + ", Cliente: " + cliente + ", Quantidade: " + quantidade);
    }

    @Override
    public double calcularDesconto() {
       
        return 0.05; 
    }
}
