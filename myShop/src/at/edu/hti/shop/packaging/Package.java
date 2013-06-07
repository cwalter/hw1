package at.edu.hti.shop.packaging;

import java.util.List;

import at.edu.hti.shop.domain.Product;

public class Package {

	private long orderID;

	private long orderLineID;

	private List<Product> packagedProducts;

	public long getOrderID() {
		return orderID;
	}

	public void setOrderID(long orderID) {
		this.orderID = orderID;
	}

	public long getOrderLineID() {
		return orderLineID;
	}

	public void setOrderLineID(long orderLineID) {
		this.orderLineID = orderLineID;
	}

	public List<Product> getPackagedProducts() {
		return packagedProducts;
	}

	public void setPackagedProducts(List<Product> packagedProducts) {
		this.packagedProducts = packagedProducts;
	}

}
