package at.edu.hti.shop.domain;

public class OrderLine {
	private Product product;
	private int amount;
	private int id;
	
	public OrderLine(Product product, int amount) {
		super();
		this.product = product;
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Product getProduct() {
		return product;
	}

	public double calcPrize() {
		return amount * product.getPrize();
	}

	@Override
	public String toString() {
		return "OrderLine [" + product + ", " + amount + "]";
	}

	public double getWeight() {
		return (product.getSingleItemWeight() * getAmount());
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

}
