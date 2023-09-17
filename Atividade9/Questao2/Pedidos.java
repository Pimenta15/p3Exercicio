package Atividade9.Questao2;



/**
 * Pedidos
 */
public class Pedidos {

    private int numero;
    private ItemPedidos[] item;
    private double total;
    
    public Pedidos() {
        this.numero = 0 ;
        this.item = new ItemPedidos[10] ;
        this.total = 0.0;
    }  

    public void adicionar(ItemPedidos adicionar){
        item[numero] = adicionar;
        numero++;
        total+= adicionar.getPreco();
    }

    public int getNumero() {
        return numero;
    }

    public ItemPedidos[] getItem() {
        return item;
    }

    public double getTotal() {
        return total;
    }
    
}