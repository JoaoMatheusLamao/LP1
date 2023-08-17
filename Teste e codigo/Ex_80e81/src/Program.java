import java.util.ArrayList;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        ArrayList<Integer> q = new ArrayList();

        int maior = 0;
        int menor = 0;
        int indiceMaior = 0;
        int indiceMenor = 0;

        for (int i = 0; i < 20; i++) {
            int number = new Random().nextInt(15);
            maior = (i == 0)? number: maior;
            menor = (i == 0)? number: menor;

            if (maior < number) {
                maior = number;
                indiceMaior = i;
            }
            if (menor > number){
                indiceMenor = i;
                menor = number;
            }
            q.add(number);
        }

        System.out.println("Vetor: " + q);
        System.out.printf("Maior: %d - Índice: %d\nMenor: %d - Índice: %d\n", maior, indiceMaior, menor, indiceMenor);
    }
}
