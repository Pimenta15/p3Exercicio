package Atividade15.Questão4;


import Atividade15.Questão1.ModoVenda;
import Atividade15.Questão1.NotificacaoVenda;

public class RegistroVenda {
    private ModoVenda modoVenda;
    private NotificacaoVenda notificacaoVenda;

    public RegistroVenda(ModoVenda modoVenda, NotificacaoVenda notificacaoVenda) {
        this.modoVenda = modoVenda;
        this.notificacaoVenda = notificacaoVenda;
    }


    public void registrarVenda(String produto, String cliente, int quantidade) {
        efetuarVenda(produto, cliente, quantidade);
        enviarConfirmacao(produto, cliente, quantidade);
    }

  
    private void efetuarVenda(String produto, String cliente, int quantidade) {
        modoVenda.efetuarVenda(produto, cliente, quantidade);
        double desconto = modoVenda.calcularDesconto();
 
    }


    private void enviarConfirmacao(String produto, String cliente, int quantidade) {
        notificacaoVenda.enviarConfirmacao(produto, cliente, quantidade);
        notificacaoVenda.enviarRecibo();
    }
}

