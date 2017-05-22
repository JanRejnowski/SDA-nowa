package pl.sdacademy.utils;

import java.util.Random;
import java.util.stream.Stream;

public class TableUtils implements ITableUtils {

	/**
	 * Zamiana elementów w tablicy</br>
	 * i,j elementy od 0 do n, gdzie n to lenght table
	 * 
	 * @param i
	 * @param j
	 */
	@Override
	public void changeElement(Object[] table, int i, int j) {
		// TODO Proszę zrobić zamianę elementów w tablicy
		if ((i >= table.length) || (j >= table.length)) {
			return;
		}

		Object tmp = table[i];
		table[i] = table[j];
		table[j] = tmp;

	}

	public String print(int[] table) {
		String result = "";
		for(Object element: table){
			result += element + " ";
		}
		return result;
	}

	public void print(Object[] table) {
		int start = 0;
		int end = table.length;
		for (Object element : table) { //
			System.out.print(element);
			start++;
			if (start != end) {
				System.out.print(",");
			}
		}
		System.out.println("");
	}

	/**
	 * Tworzy tablice od 1 do n
	 * 
	 * @param n
	 * 
	 * @return
	 */
	public Object[] createTable(int n) {
		Object[] table = new Object[n];
		for (int k = 0; k < n; k++) {
			table[k] = k;
		}
		return table;
	}

	/**
	 * Generowanie liczb w tablicy
	 * 
	 * @param lenght
	 * @param from
	 * @param to
	 * @return
	 */
	public int[] generateNumbers(int lenght, int from, int to) {
		if (from >= to) {
			// zrzucenie wyjątku na console
			throw new IllegalArgumentException("Exception : " + from + ">=" + to);
		}
		Random random = new Random();
		int[] table = new int[lenght];
		for (int i = 0; i < table.length; i++) {
			table[i] = random.nextInt(to - from) + from;
		}
		return table;
	}

	public void printStream(int[] table) {

		Stream.of(table).forEach(e -> {
			System.out.println(e + ",");
		});
	}
}
