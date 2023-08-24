import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor1 = sc.nextInt();
        int valor2 = sc.nextInt();

        if (valor2 == valor1) {
            System.out.println("Números iguais.");
        } else if (valor1 > valor2){
            System.out.println("Primeiro é maior");
        } else {
            System.out.println("Segundo é o maior");
        }
        sc.close();
    }
}
