package util;

import java.util.function.Consumer;

import entitie.Product;

public class MyConsumer implements Consumer<Product> {

	@Override
	public void accept(Product t) {
		t.setPrice(t.getPrice() * 1.1);
		
	}

}
