import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int listSize = 2;

        List<String> nomes = new ArrayList<>();

        for (int i = 0; i < listSize; i++) {
            nomes.add(sc.nextLine());
        }

        System.out.println("Agora digite um nome: \n");

        String busca = sc.nextLine();

        Boolean c = false;

        for (int i = 0; i < listSize; i++) {
            if (nomes.get(i).equals(busca)){
                c = true;
            }
        }

        System.out.println((c) ? "Achei" : "Não achei");
        sc.close();
    }

}
