import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nHomem 1: ");
        int idadeHomem1 = sc.nextInt();

        System.out.print("\nHomem 2: ");
        int idadeHomem2 = sc.nextInt();

        System.out.print("\nMulher 1: ");
        int idadeMulher1 = sc.nextInt();

        System.out.print("\nMulher 2: ");
        int idadeMulher2 = sc.nextInt();

        int homemNovo;
        int homemVelho;


        if (idadeHomem1>idadeHomem2){
            homemNovo = idadeHomem2;
            homemVelho = idadeHomem1;
        } else {
            homemNovo = idadeHomem1;
            homemVelho = idadeHomem2;
        }

        int mulherNova;
        int mulherVelha;


        if (idadeMulher1>idadeMulher2){
            mulherNova = idadeMulher2;
            mulherVelha = idadeMulher1;
        } else {
            mulherNova = idadeMulher1;
            mulherVelha = idadeMulher2;
        }

        System.out.println("Soma: " + (homemVelho+mulherNova));
        System.out.println("Produto: " + (homemNovo*mulherVelha));

        sc.close();
    }
}
