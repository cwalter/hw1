package at.edu.hti.shop.spec.impl;

import at.edu.hti.shop.packaging.IPackage;
import at.edu.hti.shop.spec.AbstractSpecification;

public class WeightSpecification extends AbstractSpecification<IPackage> {

	private final double maxWeight;

	public WeightSpecification(double maxWeight) {
		this.maxWeight = maxWeight;
	}

	@Override
	public boolean isSatisfiedBy(IPackage o) {
		return (o.getWeight() <= maxWeight) ;
	}
	
	
	
	

}
