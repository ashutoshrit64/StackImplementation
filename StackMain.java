package com.bridgelabz.linkedlist.stack;

public class StackMain {

	public static void main(String[] args) {
		StackImplementation stack=new StackImplementation();
		stack.push(12);
		stack.push(9);
		stack.push(16);
		stack.push(45);
		stack.push(34);
		stack.display();
		int top=stack.peek();
		System.out.println("top element-> "+top);
		stack.pop();
		int newtop=stack.peek();
		System.out.println("top element-> "+newtop);
		stack.push(76);
		stack.push(112);
		stack.display();
		
		

	}

}
