package com.bridgelabz.linkedlist.stack;

public class Node {
	private int data;
	private Node next;
	public Node() {
		this.data=0;
		this.next=null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Node(int data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}
	

}
