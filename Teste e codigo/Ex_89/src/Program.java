import java.util.Arrays;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        int vect_size = 15;

        int[] vet1 = new int[vect_size];
        int[] vet2 = new int[vect_size];

        for (int i = 0; i < vect_size; i++) {
            vet1[i] = new Random().nextInt(5);
            vet2[i] = new Random().nextInt(5);

            int repetetion = 0;

            if (vet1[i] == vet2[i]) {
                repetetion++;
                System.out.printf("O número %d, na posição %d, repete %d vezes; \n", vet1[i], i, repetetion);
            }

        }

        System.out.println(Arrays.toString(vet1));
        System.out.println(Arrays.toString(vet2));
    }
}
