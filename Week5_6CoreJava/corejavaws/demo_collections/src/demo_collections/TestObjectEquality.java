package demo_collections;

public class TestObjectEquality {

	public static void main(String[] args) {
		String name1="Gaurav";
		String name2=new String("Gaurav");//"Gaurav";
		if(name1==name2) {
				System.out.println("Same");
		}else {
			System.out.println("different");
		}
		if(name1.equals(name2)) {
			System.out.println("equals Same");
		}else {
			System.out.println("different");
		}
		System.out.println("Person comparison ");
		Person p1=new Person("Shweta");
		Person p2=new Person("Shweta");
		System.out.println("p1==p2");
		if(p1==p2) {
			System.out.println("equals Same");
		}else {
			System.out.println("different");
		}
		System.out.println("p1.equals(p2)");	
		if(p1.equals(p2)){
			System.out.println("equals Same");
		}else {
			System.out.println("different");
		}	
	}

}
