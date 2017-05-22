package pl.sdacademy.tasks;

import pl.sdacademy.utils.TableUtils;

public class Task13 {

	public Task13() {
		// TODO Auto-generated constructor stub
	    }

	    /**
	     * @param args
	     */
	    public static void main(String[] args) {
		// TODO Auto-generated method stub

		TableUtils tableUtils = new TableUtils();
		Object[] table = tableUtils.createTable(10);
		tableUtils.print(table);

		for (int i = 0; i < table.length; i++) {
		    if (i % 2 == 1) {
			int valueElementBefore = (int) table[i - 1];
			addValueToElement(table, i, valueElementBefore);
		    }
		}

		tableUtils.print(table);
		for (int i = 0; i < table.length; i++) {
		    if (isDivideByTwo(table, i)) {
			int elementValue = (int) table[i] / 2;
			setValueInTable(table, i, elementValue);
		    }
		}
		tableUtils.print(table);
		int sum = 0;
		for (int i = 0; i < table.length; i++) {
		    sum += (int) table[i];
		}
		System.out.println(sum);

	    }

	    private static boolean isDivideByTwo(Object[] table, int i) {
		return (int) table[i] % 2 == 0;
	    }

	    /**
	     * Dodaje wartosc elementValue do i-tego elementu tabeli
	     * 
	     * @param table
	     * @param i
	     * @param elementValue
	     */
	    private static void addValueToElement(Object[] table, int i, int elementValue) {
		int value = (int) table[i];
		value += elementValue;
		table[i] = value;
	    }

	    private static void setValueInTable(Object[] table, int i, int elementValue) {
		table[i] = elementValue;
	    }
}

