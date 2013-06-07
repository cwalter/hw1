package at.edu.hti.shop.packaging;

import java.util.ArrayList;
import java.util.List;

import at.edu.hti.shop.domain.Order;
import at.edu.hti.shop.spec.ISpecification;

public class PackageFactory {

	public static List<IPackage> getPackages(Order o, ISpecification<Order> spec) {
		List<IPackage> packages = new ArrayList<>();
		// FIXME implement
		while (!spec.isSatisfiedBy(o)) {

		}

		return packages;
	}

}
