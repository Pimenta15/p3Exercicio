package Banco;

public class main {
    public static void main(String[] args) throws Exception {
        Cliente client = new Cliente("teste", "teste2", "teste3");
        Cliente client2 = new Cliente("teste3", "teste4", "teste5");
        Conta c = new Conta(1,2,client);
         Conta c2 = new Conta(12,21,client2);

        c.deposito(100);
        c.transferencia(c2,12);
        c.exibirSaldo();
        c2.exibirSaldo();
    }
}
