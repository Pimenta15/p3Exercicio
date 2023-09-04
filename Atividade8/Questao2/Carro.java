package Atividade8.Questao2;

public class Carro {
    private String marca;
    private String modelo;
    private int aFab;
    private double vAtual;

    public Carro(String marca, String modelo, int aFab) {
        this.marca = marca;
        this.modelo = modelo;
        this.aFab = aFab;
        this.vAtual = 0;
    }

    private boolean isNegative(){
        if(vAtual <= 0){
            return true;
        }
        return false;
    }

    public void acelerar(){
        this.vAtual += 5;
    }

    public void desacelerar(){
        if(!isNegative()){
            this.vAtual -= 5;
        }
        else{System.out.println("O carro esta parado");}
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getaFab() {
        return aFab;
    }

    public void setaFab(int aFab) {
        this.aFab = aFab;
    }

    public double getvAtual() {
        return vAtual;
    }

    public void setvAtual(double vAtual) {
        this.vAtual = vAtual;
    }

    @Override
    public String toString() {
        return "Carro [marca=" + marca + ", modelo=" + modelo + ", ano de fabricação=" + aFab + ", velocidade Atual=" + vAtual + "Km/h]";
    }
}
