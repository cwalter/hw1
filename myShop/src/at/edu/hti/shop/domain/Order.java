package at.edu.hti.shop.domain;

import java.util.ArrayList;
import java.util.List;

public class Order {

	private IPriceStrategy pricing = new BestPrice();
	private List<OrderLine> lines = new ArrayList<>(); //FIXME hash map would be better
	
	public Order() {
		pricing = new BestPrice();
	}
	
	public Order(IPriceStrategy strategy) {
		pricing = strategy;
	}
	
	public void setStrategy(IPriceStrategy pricingStrategy) {
		pricing = pricingStrategy;
	}

	public boolean add(OrderLine e) {

		if (e == null)
			return false;

		return lines.add(e);
	}

	public double calcPrize() {
		return pricing.calcPrice(lines);
	}

	public int size() {
		return lines.size();
	}

	public void changeAmount(int productID, int amount) throws Exception {
		if (size() <= 0) {
			throw new Exception("All products are already removed.");
		}

		if (amount <= 0) {
			lines.remove(productID);
		} else {
			OrderLine ol = lines.get(productID);
			ol.setAmount(amount);
		}
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Your order is:").append("\n");
		for (OrderLine ol : lines) {
			buffer.append(ol).append("\n");
		}
		buffer.append("===================\n").append(calcPrize());
		return buffer.toString();
	}
}
