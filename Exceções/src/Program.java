import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Digite um número inteiro: ");
            sc.nextInt();
            System.out.print("Digite um decimal: ");
            sc.nextDouble();

            List<String> lista = null;

            System.out.println("Tentando adicionar na lista...");
            lista.add("Olá");

        } catch (InputMismatchException e){
            System.out.println("tipo de entrada inválida");
        } catch (NullPointerException e){
            System.out.println("Vish, deu NullPointer aqui hein!");
        }
        finally {
            System.out.println("Tchauuu");
        }
        sc.close();
    }
}
