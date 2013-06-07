package at.edu.hti.shop.spec;

public class NotSpecification<T> extends AbstractSpecification<T> {

	private ISpecification<T> specification1;

	public NotSpecification(ISpecification<T> spec1) {
		this.specification1 = spec1;
	}

	public boolean isSatisfiedBy(T object) {
		return !(specification1.isSatisfiedBy(object));
	}
}
