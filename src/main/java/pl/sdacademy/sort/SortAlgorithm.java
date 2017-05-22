package pl.sdacademy.sort;

import java.util.Arrays;

import pl.sdacademy.utils.TableUtils;

public class SortAlgorithm implements ISortAlgorithm{

	public SortAlgorithm() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		// tworze obiekt mojej klasy
				ISortAlgorithm sortAlgorithm = new SortAlgorithm();
		
		// POCZATEK TESTOWANIA METODY QUICKSORT
				int[] tableToSort = { 7, 2, 4, 7, 3, 1, 4, 6, 5, 8, 3, 9, 2, 6, 7, 6, 3 };
				// int[] tableToSort = { 2, 4, 3, 1, 4, 3, 3, 2 };

				System.out.println(Arrays.toString(tableToSort));
				System.out.println("===================================");

				int firstIndex = 0;
				int lastIndex = tableToSort.length;
				
				sortAlgorithm.quickSort(tableToSort, firstIndex, lastIndex);
	}
	
	//Sortowanie bąbelkowe
	@Override
	public void sort(int[] array, boolean ascending) {
		if(array == null){
			throw new NullPointerException();
		}
		TableUtils tableUtils = new TableUtils();
		
		if(ascending){
			int tmp;
			for(int i = 0; i < array.length - 1; i++){
				for(int j = 1; j < array.length - i; j++){
					if(array[j - 1] > array[j]){
						tmp = array[j - 1];
						array[j - 1] = array[j];
						array[j] = tmp;
					}
				}
				tableUtils.print(array);
			}
		} else {
			int tmp;
			for(int i = 0; i < array.length - 1; i++){
				for(int j = 1; j < array.length - i; j++){
					if(array[j - 1] < array[j]){
						tmp = array[j - 1];
						array[j - 1] = array[j];
						array[j] = tmp;
					}
				}
				tableUtils.print(array);
			}
		}
	}
	
	//Sortowanie szybkie
	public void quickSort(int[] array, int l, int r){
    	if(l < r){
    		int i = divideArray(array, l, r);
    		quickSort(array, l, i-1);
    		quickSort(array, i + 1, r);
    	}
    }
    
    public int divideArray(int[] array, int l, int r) {
    	int indexOfDivision = choosePointOfDivision(l, r);
    	int valueOfIndex = array[indexOfDivision];
    	changeElements(array, indexOfDivision, r);
    	int actualPosition = l;
    	for (int i = l; i < r-1; i++) {
			if(array[i] < valueOfIndex){
				changeElements(array, i, actualPosition);
				actualPosition++;
			}
		}
    	changeElements(array, actualPosition, r);
    	return actualPosition;
    }

    public int choosePointOfDivision(int l, int r) {
    	return l + (r-l) / 2;
    }
    
    public void changeElements(int[] array, int i1, int i2){
    	int tmp = array[i1];
    	array[i1] = array[i2];
    	array[i2] = tmp;
    }

}
