import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite a quantidade de alunos: ");
        int vect_size = sc.nextInt();
        double soma = 0;
        int n_alunos_ok = 0;


        ArrayList<Double> alunos = new ArrayList<>();

        for (int i = 0; i < vect_size; i++) {
            System.out.print("\nDigite a nota do aluno " + (i+1) + ": ");
            Double nota = sc.nextDouble();
            alunos.add(nota);
        }


        sc.close();


        soma = alunos.stream().mapToDouble(Double::doubleValue).sum();

        System.out.println("Vetor: " + alunos);

        double media = soma / vect_size;

        System.out.printf("Média: %.2f \n", media);

        for (int i = 0; i < vect_size; i++) {
            if (alunos.get(i) >= media){
                n_alunos_ok++;
            }
        }
        System.out.println("Total de alunos aprovrados: " + n_alunos_ok);
    }
}
