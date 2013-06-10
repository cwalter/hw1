package at.edu.hti.shop.packaging;

import at.edu.hti.shop.domain.Product;

public interface IPackage {

	public double getWeight();

	public void put(Product product);
	
	public void setOrderId(long orderId);
	
	public void setOrderLineId(long orderLineId);
	
	public long getOrderId();
	
	public long getOrderLineId();

}
