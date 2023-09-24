package com.bhoopesh.service;

public class ArrayRotation {

	public void leftRotate(int[] array, int midElement, int length) {
	
		for(int i = 0; i < midElement; i++)
			leftRotateByOne(array, length);
		
	}

	private void leftRotateByOne(int[] array, int length) {
		int i , temp;
		temp = array[0];
		for(i = 0; i < length - 1; i++)
			array[i] = array[i+1];
		
		array[length- 1] = temp;
		
	}

}
