package com.codingdojo.danaaltier.doublylinkedlist;

public class DLL {
	
	// Attributes
	public Node head;
	public Node tail;
	
	
	// Constructor
	public DLL() {
		this.head = null;
		this.tail = null;
	}
	
	
	// Methods
	public void push(Node newNode) {
		if (this.head == null) {
			this.head = newNode;
			this.tail = newNode;
		} else {
			Node last = this.tail;
			last.next = newNode;
			newNode.previous = last;
			this.tail = newNode;
		}
	}
	
	
	public void printValuesForward() {
		Node runner = this.head;
		while (runner != null) {
			System.out.println(runner.value);
			runner = runner.next;
		}
	}
	
	
	public void printValuesBackward() {
		Node runner = this.tail;
		while (runner != null) {
			System.out.println(runner.value);
			runner = runner.previous;
		}
	}
	
	
	public Node pop() {
		if (this.tail == null) {
			System.out.println("List is empty");
		}
		Node last = this.tail;
		this.tail = last.previous;
		this.tail.next = null;
		return last;
	}
	
	
	public boolean contains(Integer value) {
		if (this.tail == null) {
			System.out.println("List is empty");
		} else {
			Node runner = this.head;
			while (runner != null) {
				if (runner.value == value) {
					return true;
				}
				runner = runner.next;
			}
		}
		return false;
	}
	
	
	public int size() {
		int size = 0;
		if (this.tail == null) {
			System.out.println("List is empty");
		} else {
			Node runner = this.head;
			while (runner != null) {
				size++;
				runner = runner.next;
			}
		}
		return size;
	}
	
	
	public void insertAt(Node newNode, int index) {
		if (index > this.size()) {
			System.out.println("Index out of bounds");
		} else {
			int i = 0;
			Node runner = this.head;
			while (i < index - 1) {
				runner = runner.next;
				i++;
			}
			newNode.next = runner.next;
			runner.next = newNode;
			newNode.previous = runner;
			if (newNode.next != null) {
				newNode.next.previous = newNode;
			}
		}
	}
	
	
	public void deleteNode(Node toDelete) {
		if (this.head == null || toDelete == null) {
			return;
		}
		if (this.head == toDelete) {
			this.head = toDelete.next;
		}
		if (toDelete.next != null) {
			toDelete.next.previous = toDelete.previous;
		}
		if (toDelete.previous != null) {
			toDelete.previous.next = toDelete.next;
		}
		toDelete = null;
	}
	
	
	public void removeAt(int index) {
		if (head == null || index <= 0) {
			return;
		}
		Node runner = this.head;
		for (int i = 1; runner != null && i <= index; i++) {
			runner = runner.next;
		}
		if (runner == null) {
			return;
		}
		deleteNode(runner);
	}
}
