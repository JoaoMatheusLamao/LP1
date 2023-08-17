import java.util.ArrayList;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        ArrayList<Integer> vect = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            vect.add(new Random().nextInt(50));
        }

        System.out.println("Vetor original: " + vect + "\n");

        ArrayList<Integer> vectInverted = new ArrayList<>();

        for (int i = 19; i >= 0; i--) {
            vectInverted.add(vect.get(i));
        }

        System.out.println("Vetor invertido: " + vectInverted + "\n");

    }
}
