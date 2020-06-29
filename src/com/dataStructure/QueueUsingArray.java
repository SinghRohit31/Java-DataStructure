package com.dataStructure;

public class QueueUsingArray {

	int size;
	int front;
	int rear;
	int currentSize;
	int queue[];
	
	public QueueUsingArray(int size) {
		this.size=size;
		this.queue= new int[this.size];
		this.rear=-1;
		this.front=0;
	}
	
	public void dequeue(){
		if(isEmpty()){
			System.out.println("Queue is empty..can not delete element");
		}else{
			front++;
			if(front==size-1){
				System.out.println("data removed is : " +queue[front-1]);
				front=0;
			}else{
				System.out.println("data removed is: " +queue[front-1]);
			}
		}
		currentSize--;
	}
	
	
	
	
	public void enqueue(int Value){
		if(isFull()){
			System.out.println("Stack is Full");
		}
		rear++;
		if(rear==size-1){
			rear=0;
		}
		queue[rear]=Value;
		currentSize++;
		System.out.println(Value + "  : Added to queue");
	}
	
	
	public boolean isFull(){
		if(currentSize==size){
			System.out.println("stack is full");
			return true;
		}
		return false;
	}
	
	public boolean isEmpty(){
		if(currentSize==0){
			System.out.println("Stack is empty");
			return true;
		}
		return false;
	}
	
	
	
	
	
	public static void main(String[] args) {
		QueueUsingArray queue= new QueueUsingArray(10);
		queue.enqueue(100);
		queue.enqueue(200);
		queue.enqueue(300);
		
		queue.dequeue();
		
		queue.dequeue();
	}

}
