package pl.sdacademy.list;

public interface IList<T> extends Iterable<T> {

	T getFirst();
	
	T getLast();
	
	T get (int index);
	
	void add (T element);
	
	void remove (int index);
	
	int size();
	
	boolean isEmpty();
}
