package application;

import java.util.ArrayList;
import java.util.List;

import entitie.Product;
import util.MyConsumer;

public class Program {

	public static void main(String[] args) {
		
		List<Product> products = new ArrayList<>();
		
		products.add(new Product("Tv", 900.00));
		products.add(new Product("Mouse", 50.00));
		products.add(new Product("Tablet", 350.50));
		products.add(new Product("HD Case", 80.90));
		
		
		products.forEach(new MyConsumer());
		products.forEach(System.out::println);
		

	}

}