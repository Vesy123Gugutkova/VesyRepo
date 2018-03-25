package com.vesy.linear;

public class DynamicList {

	public DynamicList() {
		this.head = null;
		this.tail = null;
		this.count = 0;
	}

	private class Node {
		Object element;
		Node next;

		Node(Object element, Node prevNode) {
			this.element = element;
			prevNode.next = this;
		}

		Node(Object element) {
			this.element = element;
			next = null;
		}

	}

	private Node head;
	private Node tail;
	private int count;
	
	public void add(Object item) {
		if (head == null) {
			head = new Node(item);
			tail = head;
		} else {
			Node newNode = new Node(item, tail);
			tail = newNode;
		}
		count++;
	}
	
	public Object remove(int index) {
		if (index >= count || index < 0) {
			throw new IndexOutOfBoundsException("Invalid index: " + index);
		}

		int currentIndex = 0;
		Node currentNode = head;
		Node prevNode = null;
		while (currentIndex < index) {
			prevNode = currentNode;
			currentNode = currentNode.next;
			currentIndex++;
		}
		count--;
		if (count == 0) {
			head = null;
			tail = null;
		} else if (prevNode == null) {
			head = currentNode.next;
		} else {
			prevNode.next = currentNode.next;
		}

		return currentNode.element;

	}
	
	public int remove(Object item) {
		int currentIndex = 0;
		Node currentNode = head;
		Node prevNode = null;
		while (currentNode != null) {
			if (currentNode.element != null && currentNode.element.equals(item)
					|| (currentNode.element == null) && (item == null)) {
				break;
			}
			prevNode = currentNode;
			currentNode = currentNode.next;
			currentIndex++;
		}
		if (currentNode != null) {
			count--;

			if (count == 0) {
				head = null;
				tail = null;

			} else if (prevNode == null) {
				head = currentNode.next;
			} else {
				prevNode.next = currentNode.next;
			}
			return currentIndex;
		} else {
			return -1;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
