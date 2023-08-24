import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer ano_nasc = sc.nextInt();

        LocalDate dt = LocalDate.now();

        Integer year_atual = Integer.parseInt(dt.format(DateTimeFormatter.ofPattern("yyyy")));

        System.out.println(((year_atual - ano_nasc) >= 18) ? "Já pode votar" : "Não pode votar não");

        sc.close();
    }
}
