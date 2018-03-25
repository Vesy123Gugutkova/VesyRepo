package com.vesy.linear;

public class DoubleLInkedList<E> {
	private Node head;
	private int size;

	public DoubleLInkedList() {
		size = 0;
	}

	class Node {
		int data;
		Node next;
		Node prev;

		public Node(int data) {
			this.data = data;
		}

	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return (size == 0);
	}
	
	public void addFirst (int newData) {
		Node newNode = new Node (newData);
		
		if (head!= null) {
			head = newNode;
		}
		newNode.next = head;
		newNode.prev = null;
		
		System.out.println("Adding element first..." + newData);
	}
	public void addLast (int newData) {
		Node newNode = new Node (newData);
		
		Node last = head;
		
		if (head == null) {
			newNode.prev = null;
			head = newNode;
			return;
		}
		newNode.next = null;
		while (last.next!= null) {
			last = last.next;
		}
		last.next = newNode;
		newNode.prev = last;
	}
	
	
	
	
	
	
	
	
	
	
	
}
