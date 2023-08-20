import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nentrada = sc.nextInt();

        System.out.println((nentrada > 10) ? "Maior que 10!" : "Não é maior que 10!");

        sc.close();
    }


}
