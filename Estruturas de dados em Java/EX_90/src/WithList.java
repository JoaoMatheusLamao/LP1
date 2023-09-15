import java.util.ArrayList;
import java.util.Random;

public class WithList {
    public static void main(String[] args) {

        int vet_size = 30;
        int repetition = 0;
        ArrayList<Integer> vet = new ArrayList<>();

        for (int i = 0; i < vet_size; i++) {
            vet.add(new Random().nextInt(50));
        }


        int comparator = new Random().nextInt(50);

        for (int i = 0; i < vet_size; i++) {
            if (comparator == vet.get(i)) {
                repetition++;
            }
        }

        System.out.printf("Existem %d repetições do número %d\n", repetition, comparator);
        System.out.println("Vetor: ");
        System.out.println(vet);

    }
}
