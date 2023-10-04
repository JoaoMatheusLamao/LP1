import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite um número inteiro: ");
            sc.nextInt();
            System.out.print("Digite um decimal: ");
            sc.nextDouble();

        } catch (InputMismatchException e){
            System.out.println("O erro apresentado é do tipo: " + e);
            System.out.println("tipo de entrada inválida");
        } finally {
            System.out.println("Aqui é sempre executado!!!");
        }

        sc.close();
    }
}
