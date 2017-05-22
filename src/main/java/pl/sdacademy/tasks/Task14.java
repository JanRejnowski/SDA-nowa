package pl.sdacademy.tasks;

import java.util.stream.Stream;

public class Task14 extends TaskTemplate{

	public Task14() {
		// TODO Auto-generated constructor stub
	    }

	    public static void main(String[] args) {

		// int[] table = tableUtils.generateNumbers(10, 0, 123);
		Object[] table = { 1, 2, 3, 0 };
		// tableUtils.printStream(table);
		Stream.of(table).forEach(e -> {
		    System.out.print(e + ",");
		});
	    }
}
