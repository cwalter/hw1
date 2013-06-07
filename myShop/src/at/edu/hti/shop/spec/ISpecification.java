package at.edu.hti.shop.spec;

public interface ISpecification<T> {

	public boolean isSatisfiedBy(T object);
	
	public ISpecification<T> and(ISpecification<T> spec);
	
	public ISpecification<T> or(ISpecification<T> spec);
	
	public ISpecification<T> not(ISpecification<T> spec);
}
