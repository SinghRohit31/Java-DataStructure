package com.SearchAlgo;

public class BinarySearch {

	public static void main(String[] args) {
		// Limitation of Binary Search is that element should be in sorted order
		
		int a[]={2,5,7,8,9,11,45,56,67,78,99};
		
		int search=99;
		int lower=0;
		int higher=a.length-1;
		
		int med=(lower+higher)/2;
		
		while(lower<=higher){
		if(a[med]==search){
			System.out.println("Number is Present at " + med +" Position" );
			break;
		}else if (a[med]<search) {
			lower=med+1;
		}else{
			higher=med-1;
		}
		med=(lower+higher)/2;
	}
		if(lower>higher){
			System.out.println("Element Not found in the list");
		}
	}

}
