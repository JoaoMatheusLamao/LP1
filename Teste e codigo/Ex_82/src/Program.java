import java.util.ArrayList;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        ArrayList<Integer> vectA = new ArrayList<>();
        ArrayList<Integer> vectM = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            vectA.add(new Random().nextInt(25));
        }

        System.out.println("Vetor: " + vectA);

        int number = new Random().nextInt(10);

        System.out.println("Number: " + number);

        for (Integer a: vectA){
            vectM.add(a*number);
        }

        System.out.println("M: " + vectM);
    }
}
