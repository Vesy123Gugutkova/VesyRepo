package vesy.com.algo;

public class SingleLInkedLIst {
	
	private Node head;
	private Node tail;
	
	static class Node { 
		private Node next; 
		private String data; 
		
		public Node(String data) { 
			this.data = data; 
		} 
		
		@Override 
		public String toString() { 
				return data.toString(); 
		} 
	}

	
	public void append(String data) {
		if (head == null) { 
			head = new Node(data); 
			return; 
		} 
		
		tail.next = new Node (data);
		tail = tail.next;
	}

	
	
}
