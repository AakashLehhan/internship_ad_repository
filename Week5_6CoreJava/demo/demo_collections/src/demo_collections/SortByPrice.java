package demo_collections;

import java.util.Comparator;

public class SortByPrice implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		
		return (int) (p1.getUnitPrice()-p2.getUnitPrice());
	}

	@Override
	public Comparator<Product> reversed() {
		return Comparator.super.reversed();
	}

}
