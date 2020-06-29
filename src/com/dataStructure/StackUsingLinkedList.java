package com.dataStructure;

import javax.xml.soap.*;

public class StackUsingLinkedList {

	public Node head;

	class Node {
		int value;
		Node next;
	}

	public StackUsingLinkedList() {
		head = null;
	}

	public void push(int Value) {
		Node extrahead = head;    /// here head=null and extrahead=null
		head = new Node();   // created new node
		head.value = Value;  //assigns value to head , so here head would be value which you have provided
		head.next = extrahead;   //
		System.out.println("Value added in stack : " + head.value);
	}

	public void getAllElements(Node head){
		Node temp=head;
		while(temp!=null){
			System.out.println("Element is " + temp.value);
			temp=temp.next;
		}
		
	}
	
	public int pop() {
		if (head == null) {
			System.out.println("stack is empty");
		}

		int val = head.value;
		head = head.next;
		return val;
	}

	public static void main(String[] args) {
		StackUsingLinkedList list= new StackUsingLinkedList();
	//	System.out.println(list.pop());
		
		list.push(100);
		list.push(200);
		list.push(300);
		list.push(400);
		
		System.out.println("Element removed from stack is :"+ list.pop());
		
		list.getAllElements(list.head);
	}

}
