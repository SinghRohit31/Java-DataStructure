package com.dataStructureArray;

public class SumArray {

	public static void main(String[] args) {
		int sum=0;
		int[] array1={3,8,5,7,1,9};
		
		for (int i : array1) {
			sum=sum+i;
		}
		System.out.println("Sum of Array is " +sum);

	}

}
