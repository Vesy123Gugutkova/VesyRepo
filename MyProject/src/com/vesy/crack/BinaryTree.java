package com.vesy.crack;

import java.util.Stack;

public class BinaryTree {
	Node root;
	
	void inorder () {
		Stack <Node> stack = new Stack<Node> ();
		Node node = root;
		
		if (root == null) {
			return;
		}
		
		while (node!=null) {
			stack.push(node);
			node = node.left;
		}
		
		while (stack.size() > 0) {
			node = stack.pop();
			System.out.print(node.data);
			if (node.right != null) {
				node = node.right;
				
				while (node != null) {
					stack.push(node);
					node = node.left;
				}
			
			}
		}
	}
	
	
	
	public static void main (String [] args) {
		BinaryTree tree = new BinaryTree ();
		
		tree.root = new Node(1);
		tree.root.left = new Node (2);
		tree.root.right = new Node (3);
		
		tree.root.left.left = new Node (4);
		tree.root.left.right = new Node (5);
		tree.inorder();
		
		
	}
 
}
