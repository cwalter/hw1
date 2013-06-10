package at.edu.hti.shop.packaging;

import java.util.List;

import at.edu.hti.shop.domain.Product;

public class Package implements IPackage {

	private long orderID;

	private long orderLineID;

	private List<Product> packagedProducts;

	public long getOrderId() {
		return orderID;
	}

	public void setOrderId(long orderID) {
		this.orderID = orderID;
	}

	public long getOrderLineId() {
		return orderLineID;
	}

	public void setOrderLineId(long orderLineID) {
		this.orderLineID = orderLineID;
	}

	public List<Product> getPackagedProducts() {
		return packagedProducts;
	}

	public void setPackagedProducts(List<Product> packagedProducts) {
		this.packagedProducts = packagedProducts;
	}

	public void put(Product product) {
		packagedProducts.add(product);
	}

	public double getWeight() {
		double sum = 0;
		for (Product p : packagedProducts) {
			sum += p.getSingleItemWeight();
		}
		return sum;
	}

	@Override
	public String toString() {
		StringBuffer b = new StringBuffer();
		b.append("Order: ").append(getOrderId()).append(" Order line: ")
				.append(getOrderLineId());
		for (Product prod : packagedProducts) {
			b.append("\t").append(prod.getName());
		}
		return super.toString();
	}

}
