package at.edu.hti.shop.packaging;

import java.util.ArrayList;
import java.util.List;

import at.edu.hti.shop.domain.Order;
import at.edu.hti.shop.domain.OrderLine;
import at.edu.hti.shop.spec.ISpecification;

public class PackageFactory {

	public static final int BREAK_DOWN = 3;
	
	public static List<IPackage> getPackages(Order o, ISpecification<IPackage> spec) {
		List<IPackage> packages = new ArrayList<>();
		
		int breackDown = 0;
		int lastCount = 0;
		IPackage p = new Package();
		for (OrderLine ol : o.getLines()) {
			int prodCount = ol.getAmount();
			while (prodCount > 0) {
				if (spec.isSatisfiedBy(p)) {
					p.setOrderId(o.getId());
					p.setOrderLineId(ol.getId());
					p.put(ol.getProduct());
					prodCount--;
				} else {
					packages.add(p);
					p = new Package();
					if (lastCount != prodCount) {
						lastCount = prodCount;
					}
				}
				
				if (lastCount == prodCount) {
					breackDown++;
				}
				
				if (breackDown >= BREAK_DOWN) {
					throw new IllegalArgumentException("The product [" + ol.getProduct().getName() + "] in order line [" + ol.getId() + "] cannot fit into packages.");
				}
			}
		}

		return packages;
	}

}
