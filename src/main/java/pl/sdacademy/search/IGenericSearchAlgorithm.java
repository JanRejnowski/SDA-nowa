package pl.sdacademy.search;

import java.util.function.Predicate;

public interface IGenericSearchAlgorithm<T> {

    <T extends Comparable> int search(T[] array, Predicate<T> predicate);

}

