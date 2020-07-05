package com.SearchAlgo;

public class LinearSearchString {

	public static void main(String[] args) {
		String a[]={"John","Deepak", "Dupa", "Amit","Chahal"};
		
		String search="Chahal";
		int temp=0;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i].equals(search)){
				System.out.println("String is Present at " +i+" Position" );
				temp=temp+1;
			}
		}
		
		if(temp==0){
			System.out.println("Element Not found in the list");
		}

	}

}
