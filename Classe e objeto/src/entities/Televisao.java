package entities;

public class Televisao {
    private boolean status;
    private String marca;
    private int voltagem;

    public Televisao(boolean status, String marca, int voltagem) {
        this.status = status;
        this.marca = marca;
        this.voltagem = voltagem;
    }

    public boolean isStatus() {
        return status;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void onOff(boolean status){
        this.status = status;
        if (this.status){
            System.out.println("Ligado");
        } else {
            System.out.println("Desligado");
        }
    }

    @Override
    public String toString() {
        return "Televisao da "+getMarca()+
                " está " +
                ((status) ? "ligada" : "desligada") +
                ", voltagem: " + voltagem;
    }
}
