package com.SearchAlgo;

public class BinarySearchString {

	public static void main(String[] args) {
		String a[]={"Amit","Chahal", "Deepak", "Dupa","Xoxo"};
		
		String search="Xoxo1";
		int lower=0;
		int higher=a.length-1;
		
		int med=(lower+higher)/2;
		
		while(lower<=higher){
		if(a[med].equals(search)){
			System.out.println("Number is Present at " + med +" Position" );
			break;
		}else if (a[med].compareTo(search)<0) {
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

