package pl.sdacademy.sort;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ISortAlgorithmTest {

	ISortAlgorithm sortAlgorithm = new SortAlgorithm();
	int[] unSortedTable = {1, 5, 87, 2, 4};
	int[] sortedTableAsc = {1, 2, 4, 5, 87};
	int[] sortedTableDsc = {87, 5, 4, 2, 1};
	
	@Test
	public void shouldTestIsTableEqual() {
		int[] table1 = {87, 5, 4, 2, 1};
		int[] table2 = {87, 5, 4, 2, 1};
		
		assertTrue("Tables are equal", isTableEqual(table1, table2));
	}
	
	@Test
	public void shouldTestIsTableNotEqual(){
		int[] table1 = {87, 5, 4, 2, 1};
		int[] table2 = {9, 5, 4, 2, 1};
		
		assertFalse("The tables should not be equal", isTableEqual(table1, table2));
	}
	
	@Test
	public void shouldSortArrayAscendingByDefault() {
		sortAlgorithm.sort(unSortedTable);
		
		assertTrue(isTableEqual(unSortedTable, sortedTableAsc));
	}
	

	private boolean isTableEqual(int[] tableToSort, int[] sortedTable) {
		boolean isEqual = true;
		
		for (int i = 0; i < tableToSort.length; i++) {
			if(tableToSort[i] != sortedTable[i]){
				return false;
			}
		}
		return isEqual;
	}
	
	@Test
	public void shouldSortArrayDependingOnTheOrder() {
		sortAlgorithm.sort(unSortedTable,false);
		
		assertTrue(isTableEqual(unSortedTable, sortedTableDsc));
	}
	
	@Test
	public void shouldLeaveSortedSortArrayUnchanged() {
		int[] tableToSortTemp = {1, 2, 4, 5, 87};
		
		sortAlgorithm.sort(tableToSortTemp);
		
		assertTrue(isTableEqual(tableToSortTemp, sortedTableAsc));
	}
	
	@Test
	public void shouldThrowExceptionIfArrayIsNull() {
		int[] notInitializedArray = null;
		boolean isArrayNull = false;
		
		try{
			sortAlgorithm.sort(notInitializedArray);
		} catch (NullPointerException e){
			isArrayNull = true;
		}
		
		assertTrue(isArrayNull);
	}
	
	@Test
	public void shouldNotThrowIfArrayIsZeroSized() {
		int[] emptyArray = {};
		boolean isThrowException = false;
		
		try {
			sortAlgorithm.sort(emptyArray);
		} catch (Exception e) {
			isThrowException = true;
		}
		
		assertFalse(isThrowException);
	}
	
	@Test
	public void shouldSortIfElementsAreNotUnique(){
		int[] notUniqueUnsortedTable = {1, 3, 5, 7, 3, 1, 5};
		int[] notUniqueSortedTable = {1, 1, 3, 3, 5, 5, 7};
		
		sortAlgorithm.sort(notUniqueUnsortedTable);
		
		assertTrue(isTableEqual(notUniqueUnsortedTable, notUniqueSortedTable));
	}
}
