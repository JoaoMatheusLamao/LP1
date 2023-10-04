package entities;

import java.util.Scanner;

public class Carro {
    private double volumeTanque;
    private String cor;

    public Carro(double volumeTanque, String cor) {
        this.volumeTanque = volumeTanque;
        this.cor = cor;
    }

    public double getVolumeTanque() {
        return volumeTanque;
    }

    public void abastecer(double volume){
        if (volumeTanque == 1){
            System.out.println("TANQUE CHEIO");
        } else if (volumeTanque+volume > 1){
            System.out.println("Vai transbordar hein...");
        } else {
            this.volumeTanque += volume;
        }
    }

    @Override
    public String toString() {
        return "Carro{" +
                "volumeTanque=" + volumeTanque +
                ", cor='" + cor + '\'' +
                '}';
    }
}
