package com.francisco.tareau4;

import java.util.Arrays;

public class UtilesDeArrays {

	public static void main(String[] args) {
		
		int [] arr1 = {5, 3, 4, 1};
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		int[] arr2 = {1, 3, 4, 5};
		int[] arr3 = {5, 3, 4, 1};
		
		
		System.out.println("");
		int index = Arrays.binarySearch(arr2, 3);
		System.out.println(index);
		
		index = Arrays.binarySearch(arr3, 1);
		System.out.println(index);
	
		
		System.out.println("");
		boolean result = Arrays.equals(arr1, arr2);
		System.out.println(result);
		
		result = Arrays.equals(arr1, arr3);
		System.out.println(result);

		System.out.println("");
		int [] arr4 = new int [5];
		Arrays.fill(arr4, 10);
		System.out.println(Arrays.toString(arr4));
		
		System.out.println("");
		int [] arrCorto = Arrays.copyOf(arr4, 3);
		System.out.println(Arrays.toString(arrCorto));
		
		int [] arrLargo = Arrays.copyOf(arr4, 10);
		System.out.println(Arrays.toString(arrLargo));

	}

	
}

