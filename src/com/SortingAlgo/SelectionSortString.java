package com.SortingAlgo;

public class SelectionSortString {
	
	public static void main(String[] args) {
		
		String a[]={"John","Deepak", "Dupa", "Amit","Chahal"};
		int min;
		String temp;
		for(int i=0; i<a.length;i++){
			min=i;
			for(int j=i+1; j<a.length;j++){
				if(a[min].compareTo(a[j])>0){
					min=j;
				}
			}
		temp=a[i];
		a[i]=a[min];
		a[min]=temp;
			
		}
		
	for (int i = 0; i < a.length; i++) {
		System.out.print(" " +a[i]);
	}
		
	}

}
