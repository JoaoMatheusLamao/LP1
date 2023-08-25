import entities.Guitar;

public class Program {

    public static void main(String[] args){
        //GUITAR
        Guitar gt = new Guitar("Azul", "Taylor", "Folk");

        gt.tocar("Legião");
        System.out.println("--------------------");
        gt.setAfinacao(true);
        System.out.println("--------------------");
        gt.tocar("Legião");

    }

}
