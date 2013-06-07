package at.edu.hti.shop.spec.impl;

import at.edu.hti.shop.domain.Order;
import at.edu.hti.shop.spec.AbstractSpecification;

public class WeightSpecification extends AbstractSpecification<Order> {

	private final double maxWeight;

	public WeightSpecification(double maxWeight) {
		this.maxWeight = maxWeight;
	}

	@Override
	public boolean isSatisfiedBy(Order o) {
		return (o.getSumWeight() <= maxWeight) ;
	}

}
