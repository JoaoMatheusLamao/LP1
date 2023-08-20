import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.print("\nCódigo: ");
            Integer cod = sc.nextInt();

            System.out.print("Preço: ");
            Double price = sc.nextDouble();

            products.add(new Product(cod, price));
        }

        sc.close();

        Product maxPrice = products.get(0);
        Double soma = 0.0;

        for (Product p : products){
            soma += p.getPrice();
            if (p.getPrice() > maxPrice.getPrice()){
                maxPrice = p;
            }
        }

        System.out.printf("Média: %.2f\n", (soma/products.size()));
        System.out.println("Produto mais caro: " + maxPrice);
    }
}
