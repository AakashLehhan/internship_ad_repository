package demo_collections;

import java.util.Comparator;

public class SortByPriceDesc implements Comparator<Product> {

	@Override
	public int compare(Product o1, Product o2) {
		
		return (int) (o2.getUnitPrice()-o1.getUnitPrice());
	}

}
