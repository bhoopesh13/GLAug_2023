package com.greatlearning.tree.service;

import java.util.ArrayList;
import java.util.List;

public class LeastCommonAcestor {
	public Node root;

	private List<Integer> path1 = new ArrayList<Integer>();
	private List<Integer> path2 = new ArrayList<Integer>();

	
	public int findLCA(int node1, int node2) {
		path1.clear();
		path2.clear();
		return findLCAInternal(root, node1, node2);
		
	}
	
	
	private int findLCAInternal(Node root2, int node1, int node2) {
		
		findPath(root, node1, path1); // 10,20, 40
		findPath(root, node2, path2); // 10,20, 50

		if(path1.size() == 0){
			System.out.println("node1 is missing");
			return -1;
		}
		
		if(path2.size() == 0){
			System.out.println("node2 is missing");
			return -1;
		}
			
		int i; 
		for(i = 0; i < path1.size() && i < path2.size(); i++) {
			if(!path1.get(i).equals(path2.get(i)))
				break;
		}
		
		return path1.get(i-1);
	}


	private boolean findPath(Node root, int data, List<Integer> path) {
		
		//base case
		if(root == null)
			return false;
		
		//will store this node
		path.add(root.data); // 10
		
		if(root.data == data) {
			return true;
		}
		
		if(root.left != null && findPath(root.left, data, path)) {
			return true;
		}
		
		if(root.right != null && findPath(root.right, data, path)) {
			return true;
		}
		
		// If not present in subtree, remove root from path and return false
		path.remove(path.size() - 1);
		return false;
	}
}
