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
         public void apresentarMenu() {
        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Criar conta");
            System.out.println("2. Realizar operações");
            System.out.println("3. Exibir saldo");
            System.out.println("4. Sair");

            int escolha = in.nextInt();
            in.nextLine(); 
            String nome, endereco, profissao, tipoConta;
            int conta, agencia;
            switch (escolha) {
                case 1:
                    System.out.println("Digite seu nome");
                    nome = in.nextLine();
                     System.out.println("Digite seu endereço");
                    endereco = in.nextLine();
                    System.out.println("Digite sua profissao");
                    profissao = in.nextLine();
                    System.out.println("Digite o número da conta");
                    conta = in.nextInt();
                    System.out.println("Digite o número da agencia");
                    agencia = in.nextInt();
                    System.out.println("Digite o tipo da conta");
                    tipoConta =in.nextLine();
                    criarConta(nome,endereco,profissao,conta,agencia,tipoConta); 
                    break;
                case 2:
                    System.out.println("Digite o número da conta");
                    conta = in.nextInt();
                    System.out.println("Digite o número da agencia");
                    agencia = in.nextInt();
                    realizarOperacoes(agencia,conta);
                    break;
                case 3:
                    System.out.println("Digite o número da conta");
                    conta = in.nextInt();
                    System.out.println("Digite o número da agencia");
                    agencia = in.nextInt();
                    exibirSaldo(agencia, conta);
                    break;
                case 4:
                    System.out.println("Saindo do programa. Até mais!");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
    
}
