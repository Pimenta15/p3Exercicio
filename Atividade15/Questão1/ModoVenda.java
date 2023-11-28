package Atividade15.Questão1;

public interface ModoVenda {
    void efetuarVenda(String produto, String cliente, int quantidade);
    double calcularDesconto();
}
