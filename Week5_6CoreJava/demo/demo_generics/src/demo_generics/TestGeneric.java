package demo_generics;


public class TestGeneric {
	public static void main(String[] args) {
		GenericStack<Float> numbersFloat=new GenericStack<>();
		numbersFloat.add(12.33f);
		numbersFloat.add(11.33f);
		numbersFloat.add(18.33f);
		numbersFloat.add(15.33f);
//		numbersFloat.add("dhanashree");
		System.out.println(numbersFloat);
		GenericStack<Person> genericStack=new GenericStack<>();
		genericStack.add(new Person("Amit"));
		genericStack.add(new Person("Amita"));
		genericStack.add(new Person("Aditya"));
		System.out.println(genericStack);
	}

}
//Array : Static						: SameType
//Collection : Type casting Perfromance : Dynamic
//Generic : SameType dynamic
//<> Dimond :- Type of data you will access or work on
//<T> : Type -- class
//<E> : Enumeration
//<N> : Number
//<K,V>: Key and Value
//Compile time type check
