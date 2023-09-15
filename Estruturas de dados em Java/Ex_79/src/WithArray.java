import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class WithArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vect_size = 10;

        double[] alunos = new double[vect_size];
        double soma = 0;

        for (int i = 0; i < vect_size; i++) {
            System.out.print("\nDigite a nota do aluno " + (i+1) + ": ");
            alunos[i] = (sc.nextDouble());
            soma+=alunos[i];
        }

        sc.close();


        System.out.println("Vetor: " + Arrays.toString(alunos));

        double media = soma / vect_size;

        System.out.printf("Média: %.2f \n", media);

        int n_alunos_ok = 0;

        for (int i = 0; i < vect_size; i++) {
            if (alunos[i] >= media){
                n_alunos_ok++;
            }
        }
        System.out.println("Total de alunos aprovrados: " + n_alunos_ok);
    }
}
