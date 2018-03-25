package vesy.com.algo;

public class LinkedList {
	
	private Node head;
	private Node tail;
	
	public LinkedList() {
		this.head = new Node ("head");
		tail = head;
	}
	
	static class Node {
		String data;
		Node next;
		
		public Node (String data) {
			
			this.data = data;
		}
	}
	
	public Node head(){
        return head;
    }
	
	public void add (Node node) {
		tail.next = node;
		tail = node; 
	}

}
