package Banco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteOperacoes {
        
        static Scanner Scanner = new Scanner(System.in);
        List<Cliente> listaClientes = new ArrayList<Cliente>();
        List<Conta> listaContas = new ArrayList<Conta>();
        int contas = 0;
    
        public void criarConta(String nome, String endereco, String profissao,int conta,int agencia, String tipoConta){
            Conta c = new Conta(agencia, conta, null);
            if(!listaContas.contains(c)){
           Cliente cadastro = new Cliente(nome, endereco, profissao);
            listaClientes.add(cadastro);
            tipoConta.toLowerCase();
            if (tipoConta.compareTo("poupança")==0){
                
                ContaPoupanca novConta = new ContaPoupanca(agencia, contas, cadastro);
                listaContas.add(novConta);
            }else if(tipoConta.compareTo("corrente")==0){
                ContaCorrente novConta = new ContaCorrente(agencia, contas, cadastro);
                listaContas.add(novConta);
            }
        }else{
            System.out.println("Essa conta ja existe");
        }

    }

    public void realizarOperações(int agencia, int conta){

    }
    public void exibirSaldo(int agencia,int conta){
        int i;
        Conta c;
        for(i=0;i<listaContas.size();i++){
            if(listaContas.get(i).getConta()==conta &&listaContas.get(i).getAgencia()==agencia){
                c = listaContas.get(i);
                System.out.println("Coloque a quantidade do mêses que quer simular: ");
                int mes = Scanner.nextInt();Scanner.nextLine();
                if(c instanceof ContaCorrente){
                    ContaCorrente c2 = (ContaCorrente) c;
                    c2.simularOperacao(mes);
                    c2.exibirSaldo();
                }else{
                    ContaPoupanca c3 = (ContaPoupanca) c;
                    c3.simularOperacao(mes);
                    c3.exibirSaldo();
                }
                return;
            }
        }

    }
    
}
