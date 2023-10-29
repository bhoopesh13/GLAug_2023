package com.greatlearning.tree.main;

import com.greatlearning.tree.service.LeastCommonAcestor;
import com.greatlearning.tree.service.Node;

public class Driver {

	public static void main(String[] args) {
		LeastCommonAcestor tree = new LeastCommonAcestor();
		tree.root = new Node(10);
		tree.root.left = new Node(20);
		tree.root.right = new Node(30);
		
		tree.root.left.left = new Node(40);
		tree.root.left.right = new Node(50);
		
		tree.root.right.left = new Node(60);
		tree.root.right.right = new Node(70);

	
		System.out.println("Lowest common acestor (20, 30) " + tree.findLCA(20,30));
		System.out.println("Lowest common acestor (40, 30) " + tree.findLCA(40,30));
		System.out.println("Lowest common acestor (60, 70) " + tree.findLCA(60,70));
		System.out.println("Lowest common acestor (20, 40) " + tree.findLCA(20,40));
		
		System.out.println("Lowest common acestor (10, 60) " + tree.findLCA(10,60));

		
		int value = tree.findLCA(50,90);
		if(value != -1)
		{
			System.out.println("Lowest common acestor (50, 90) " + value);
		}


		
	}

}
