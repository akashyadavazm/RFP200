package day16And17Problems;

import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSortImplementation<T extends Comparable<T>> {
	T[] elements;

	public BubbleSortImplementation(T[] elements) {
		this.elements = elements;
	}

	public void sort() {
		int length = elements.length;

		System.out.print("Before sorting: \n");
		for (int i = 0; i < length; i++) {
			System.out.print(elements[i] + "\n");
		}
		System.out.println();

		for (int i = 0; i < length - 1; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (elements[j].compareTo(elements[j + 1]) > 0) {
					T temp = elements[j];
					elements[j] = elements[j + 1];
					elements[j + 1] = temp;
				}
			}
		}
		printSortedArray();
	}

	public void printSortedArray() {
		System.out.print("After sorting: \n");
		for (int i = 0; i < elements.length; i++)
			System.out.print(elements[i] + "\n");
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// read data from the file
		ReadFile read = new ReadFile();
		ArrayList<String> dataArray = read.readFile();

		// convert the arraylist into array to pass it to the generic class
		Integer[] array = new Integer[dataArray.size()];
		array = dataArray.toArray(array);

		// call the bubble sort method
		BubbleSortImplementation bubbleSort = new BubbleSortImplementation(array);
		bubbleSort.sort();
	}

}
