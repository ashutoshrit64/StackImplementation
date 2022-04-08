package com.bridgelabz.linkedlist.stack;

public class QueueImplementation {
	Node front,rear;
	
	public QueueImplementation() {
		this.front=null;
		this.rear=null;
	}
	
	public void enqueue(int key) {
		Node node =new Node();
		node.setData(key);
		if(this.rear==null) {
			this.rear=this.front=node;
			return;
		}
		this.rear.setNext(node);
		this.rear=node;
		
		
	}
	
	public void dequeue() {
		if(this.front==null) {
			System.out.println("queue is empty");
		}
		else {
			
			front=front.getNext();
			if(front==null) {
				front=rear=null;
			}
		}
	}

}
