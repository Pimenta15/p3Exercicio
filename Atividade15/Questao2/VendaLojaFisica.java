package Atividade15.Questao2;

import Atividade15.Questão1.ModoVenda;

// Classe abstrata para ModoVenda
public class VendaLojaFisica implements ModoVenda {
    @Override
    public void efetuarVenda(String produto, String cliente, int quantidade) {
        // Implementação específica para vendas em lojas físicas
        System.out.println("Venda na loja física - Produto: " + produto + ", Cliente: " + cliente + ", Quantidade: " + quantidade);
    }

    @Override
    public double calcularDesconto() {
        // Implementação específica para calcular desconto em vendas em lojas físicas
        return 0.1; // Exemplo de desconto de 10%
    }
}

