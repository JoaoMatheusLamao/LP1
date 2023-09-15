import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        int[] vect = new int[10];

        for (int i = 0; i < 10; i++) {
            vect[i] = (new Random().nextInt(50));
        }

        System.out.println("Vetor original: " + Arrays.toString(vect) + "\n");

        ArrayList<Integer> vectInverted = new ArrayList<>();

        for (int i = 19; i >= 0; i--) {
            vectInverted.add(vect[i]);
        }

        System.out.println("Vetor invertido: " + vectInverted + "\n");

    }
}
