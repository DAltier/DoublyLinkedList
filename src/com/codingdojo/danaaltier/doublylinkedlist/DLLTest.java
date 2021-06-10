package com.codingdojo.danaaltier.doublylinkedlist;

public class DLLTest {

	public static void main(String[] args) {
		
		DLL dll = new DLL();
		
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		Node n4 = new Node(40);
		Node n5 = new Node(50);
		Node n6 = new Node(60);
		Node n7 = new Node(70);
		Node n8 = new Node(80);
		Node n9 = new Node(90);
		Node n10 = new Node(100);
		
		
		dll.push(n1);
		dll.push(n2);
		dll.push(n3);
		dll.push(n4);
		dll.push(n5);
		dll.push(n6);
		dll.push(n7);
		dll.push(n8);
		dll.push(n9);
		dll.push(n10);
		
		
		System.out.println("------ Printing list items forward ------");
		dll.printValuesForward();
		System.out.println();
		
		System.out.println("------ Printing list items backward ------");
		dll.printValuesBackward();
		System.out.println();
		
		System.out.println("------ Removing the last node in the list ------");
		System.out.println("Node removed: " + dll.pop().value);
		dll.printValuesForward();
		System.out.println();
		
		
		System.out.println("------ List contains value ------");
		System.out.println(dll.contains(50));
		System.out.println(dll.contains(22));
		System.out.println();
		
		System.out.println("------ List size ------");
		System.out.println(dll.size());
		System.out.println();
		
		System.out.println("------ Insert new node at index ------");
		Node n11 = new Node(55);
		dll.insertAt(n11, 3);
		dll.printValuesForward();
		System.out.println();
		
		System.out.println("------ Remode node at index ------");
		dll.removeAt(7);
		dll.printValuesForward();
		System.out.println();
		
		System.out.println("------ Is Palindrome ------");
		System.out.println(n11.value + " is Palindrome? " + n11.isPalindrome());
		System.out.println(n1.value + " is Palindrome? " + n1.isPalindrome());
		
	}

}
