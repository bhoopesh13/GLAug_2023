package com.greatlearning.queue.main;

import com.greatlearning.queue.service.MinimumTime;

public class Driver {

	public static void main(String[] args) {
		
		// 1. create object
		MinimumTime minimumTime = new MinimumTime();
		
		// 2. Implement the methods
		minimumTime.getData();
		minimumTime.findMinimumTime();
		System.out.println("\nMinimum time needed to deliver all orders is: "+minimumTime.seconds);
	}
}
