package com.arraysExample;

import java.util.Arrays;

public class ParalellArraySorting {
	public static void main(String[] args) {
		int[] arr = { 10, 6, 8, 4, 5, 7, 2, 3 };// create an array
		// iterate array
		System.out.println("array of elements before sorting :");
		for (int i : arr) {

			System.out.println(i + " ");
		}

		// sorting array elements parallel
		Arrays.parallelSort(arr);
		System.out.println("array of elements after sorting :");
		// iterate array of elements
		for (int i : arr) {
			System.out.println(i + " ");
		}
		System.out.println("-----------------");
		// sorting of array by passing Start and End Index
		int[] arr2 = { 9, 5, 3, 6, 1, 4, 8, -2 };// create an array
		System.out.println("array of elements before sorting :");
		// iterate array
		for (int i : arr2) {

			System.out.println(i + " ");
		}
		// sorting array elements parallel and passing start,end index
		Arrays.parallelSort(arr2, 0, 5);
		System.out.println("array of elements after sorting :");
		// iterate array of elements
		for (int i : arr2) {
			System.out.println(i + " ");
		}

	}

}
