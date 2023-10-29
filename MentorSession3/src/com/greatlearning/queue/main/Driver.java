package com.greatlearning.queue.main;

import com.greatlearning.queue.service.MinimumTime;

public class Driver {
	
	public static void main(String[] args) {
		
		MinimumTime  minimumTime = new MinimumTime();
		
		//get data from user
		minimumTime.getData();
		
		minimumTime.findMinimumTime();
		System.out.println("\n Mininum time needed to deliver all order is : " + minimumTime.seconds);
	}

}
