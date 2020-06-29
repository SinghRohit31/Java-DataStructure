package com.dataStructureArray;

import java.util.Arrays;

public class SortNumericAndString {

	// https://www.w3resource.com/java-exercises/array/index-test.php
	
	public static void main(String[] args) {
		int[] array1={3,8,5,7,1,9};
		
		System.out.println("Original numeric array : "+Arrays.toString(array1));
	    Arrays.sort(array1);
	    System.out.println("Sorted numeric array : "+Arrays.toString(array1));
	    
	    
	    String[] str={"Rohit", "Mahesh", "Java", "Selenium"};
	    System.out.println("Original numeric array : "+Arrays.toString(str));
	    Arrays.sort(str);
	    System.out.println("Sorted numeric array : "+Arrays.toString(str));
	}

}
