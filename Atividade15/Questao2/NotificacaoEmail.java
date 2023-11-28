package Atividade15.Questao2;

import Atividade15.Questão1.NotificacaoVenda;

public class NotificacaoEmail implements NotificacaoVenda {
    @Override
    public void enviarConfirmacao(String produto, String cliente, int quantidade) {
        
        System.out.println("E-mail de confirmação enviado para o cliente " + cliente + " - Produto: " + produto + ", Quantidade: " + quantidade);
    }

    @Override
    public void enviarRecibo() {
       
        System.out.println("Recibo enviado por e-mail");
    }
}
