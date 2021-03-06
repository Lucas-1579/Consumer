package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitie.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> products = new ArrayList<>();
		
		products.add(new Product("Tv", 900.00));
		products.add(new Product("Mouse", 50.00));
		products.add(new Product("Tablet", 350.50));
		products.add(new Product("HD Case", 80.90));
		
		System.out.print("Enter the percentage to increase the product price: ");
		double percent = sc.nextDouble();
		System.out.println();
		
		products.forEach(p -> p.setPrice(p.getPrice() * percent));
		System.out.println("Update price: ");
		products.forEach(System.out::println);
		

		sc.close();
	}

}
