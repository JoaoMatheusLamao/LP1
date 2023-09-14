package entities;

public class Celular {

    private boolean status;
    private String marca;
    private  int bateria;

    public Celular(String marca, int bateria) {
        this.status = false;
        this.marca = marca;
        this.bateria = bateria;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public void ligar(){
        System.out.println("Iniciando... O aparelho está ligado.");
        System.out.println(getBateria() + "%");
        setStatus(true);
    }

    public void desligar(){
        System.out.println(getBateria() + "%");
        System.out.println("Desligando...");
        setStatus(false);
    }

    public void telefonar(String num){
        System.out.println("Ligando para o número " + num);
        this.bateria -= 10;
    }

    @Override
    public String toString() {
        return "O celular está " +
                ((status) ? "ligado":"desligado") +
                " e com " +
                bateria + "%";
    }
}
