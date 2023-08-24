import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com um valor: ");
        int valor1 = sc.nextInt();

        System.out.print("Entre com um valor: ");
        int valor2 = sc.nextInt();

        System.out.print("Entre com um valor: ");
        int valor3 = sc.nextInt();

        int maior = 0;

        if (valor1 > valor2 && valor1 > valor3){
            maior = valor1;
        }

        if (valor2 > valor1 && valor2 > valor3){
            maior = valor2;
        }

        if (valor3 > valor1 && valor3 > valor2){
            maior = valor3;
        }

        System.out.println("\nO maior valor é: " + maior);
        sc.close();
    }

}
