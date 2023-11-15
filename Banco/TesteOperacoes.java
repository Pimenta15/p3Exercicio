package Banco;

import java.util.ArrayList;
import java.util.List;

public class TesteOperacoes {
    
        List<Cliente> listaClientes = new ArrayList<>();
        List<Conta> listaContas = new ArrayList<>();
        int contas = 0;
    
        public void criarConta(String nome, String endereco, String profissao,int agencia, String tipoConta){
            Cliente cadastro = new Cliente(nome, endereco, profissao);
            listaClientes.add(cadastro);
            contas++;
            if (tipoConta == "poupança"){
                
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
