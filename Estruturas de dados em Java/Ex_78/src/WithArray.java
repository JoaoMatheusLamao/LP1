import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WithArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int listSize = 10;

        String[] nomes = new String[listSize];


        for (int i = 0; i < listSize; i++) {
            nomes[i] = (sc.nextLine());
        }

        System.out.println("Agora digite um nome: \n");

        String busca = sc.nextLine();

        Boolean c = false;

        for (int i = 0; i < listSize; i++) {
            if (nomes[i].equals(busca)){
                c = true;
            }
        }

        System.out.println((c) ? "Achei" : "Não achei");
        sc.close();
    }

}
