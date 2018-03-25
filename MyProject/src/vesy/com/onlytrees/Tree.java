package vesy.com.onlytrees;

import java.util.ArrayList;

 class Tree<T> {
	
	static class TreeNode<T> {
		private T value;

		private boolean hasParent;

		private ArrayList<TreeNode<T>> children;

		public TreeNode(T value) {
			if (value == null) {
				throw new IllegalArgumentException("Can not insert null");
			}
			this.value = value;
			this.children = new ArrayList<TreeNode<T>>();
		}

		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}

		public int getSize() {
			return this.children.size();
		}
		
		public void addChild (TreeNode<T> child) {
			if (child == null) {
				throw new IllegalArgumentException ("Can not insert null value");
			}
			if (child.hasParent == true) {
				throw new IllegalArgumentException ("Already has a parent");
			}
			
			child.hasParent = true;
			this.children.add(child);
		}
		
		public TreeNode<T> getChild(int index) {
			return this.children.get(index);
		}
		
	}
	
	private TreeNode<T> root;

	public Tree(T value) {
		if (value == null) {
			throw new IllegalArgumentException("Can not insert null value");
		}
		this.root = new TreeNode<T>(value);
	}
	public Tree (T value, Tree<T>... children) {
		this(value);
		
		for (Tree<T> child : children) {
			this.root.addChild(child.root);
		}
	}
	
	public TreeNode<T> getRoot() {
		return this.root;
	}
	
	public ArrayList<TreeNode<T>> getChildNodes () {
		if (root != null) {
			return this.root.children;
		}
		return new ArrayList<TreeNode<T>>();
	}
	
	private void printDFS(TreeNode<T> root, String spaces) {
		if (root == null) {
			return;
		}

		System.out.println(spaces + root.getValue());
		TreeNode<T> child = null;
		for (int i = 0; i < root.getSize(); i++) {
			child = root.getChild(i);
			
			printDFS(child, spaces + " ");
			if (child.getSize() == 2) {
				 System.out.println("---------- The root i need is : " + child.value.toString());
			}
			//System.out.println(child.getSize());
		}
		

	}

	public void printDFS() {
		printDFS(this.root, new String());
	}

}
