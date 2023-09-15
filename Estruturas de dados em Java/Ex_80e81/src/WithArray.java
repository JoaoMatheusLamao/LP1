import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class WithArray {
    public static void main(String[] args) {

        int vect_size = 10;
        
        int[] list = new int[vect_size];

        int maior = 0;
        int menor = 0;
        int indiceMaior = 0;
        int indiceMenor = 0;

        for (int i = 0; i < vect_size; i++) {
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
            list[i] = number;
        }

        System.out.println("Vetor: " + Arrays.toString(list));
        System.out.printf("Maior: %d - Índice: %d\nMenor: %d - Índice: %d\n", maior, indiceMaior, menor, indiceMenor);
    }
}
