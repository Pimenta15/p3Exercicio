package Banco;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteOperacoes {
    public static void main(String[] args) throws Exception {
        apresentarMenu();
    }

        
        static Scanner Scanner = new Scanner(System.in);
        static List<Cliente> listaClientes = new ArrayList<Cliente>();
        static List<Conta> listaContas = new ArrayList<Conta>();
       
    
        public static  void criarConta(String nome, String endereco, String profissao,int conta,int agencia, String tipoConta){
            Conta c = new Conta(agencia, conta, null);
            if(listaContas.contains(c)){
           Cliente cadastro = new Cliente(nome, endereco, profissao);
            listaClientes.add(cadastro);
            tipoConta.toLowerCase();
            if (tipoConta.compareTo("poupança")==0){
                
                ContaPoupanca novConta = new ContaPoupanca(agencia, conta, cadastro);
                listaContas.add(novConta);
            }else if(tipoConta.compareTo("corrente")==0){
                ContaCorrente novConta = new ContaCorrente(agencia, conta, cadastro);
                listaContas.add(novConta);
            }
        }else{
            System.out.println("Essa conta ja existe");
        }

    }

    public static void realizarOperacoes(int agencia, int conta,int agencia2, int conta2) throws Exception{
            int i,j;
            boolean dest=false,rem=false;
            Conta c, c2;
            for(i=0;i<listaContas.size();i++){
                if(listaContas.get(i).getConta()==conta &&listaContas.get(i).getAgencia()==agencia){
                    c = listaContas.get(i);
                    rem =true;
                for(j=0;j<listaContas.size();j++){
                if(listaContas.get(j).getConta()==conta2 &&listaContas.get(j).getAgencia()==agencia2){
                    c2 = listaContas.get(j);
                    System.out.println("Digite o valor a ser transferido");
                        double valor = Scanner.nextDouble();
                        c.transferencia(c2, valor);
                        dest  = true;
                }
                  
                }
            
    }
}
if(rem == false){
    System.out.println("Remetente não encontrada");
}
else if(dest==false){
    System.out.println("Destinatario não encontrado");
}

}
    public static void exibirSaldo(int agencia,int conta){
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
         public static  void apresentarMenu() throws Exception {
        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Criar conta");
            System.out.println("2. Realizar operações");
            System.out.println("3. Exibir saldo");
            System.out.println("4. Depositar");
            System.out.println("5. Sacar");
            System.out.println("6. Sair");

            int escolha = Scanner.nextInt();
            Scanner.nextLine(); 
            String nome, endereco, profissao, tipoConta;
            int conta, agencia, conta2, agencia2,f=-9;
            
            switch (escolha) {
                case 1:
                    System.out.println("Digite seu nome");
                    nome = Scanner.nextLine().toLowerCase();
                     System.out.println("Digite seu endereço");
                    endereco = Scanner.nextLine().toLowerCase();
                    System.out.println("Digite sua profissao");
                    profissao = Scanner.nextLine().toLowerCase();
                    System.out.println("Digite o número da conta");
                    conta = Scanner.nextInt();
                    System.out.println("Digite o número da agencia");
                    agencia = Scanner.nextInt();
                    Scanner.nextLine();
                    do{
                    System.out.println("Digite o tipo da conta");
                    System.out.println("1-Poupança");
                    System.out.println("2-Corrente");
                     f =Scanner.nextInt();
                }while(f!=1&&f!=2);
                if(f==1){
                    tipoConta = "poupança";
                }
                else{
                    tipoConta = "corrente";
                }
                    criarConta(nome,endereco,profissao,conta,agencia,tipoConta); 
                    break;
                case 2:
                    System.out.println("Digite o número da sua conta");
                    conta = Scanner.nextInt();
                    System.out.println("Digite o número da sua agencia");
                    agencia = Scanner.nextInt();
                     System.out.println("Digite o número da conta destinataria");
                    conta2 = Scanner.nextInt();
                    System.out.println("Digite o número da agencia destinataria");
                    agencia2 = Scanner.nextInt();
                    realizarOperacoes(agencia,conta, agencia2, conta2);
                    break;
                case 3:
                    System.out.println("Digite o número da conta");
                    conta = Scanner.nextInt();
                    System.out.println("Digite o número da agencia");
                    agencia = Scanner.nextInt();
                    exibirSaldo(agencia, conta);
                    break;
                case 4:
                    System.out.println("Digite o número da conta");
                    conta = Scanner.nextInt();
                    System.out.println("Digite o número da Agencia");
                    agencia = Scanner.nextInt();
                    System.out.println("Digite o Valor a ser depositado");
                    double val = Scanner.nextDouble();
                    depositar(conta, agencia, val);

                break;
                case 5:
                System.out.println("Digite o número da conta");
                    conta = Scanner.nextInt();
                    System.out.println("Digite o número da Agencia");
                    agencia = Scanner.nextInt();
                    System.out.println("Digite o Valor a ser sacado");
                    double valo = Scanner.nextDouble();
                    sacar(conta, agencia, valo);
                break;
                case 6:
                    System.out.println("Saindo do programa. Até mais!");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
    
    public static void sacar(int conta, int a, double v) throws Exception{
         int i;
        Conta c;
        for(i=0;i<listaContas.size();i++){
            if(listaContas.get(i).getConta()==conta &&listaContas.get(i).getAgencia()==a){
                c = listaContas.get(i);
                c.saque(v) ;
                return;
            }
        }

    }

    public static void depositar(int conta, int a, double v) throws Exception{
         int i;
        Conta c;
        for(i=0;i<listaContas.size();i++){
            if(listaContas.get(i).getConta()==conta &&listaContas.get(i).getAgencia()==a){
                c = listaContas.get(i);
                c.deposito(v) ;
                return;
            }
        }

    }
}
    
    
    