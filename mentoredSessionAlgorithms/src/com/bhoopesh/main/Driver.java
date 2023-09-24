package com.bhoopesh.main;

import java.util.Scanner;

import com.bhoopesh.service.ArrayRotation;
import com.bhoopesh.service.MergeSort;
import com.bhoopesh.service.ModifiedBinarySearch;

public class Driver {

	public static void main(String[] args) {
		
		
		
		System.out.println("Enter the size of array");
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt(); // size contains size of input array
		
		
		System.out.println("Enter the " + size + " input elements");
		
		int array[] = new int[size]; // input array of size that is entered by user
		
		for(int i = 0 ; i < size ; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println("Original array is : ");
		for(int i = 0; i < size; i++)
			System.out.print(array[i] + " ");
		
		
		MergeSort mergeSort = new MergeSort();
		
		mergeSort.sort(array, 0, array.length-1);
		
		System.out.println("\n-------------------------");
		System.out.println("Array after sorting is : ");
		for(int i = 0; i < size; i++)
			System.out.print(array[i] + " ");
		
		
		int midElement = array.length/2;
		ArrayRotation arrayRotation = new ArrayRotation();
		
		arrayRotation.leftRotate(array, midElement,array.length);
		
		System.out.println("\n\nArray after rotation is : ");
		for(int i = 0; i < size; i++)
			System.out.print(array[i] + " ");
		
		System.out.println("\n");
		
		System.out.println("Enter the key ");
		int key = sc.nextInt();
		
		ModifiedBinarySearch modifiedBinarySearch = new ModifiedBinarySearch();
		int index = modifiedBinarySearch.search(array, size, key);
		
		if(index == -1)
			System.out.println("Element not present");
		else
			System.out.println("Key is present at index : " + index);
		
		
	}

}
