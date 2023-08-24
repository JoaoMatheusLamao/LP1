import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Nome de time: ");
        String time1 = sc.nextLine();

        System.out.print("Gols do time " + time1 + ": ");
        int valor1 = sc.nextInt();

        sc.nextLine();

        System.out.print("Nome de time: ");
        String time2 = sc.nextLine();

        System.out.print("Gols do time " + time2 + ": ");
        int valor2 = sc.nextInt();

        if (valor2 == valor1) {
            System.out.println("Empate.");
        } else if (valor1 > valor2){
            System.out.println("Vencedor: " + time1);
        } else {
            System.out.println("Vencedor: " + time2);
        }

        sc.close();
    }
}
