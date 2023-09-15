import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class WithArray {
    public static void main(String[] args) {

        int[] vectA = new int[10];
        int[] vectM = new int[10];

        for (int i = 0; i < 10; i++) {
            vectA[i] = (new Random().nextInt(25));
        }

        System.out.println("Vetor: " + Arrays.toString(vectA));

        int number = new Random().nextInt(10);

        System.out.println("Number: " + number);


        for (int i = 0; i < vectA.length; i++) {
            vectM[i] = vectA[i]*number;
        }

        System.out.println("M: " + Arrays.toString(vectM));
    }


}
