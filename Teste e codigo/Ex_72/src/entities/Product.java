package entities;

public class Product {
    private Integer codigo;
    private Double price;

    public Product(Integer codigo, Double price) {
        this.codigo = codigo;
        this.price = price;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Codigo = " + codigo +
                "; \nPrice=" + price;
    }
}
