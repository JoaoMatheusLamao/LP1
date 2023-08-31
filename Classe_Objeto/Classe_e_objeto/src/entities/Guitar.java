package entities;

public class Guitar {
    private String cor;
    private String marca;
    private String modelo;

    private Boolean afinacao = false;

    public Guitar() {
    }

    public Guitar(String cor, String marca, String modelo) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;

    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
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

    public Boolean getAfinacao() {
        return afinacao;
    }

    public void setAfinacao(Boolean afinacao) {
        this.afinacao = afinacao;
        System.out.println("O violão" + this.modelo + " está afinado!");
    }

    public void tocar(String musica){
        if (this.afinacao) {
            System.out.println("Seguuuura peão... ao som de: " + musica);
        } else {
            System.out.println("O instrumento não está afinado;");
        }
    }


}
