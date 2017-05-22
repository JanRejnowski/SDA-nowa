package pl.sdacademy.search;

import java.util.function.Predicate;

public class GenericSearchAlgorithm<T> implements IGenericSearchAlgorithm<T>{

	@Override
	public <T extends Comparable> int search(T[] array, Predicate<T> predicate) {
		int foundI = -1;
		for (int i = 0; i < array.length; i++) {
			if (predicate.test(array[i])) {
				foundI = i;
				break;
			}
		}
		return foundI;

	}

}
