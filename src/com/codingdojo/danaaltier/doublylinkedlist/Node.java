package com.codingdojo.danaaltier.doublylinkedlist;

public class Node {
	
	// Attributes
	public Integer value;
	public Node previous;
	public Node next;
	
	
	// Constructor
	public Node(Integer val) {
		this.value = val;
		this.previous = null;
		this.next = null;
	}
	
	
	// Methods
	public boolean isPalindrome() {
		int temp = this.value;
		int remainder, reverse = 0;
		while (temp > 0) {
			remainder = temp % 10;
			reverse = (reverse * 10) + remainder;
			temp = temp / 10;
		}
		if (this.value == reverse) {
			return true;
		}
		return false;
	}
}
