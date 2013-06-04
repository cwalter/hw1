package at.edu.hti.shop.domain;

public class PricingFactory {

	public static IPriceStrategy getStrategy(String id) throws Exception {
		if (id == null || id.isEmpty()) {
			throw new NullPointerException("The strategy ID was null.");
		}
		
		if ("BestPrice".equalsIgnoreCase(id)) {
			return new BestPrice();
		}
		throw new Exception("Unknown strategy name [" + id + "]");
	}
}
