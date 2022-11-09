package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int N = sc.nextInt();

        for (int i = 0; i<N; i++) {
            System.out.println("Product #" + (i + 1) + " data");
            System.out.print("Common, used or imported? ");
            char productType = sc.next().charAt(0);

            if (productType == 'c') {

                System.out.print("Name:");
                String productName = sc.next();

                System.out.print("Price: ");
                double productPrice = sc.nextDouble();

                Product product = new Product(productName, productPrice);
                products.add(product);

            }else if (productType == 'u'){

                System.out.print("Name:");
                String productName = sc.next();

                System.out.print("Price: ");
                double productPrice = sc.nextDouble();

                System.out.print("Manufacture date (DD/MM/YYYY): ");
                SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");
                Date manufactureDate = DateFor.parse(sc.next());

                Product product = new UsedProduct(productName, productPrice, manufactureDate);
                products.add(product);

            } else if (productType == 'i') {

                System.out.print("Name:");
                String productName = sc.next();

                System.out.print("Price: ");
                double productPrice = sc.nextDouble();

                System.out.print("Customs Fee: ");
                double customsFee = sc.nextDouble();

                Product product = new ImportedProduct(productName, productPrice, customsFee);
                products.add(product);
            }

        }
        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (Product product : products){
            System.out.println(product.toString());
        }


    }
}