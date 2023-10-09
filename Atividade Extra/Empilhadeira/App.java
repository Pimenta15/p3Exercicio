public class App {
    public static void main(String[] args) throws Exception {
        PilhaDeCaixas pilha = new PilhaDeCaixas(100); 
        Caixa caixa1 = new Caixa(1, "Livros", 5.2, 30.0);
        Caixa caixa2 = new Caixa(2, "Roupas", 3.0, 20.0);
        CaixaFragil caixa3 = new CaixaFragil(3, "Vidros", 4.0, 25.0, 10.0);
        CaixaFragil caixa4 = new CaixaFragil(4, "Eletrônicos", 2.5, 15.0, 5.0);

        System.out.println("Altura atual da pilha: " + pilha.getAlturaPilha() + " cm");
        System.out.println();
        
        pilha.empilhar(caixa1); 
        pilha.empilhar(caixa2); 
        pilha.empilhar(caixa3); 
        pilha.empilhar(caixa4); 

        System.out.println();

        System.out.println("Altura atual da pilha: " + pilha.getAlturaPilha() + " cm");

        System.out.println();

        Caixa caixaDesempilhada1 = pilha.desempilhar(); 
        System.out.println("Desempilhando caixa: " + caixaDesempilhada1.getConteudo());
        Caixa caixaDesempilhada2 = pilha.desempilhar(); 
        System.out.println("Desempilhando caixa: " + caixaDesempilhada2.getConteudo());

        System.out.println("Altura atual da pilha: " + pilha.getAlturaPilha() + " cm");
    }
}
