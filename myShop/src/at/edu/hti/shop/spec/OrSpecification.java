package at.edu.hti.shop.spec;

public class OrSpecification<T> extends AbstractSpecification<T> {

	private ISpecification<T> specification1;
	private ISpecification<T> specification2;

	public OrSpecification(ISpecification<T> spec1, ISpecification<T> spec2) {
		this.specification1 = spec1;
		this.specification2 = spec2;
	}

	public boolean isSatisfiedBy(T object) {
		return (this.specification1.isSatisfiedBy(object) || this.specification2
				.isSatisfiedBy(object));
	}

}
