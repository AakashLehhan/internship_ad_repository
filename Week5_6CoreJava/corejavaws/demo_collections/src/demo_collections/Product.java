package demo_collections;

public class Product implements Comparable<Product> {
	private int id;
	private String pname;
	private double unitPrice;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String pname, double unitPrice) {
		super();
		this.pname = pname;
		this.unitPrice = unitPrice;
	}

	public Product(int id, String pname, double unitPrice) {
		super();
		this.id = id;
		this.pname = pname;
		this.unitPrice = unitPrice;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((pname == null) ? 0 : pname.hashCode());
		long temp;
		temp = Double.doubleToLongBits(unitPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (id != other.id)
			return false;
		if (pname == null) {
			if (other.pname != null)
				return false;
		} else if (!pname.equals(other.pname))
			return false;
		if (Double.doubleToLongBits(unitPrice) != Double.doubleToLongBits(other.unitPrice))
			return false;
		return true;
	}

	@Override
	public int compareTo(Product p2) {
		
		return this.id-p2.id;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", pname=" + pname + ", unitPrice=" + unitPrice + "]";
	}

}
