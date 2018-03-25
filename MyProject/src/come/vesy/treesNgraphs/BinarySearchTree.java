package come.vesy.treesNgraphs;

public class BinarySearchTree<T extends Comparable> {
	
	
	private static class BinaryTreeNode<T extends Comparable<T>> implements Comparable<BinaryTreeNode<T>>{
		T value;
		
		BinaryTreeNode<T> parent;
		BinaryTreeNode leftChild;
		BinaryTreeNode rightChild;
		
		
		public BinaryTreeNode (T value) {
			this.value = value;
			
			this.parent = null;
			this.leftChild = null;
			this.rightChild = null;
		}
		
		public String toString () {
			return this.value.toString();
		}
		
		public int hashCode () {
			return this.value.hashCode();
		}
		public boolean equals (Object obj) {
			BinaryTreeNode other = (BinaryTreeNode) obj;
			return this.compareTo(other) == 0;
		}
		public int compareTo(BinaryTreeNode<T> other) {
			return this.value.compareTo(other.value);
		}
	}
	private BinaryTreeNode root;
	
	public BinarySearchTree () {
		this.root = null;
	}
	
	public void insert (T value) {
		if (value == null) {
			throw new IllegalArgumentException ();
		}
		this.root = insert (value, null, root);
	}
	private BinaryTreeNode insert(T value,BinaryTreeNode parentNode, BinaryTreeNode node ){
		if (node == null) {
			node = new BinaryTreeNode(value);
			node.parent = parentNode;
		} else {
			int compareTo = value.compareTo(node.value);
			if (compareTo < 0) {
				node.leftChild = insert(value, node, node.leftChild);
			} else if (compareTo > 0) {
				node.rightChild = insert(value, node, node.rightChild);
			}
		}
		return node;
	}
	
	private BinaryTreeNode find (T value){
		BinaryTreeNode node = this.root;
		
		while (node != null) {
			int compareTo = value.compareTo(node.value);
			if (compareTo < 0) {
				node = node.leftChild;
			} else if (compareTo > 0) {
				node = node.rightChild;
			} else {
				break;
			}
		}
		
		return node;
	}
	
	
	
	

}
