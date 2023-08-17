import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        ArrayList<Integer> vect = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            vect.add(new Random().nextInt(20));
        }

        Collections.sort(vect);

        System.out.println("Ex 86: " + vect);

        int number = new Random().nextInt(10);
        vect.add(number);
        System.out.println(vect);
        Collections.sort(vect);
        System.out.println("Ex 86: " + vect);
    }
}
