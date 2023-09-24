package com.bhoopesh.service;

public class MergeSort {

	
	public void sort(int[] array, int left, int right) {
		if(left < right) {
			//find the middle element
			int mid = (left + right) /2;
			
			//sort the left sub array
			sort(array, left, mid);
			
			//sort the right sub array
			sort(array, mid+1, right); 
			
			//merge the sorted left and right sub arrays
			merge(array, left, mid, right);
		}

	}

	private void merge(int[] array, int left, int mid, int right) {
		
		//find the size of two sub arrays to be merged
		int n1 = mid - left + 1; 
		int n2 = right - mid;
		
		//create temp arrays
		int leftArray[] = new int[n1];  // 2
		int rightArray[] = new int[n2]; // 2
		
		//copy data to temp arrays
		for(int i = 0 ; i < n1; i++)
			leftArray[i] = array[left + i];
		for(int j = 0; j < n2; j++)
			rightArray[j] = array[mid + 1 + j];
		
		// compare and merge the arrays
		int i = 0, j = 0; // i will point to left array, j will point to right array
		
		int k = left; // point to our original array
		
		while(i < n1 && j < n2) {
			if(leftArray[i] <= rightArray[j]) {
				array[k] = leftArray[i];
				i++;
			}
			else {
				array[k] = rightArray[j];
				j++;
			}
			k++;
		}
		
		
		//copy remaining values of leftArray if any
		while(i < n1) {
			array[k] = leftArray[i];
			i++;
			k++;
		}
		
	
		//copy remaining values of rightArray if any
		while(j < n2) {
			array[k] = rightArray[j];
			j++;
			k++;
		}

		
		
	}

}
