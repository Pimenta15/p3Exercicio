package Atividade9.Questao2;

public class MainPedido {
public static void main(String[] args) {
    ItemPedidos cuzcuz = new ItemPedidos("cuzcuz",5000.0);
    ItemPedidos arroz = new ItemPedidos("arozz",400.0);
    ItemPedidos feijao = new ItemPedidos("feijao",10000.0);

    Pedidos fila = new Pedidos();
   
    fila.adicionar(feijao);
    fila.adicionar(arroz);
    fila.adicionar(cuzcuz);

    for (int i = 0; i < fila.getNumero(); i++) {
        if(fila.getItem()[i].getPreco() >= 500){
            System.out.println(fila.getItem()[i]);
        }
    }
}
    
    
} 
