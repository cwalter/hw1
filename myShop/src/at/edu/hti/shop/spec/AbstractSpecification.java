package at.edu.hti.shop.spec;

public abstract class AbstractSpecification<T> implements ISpecification<T> {

	public ISpecification<T> and(final ISpecification<T> spec) {
		return new AndSpecification<>(this, spec);
	}

	public ISpecification<T> or(final ISpecification<T> spec) {
		return new OrSpecification<T>(this, spec);
	}

	public ISpecification<T> not(final ISpecification<T> spec) {
		return new NotSpecification<T>(spec);
	}
}
