import java.util.ArrayList;
import java.util.Random;

public class WithList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();

        int maior = 0;
        int menor = 0;
        int indiceMaior = 0;
        int indiceMenor = 0;

        for (int i = 0; i < 10; i++) {
            int number = new Random().nextInt(15);
            if (i == 0){
                maior = number;
                menor = number;
            }

            if (maior < number) {
                maior = number;
                indiceMaior = i;
            }
            if (menor > number){
                indiceMenor = i;
                menor = number;
            }
            list.add(number);
        }

        System.out.println("Vetor: " + list);
        System.out.printf("Maior: %d - Índice: %d\nMenor: %d - Índice: %d\n", maior, indiceMaior, menor, indiceMenor);
    }
}
