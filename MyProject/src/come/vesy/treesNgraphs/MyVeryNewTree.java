package come.vesy.treesNgraphs;

import java.util.ArrayList;

public class MyVeryNewTree<T> {

	static class MyNewTreeNode<T> {

		private boolean hasParent;
		private T value;

		private ArrayList<MyNewTreeNode<T>> children;


		public MyNewTreeNode(T value) {
			if (value == null) {
				throw new IllegalArgumentException("Can not insert null value");
			}
			this.value = value;
			this.children = new ArrayList<MyNewTreeNode<T>>();
		}

		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}

		public void addChild(MyNewTreeNode<T> child) {
			if (child == null) {
				throw new IllegalArgumentException("Can not insert null value");
			}
			if (hasParent == true) {
				throw new IllegalArgumentException("It has already a parent");
			}
			hasParent = true;
			this.children.add(child);

		}

		public MyNewTreeNode<T> getChild(int index) {
			return this.children.get(index);
		}

		public int getSize() {
			return this.children.size();
		}
		
	}
	private MyNewTreeNode<T> root;
	
	public MyVeryNewTree(T value) {
		if (value == null) {
			throw new IllegalArgumentException ("Value can not be null");
		}
		
		this.root = new MyNewTreeNode<T>(value);
	}
	
	public MyVeryNewTree(T value,MyVeryNewTree<T>... children  ) {
		this(value);
		
		for (MyVeryNewTree child : children) {
			this.root.addChild(child.root);
		}
	}
	
	public MyNewTreeNode<T> getRoot () {
		return this.root;
	}
	
	public ArrayList<MyNewTreeNode<T>> getChildNodes() {
		if (this.root != null) {
			return this.root.children;
		}
		return new ArrayList<MyNewTreeNode<T>>();
	}
	
	private void printDFS(MyNewTreeNode<T> root, String spaces) {
		if (root == null) {
			return;
		}
		int value = 14;
		int count = 0;
		System.out.println(spaces + root.getValue());
		System.out.println("Counter ");
		MyNewTreeNode<T> child = null;
		for (int i = 0; i < root.getSize(); i++) {
			child = root.getChild(i);
			if (child.value == "14") {
				count ++;
			}
			printDFS(child, spaces + " ");
		}
		
		
	}
	
	public void printDFS() {
		this.printDFS(this.root, new String());
	}

}
