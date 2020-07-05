package com.SearchAlgo;

public class LinearSearchNumber {

	public static void main(String[] args) {
		int a[]={36,19,12,5,29,8};
		
		int search=19;
		int temp=0;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]==search){
				System.out.println("Number is Present at " +i+" Position" );
				temp=temp+1;
			}
		}
		
		if(temp==0){
			System.out.println("Element Not found in the list");
		}
		
		
		
		

	}

}
