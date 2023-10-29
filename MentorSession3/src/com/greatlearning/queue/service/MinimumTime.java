package com.greatlearning.queue.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MinimumTime {
	
	Scanner sc = new Scanner(System.in);
	
	
	public int seconds;
	PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());

	//get the data from the user and add to queue
	public void getData() {
		System.out.println("Total number of orders of mango milkshake");
		queue.add(sc.nextInt());
		
		System.out.println("Total number of orders of orange milkshake");
		queue.add(sc.nextInt());
		
		System.out.println("Total number of orders of pineapple milkshake");
		queue.add(sc.nextInt());
	}

	public void findMinimumTime() {
		Iterator<Integer> list = queue.iterator();
		
		
		while(!queue.isEmpty()) {
			int val1 = 0, val2 = 0;
			
			//get top2 priority values from this queue
			if(list.hasNext())
				val1 = queue.remove(); 
			if(list.hasNext())
				val2 = queue.remove();
			
			if(val1 > 0 && val2 > 0) {
				val1--; 
				val2--; 
				seconds++; 
			}
			else if(val1 > 0) {
				seconds = seconds + val1;
				break;
			}
			
			if(val1 > 0)
				queue.add(val1);
			if(val2 > 0)
				queue.add(val2);
			
		}
	}

}
