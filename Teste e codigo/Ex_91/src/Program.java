import java.util.*;

public class Program {
    public static void main(String[] args) {

        int size_vet = 25;

        double[] vet = new double[size_vet];

        for (int i = 0; i <= size_vet -1; i++){
            vet[i] = (new Random().nextInt(25));
        }

        System.out.println("\n" + Arrays.toString(vet) + "\n");

        for (int i = 0; i < size_vet; i++) {
            for (int j = 0; j < size_vet; j++) {
                if (vet[i] == vet[j] && i < j ) {
                    System.out.println("DUPLICATA: Índices " + i + " ("+ vet[i] + ")" +" e " + j + " ("+ vet[i] + ")" +" estão duplicados.");
                }
            }
        }
    }
}
