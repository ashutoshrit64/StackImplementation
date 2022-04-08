package com.bridgelabz.linkedlist.stack;

import static java.lang.System.exit;


public class StackImplementation {
	
	Node top;
	int size;
	
	public StackImplementation() {
		this.top=null;
	}
	
	public void push(int key) {
		Node node=new Node();
		if(top==null) {
			System.out.println("Heap is overflow");
		}
		node.setData(key);
		node.setNext(top);
		top=node;
		size++;
		
	}
	
	

	
	public void display() {
		if(top==null) {
			System.out.println("stack is empty");
		}
		else {
			Node intial=top;
			while(intial!=null) {
				System.out.println(intial.getData());
				intial=intial.getNext();
			}
		}
	}

	
	
	public void pop() {
		if(top==null) {
			System.out.println("stack is empty");
		}
		else {
			top=top.getNext();
			size--;
		}
	}
	
	public boolean isEmpty() {
		if(top==null)
			return true;
		return false;
		
	}
	
	public int peek() {
		if(!isEmpty()) {
			return top.getData();
		}
		else {
			System.out.println("stack is empty");
			return 0;
		}
	}

}
