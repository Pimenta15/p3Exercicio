package Atividade15.Questão5;

import Atividade15.Questao2.NotificacaoEmail;
import Atividade15.Questao2.VendaLojaFisica;
import Atividade15.Questão1.ModoVenda;
import Atividade15.Questão1.NotificacaoVenda;
import Atividade15.Questão4.RegistroVenda;

public class SistemaInicializacao {

    public static void main(String[] args) {
        
        ModoVenda modoVenda = new VendaLojaFisica();
        NotificacaoVenda notificacaoVenda = new NotificacaoEmail();

  
        RegistroVenda registroVenda = new RegistroVenda(modoVenda, notificacaoVenda);

       
        registroVenda.registrarVenda("Produto1", "Cliente1", 3);

    }
}
