package com.bhoopesh.service;

public class ArrayRotation {
	
	/* Function to left rotate array[] of length "size" by element elem */
	public void leftRotate(int array[], int elem, int size) {
		for (int i = 0; i < elem-1; i++)
			leftRotatebyOne(array, size);
	}

	void leftRotatebyOne(int array[], int size) {
		int i, temp;
		temp = array[0];
		for (i = 0; i < size - 1; i++)
			array[i] = array[i + 1];
		array[size - 1] = temp;
	}

}