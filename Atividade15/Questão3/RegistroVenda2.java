package Atividade15.Questão3;


import Atividade15.Questão1.ModoVenda;
import Atividade15.Questão1.NotificacaoVenda;

public class RegistroVenda2 {
    private ModoVenda modoVenda;
    private NotificacaoVenda notificacaoVenda;

    public  RegistroVenda2(ModoVenda modoVenda, NotificacaoVenda notificacaoVenda) {
        this.modoVenda = modoVenda;
        this.notificacaoVenda = notificacaoVenda;
    }

    public void realizarVenda(String produto, String cliente, int quantidade) {
        modoVenda.efetuarVenda(produto, cliente, quantidade);
        double desconto = modoVenda.calcularDesconto();
        // Lógica para aplicar desconto, se necessário
        notificacaoVenda.enviarConfirmacao(produto, cliente, quantidade);
        notificacaoVenda.enviarRecibo();
    }
}

