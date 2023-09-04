package Atividade8.Questao4;

public class BancoDeDados {
    private String[] dados;
    private int tamanho;
    
    public BancoDeDados(int capacidade) {
        this.dados = new  String[capacidade];
        this.tamanho = 0;
    }
    
    public void AdicionarDados(String adicionar){
        if (tamanho < dados.length) {
            this.dados[tamanho] = adicionar;
            tamanho++;
            System.out.println("Dado adicioando com sucesso");
        }else{
            System.out.println("Dado não registrado, Banco de Dados cheio");
        }

    }

    public void excluirRegistro(int indice) {
        if (indice >= 0 && indice < tamanho) {
            for (int i = indice; i < tamanho - 1; i++) {
                dados[i] = dados[i + 1];
            }
            dados[tamanho - 1] = null;
            tamanho--;
            System.out.println("Registro excluído com sucesso.");
        } else {
            System.out.println("Índice inválido.");
        }
    }
    
    public void imprimirRegistros() {
        System.out.println("Registros no banco de dados:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(dados[i]);
        }
    }
}
