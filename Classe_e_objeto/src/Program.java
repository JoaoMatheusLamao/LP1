import entities.Carro;
import entities.Celular;
import entities.Guitar;
import entities.Televisao;

public class Program {

    public static void main(String[] args){
        //GUITAR
        Guitar gt = new Guitar("Azul", "Taylor", "Folk");

        gt.tocar("Legião");
        System.out.println("--------------------");
        gt.setAfinacao(true);
        System.out.println("--------------------");
        gt.tocar("Legião");

        System.out.println("=========================================");
        

        //TELEVISAO
        Televisao tv1 = new Televisao(false, "Samsung", 210);
        System.out.println(tv1);
        System.out.println("--------------------");
        tv1.onOff(true);
        System.out.println("--------------------");
        System.out.println(tv1);

        System.out.println("=========================================");


        //CARRO
        Carro car = new Carro(0.5, "Verde");

        car.abastecer(0.6);
        System.out.println(car);
        System.out.println("--------------------");
        car.abastecer(0.5);
        System.out.println(car);
        System.out.println("--------------------");
        car.abastecer(0.1);
        System.out.println("--------------------");

        System.out.println("=========================================");


        //Celular
        Celular cel = new Celular("Xiaomi", 100);
        System.out.println(cel);
        System.out.println("--------------------");
        cel.ligar();
        System.out.println("--------------------");
        cel.telefonar("12974115044");
        System.out.println(cel.getBateria() + "%");
        System.out.println("--------------------");
        cel.desligar();
    }

}
