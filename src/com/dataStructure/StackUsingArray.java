package com.dataStructure;

public class StackUsingArray {
	
	// Below are the methods which we will be implementing as part of this
	int size;
	int arr[];
	int top;
	
	public StackUsingArray(int size) {
		this.size=size;
		this.arr=new int[size];
		this.top=-1;
	}
	
	public void push(int element){
		if(!this.isFull()){
			top++;
			arr[top]=element;
			System.out.println("Pushed element is " + element);
		}else{
			System.out.println("stack is full now");
		}
	}
	
	public int  pop(){
		if(!this.isEmpty()){
			int returnedVal=top;
			top--;
			System.out.println("Popped value is " + arr[returnedVal]);
			return arr[returnedVal];
		}else{
			System.out.println("Stack is Empty");
			return -1;
		}
	}
	
	
	public int peek(){
		if(!this.isEmpty()){
			System.out.println("Peek Value is " +arr[top]);
			return arr[top];
		}else{
			System.out.println("Stack is empty");
			return -1;
		}
	}
	
	public Boolean isEmpty(){
		return (top==-1);
	}
	
	public Boolean isFull(){
		return (size-1==top);
	}
	

	public static void main(String[] args) {
		StackUsingArray stack= new StackUsingArray(10);
		stack.pop();
		System.out.println("-----------------------------------");
		
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		
		System.out.println("-----------------------------------");
		
		stack.pop();
		
		System.out.println("-----------------------------------");
		
		stack.peek();
		
		System.out.println("-----------------------------------");
		
		System.out.println("stack is empty :"+stack.isEmpty());
		
		System.out.println("-----------------------------------");
		
		System.out.println("stack is Full :"+stack.isFull());
		
	}

}
