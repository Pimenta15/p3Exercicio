package Banco;

import java.util.ArrayList;
import java.util.List;

public class TesteOperacoes {
    
        List<Cliente> listaClientes = new ArrayList<>();
        List<Conta> listaContas = new ArrayList<>();
        int contas = 0;
    
        public void criarConta(String nome, String endereco, String profissao,int conta,int agencia, String tipoConta){
            Cliente cadastro = new Cliente(nome, endereco, profissao);
            listaClientes.add(cadastro);
            
            if (tipoConta.compareTo("poupança")==0){
                
                ContaPoupanca novConta = new ContaPoupanca(agencia, contas, cadastro);
                listaContas.add(novConta);
            }else{
                ContaCorrente novConta = new ContaCorrente(agencia, contas, cadastro);
                listaContas.add(novConta);
            }

    }

    public void realizarOperações(int agencia, int conta){

    }
    
}
