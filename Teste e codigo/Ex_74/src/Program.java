public class Program {

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("\n\nTabuáda do " + i);

            for (int j = 0; j <= 10 ; j++) {
                System.out.printf("%d x %d = %d\n", i, j, (i*j));
            }
        }
    }
}
