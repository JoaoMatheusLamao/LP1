import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WithList {
    public static void main(String[] args) {

        Random rd = new Random();

        int vect_size = 20;

        ArrayList<Integer> vect = new ArrayList<>();

        for (int i = 0; i < vect_size ; i++) {
            vect.add(rd.nextInt(20));
        }

        System.out.println(vect.toString());

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com um número: ");
        int number = sc.nextInt();

        System.out.println("");

        vect.removeIf(a -> a == number);
        System.out.println(vect.toString());

        sc.close();
    }
}
