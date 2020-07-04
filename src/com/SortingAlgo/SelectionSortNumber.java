package com.SortingAlgo;

public class SelectionSortNumber {

	public static void main(String[] args) {
		
		int a[]={36,19,12,5,29,8};
		int min;
		int temp;
		for(int i=0; i<a.length;i++){
			min=i;
			for(int j=i+1; j<a.length;j++){
				if(a[min]>a[j]){
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
