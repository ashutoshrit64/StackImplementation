package com.bridgelabz.linkedlist.stack;

public class QueueMain {
	
	public static void main(String[] args) {
	QueueImplementation queueimplementation=new QueueImplementation();
	queueimplementation.enqueue(56);
	queueimplementation.enqueue(45);
	queueimplementation.enqueue(87);
	queueimplementation.enqueue(96);
	queueimplementation.dequeue();
	
	System.out.println(queueimplementation.front.getData());
	System.out.println(queueimplementation.rear.getData());
	
	
	}

}
