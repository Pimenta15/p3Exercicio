package Atividade15.Questão3;

import Atividade15.Questao2.NotificacaoEmail;
import Atividade15.Questao2.VendaLojaFisica;
import Atividade15.Questão1.ModoVenda;
import Atividade15.Questão1.NotificacaoVenda;

public class RegistroVenda1 {
    private ModoVenda modoVenda;
    private NotificacaoVenda notificacaoVenda;

    public RegistroVenda1() {
        this.modoVenda = new VendaLojaFisica(); // Dependência direta de uma implementação concreta
        this.notificacaoVenda = new NotificacaoEmail(); // Dependência direta de uma implementação concreta
    }

    public void realizarVenda(String produto, String cliente, int quantidade) {
        modoVenda.efetuarVenda(produto, cliente, quantidade);
        double desconto = modoVenda.calcularDesconto();
        // Lógica para aplicar desconto, se necessário
        notificacaoVenda.enviarConfirmacao(produto, cliente, quantidade);
        notificacaoVenda.enviarRecibo();
    }
}
