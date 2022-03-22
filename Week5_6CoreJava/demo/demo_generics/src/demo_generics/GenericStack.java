package demo_generics;

import java.util.ArrayList;

public class GenericStack<AnyT> {

	private ArrayList<AnyT> list;
	private int top=-1;
	private int size=0;

	public GenericStack() {
		super();
		this.list = new ArrayList<AnyT>();
	}
	
	public void add(AnyT object) {
		list.add(object);
		++top;
		++size;
		
	}

	public boolean remove(AnyT object) {
		--size;
		return list.remove(object);
	}

	public ArrayList<AnyT> getList() {
		return list;
	}

	public void setList(ArrayList<AnyT> list) {
		this.list = list;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return list.toString();
	}
	
	
	
	
}
