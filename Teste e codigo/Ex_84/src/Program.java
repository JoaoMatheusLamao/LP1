import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Random rd = new Random();

        Scanner sc = new Scanner(System.in);

        System.out.print("Tamanho do vetor: ");
        int vect_size = sc.nextInt();

        sc.close();

        ArrayList<Integer> vectA = new ArrayList<>();
        ArrayList<Integer> vectB = new ArrayList<>();
        ArrayList<Integer> Soma = new ArrayList<>();

        for (int i = 0; i < vect_size; i++) {
            vectA.add(rd.nextInt(10));
            vectB.add(rd.nextInt(10));
            Soma.add(vectA.get(i) + vectB.get(i));
        }

        System.out.println("A:\t\t" + vectA.toString());
        System.out.println("B:\t\t" + vectB.toString());
        System.out.println("Soma:\t" + Soma.toString());
    }
}
