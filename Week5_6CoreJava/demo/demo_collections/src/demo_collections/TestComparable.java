package demo_collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestComparable {

	public static void main(String[] args) {
		List<Product> productList=new ArrayList<>();
		productList.add(new Product(1004,"Pepsi",30.00));
		productList.add(new Product(1002,"Pepsi",30.00));
		productList.add(new Product(1001,"Pepsi",30.00));
		productList.add(new Product(1003,"Pepsi",30.00));
		System.out.println("List\n"+productList);
		
		Set<Product> productSet=new TreeSet<>();
		productSet.add(new Product(1004,"Pepsi",30.00));
		productSet.add(new Product(1002,"Pepsi",30.00));
		productSet.add(new Product(1001,"Pepsi",30.00));
		productSet.add(new Product(1003,"Pepsi",30.00));
		System.out.println("SortedSet\n"+productSet);
		
		System.out.println("Sort on price Asc");
		SortByPrice sortByprice=new SortByPrice();
		productSet=new TreeSet(sortByprice);
		productSet.add(new Product(1004,"Pepsi",30.00));
		productSet.add(new Product(1002,"Pepsi",40.00));
		productSet.add(new Product(1001,"Pepsi",550.00));
		productSet.add(new Product(1003,"Pepsi",12.00));
		System.out.println("SortedSet Comprator Asc Unit Price\n"+productSet);
		
		SortByPriceDesc sortByPriceDesc=new SortByPriceDesc();		
		productSet=new TreeSet(sortByPriceDesc);
		productSet.add(new Product(1004,"Pepsi",30.00));
		productSet.add(new Product(1002,"Pepsi",40.00));
		productSet.add(new Product(1001,"Pepsi",550.00));
		productSet.add(new Product(1003,"Pepsi",12.00));
		System.out.println("SortedSet SortByPriceDesc Desc Unit Price\n"+productSet);
		
		
		Comparator<Product> c=sortByprice.reversed();
		productSet=new TreeSet(c);
		productSet.add(new Product(1004,"Pepsi",30.00));
		productSet.add(new Product(1002,"Pepsi",40.00));
		productSet.add(new Product(1001,"Pepsi",550.00));
		productSet.add(new Product(1003,"Pepsi",12.00));
		System.out.println("Comparator<Product> c=sortByprice.reversed() Desc Unit Price\n"+productSet);
		
		System.out.println("SortedSet Comprator only once product name \n"+productSet);
		Comparator<Product> sortByProductNameAsc=new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				
				return o1.getPname().compareTo(o2.getPname());
			}
		};
		productSet=new TreeSet(sortByProductNameAsc);
		productSet.add(new Product(1004,"Maaza",30.00));
		productSet.add(new Product(1002,"Pepsi",40.00));
		productSet.add(new Product(1001,"Limca",550.00));
		productSet.add(new Product(1003,"Appy",12.00));
		System.out.println("SortedSet Comprator Asc Pname\n"+productSet);
		
		sortByProductNameAsc=sortByProductNameAsc.reversed();
		productSet=new TreeSet(sortByProductNameAsc);
		
		productSet.add(new Product(1004,"Maaza",30.00));
		productSet.add(new Product(1002,"Pepsi",40.00));
		productSet.add(new Product(1001,"Limca",550.00));
		productSet.add(new Product(1003,"Appy",12.00));		
		System.out.println("SortedSet Comprator Desc Pname\n"+productSet);
		
		
	}

}
