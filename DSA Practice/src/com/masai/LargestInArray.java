package com.masai;

public class LargestInArray {

	public static void main(String[] args) {
		int[] arr = {2,5,1,3,0};
		int max = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		System.out.println(max);
	}

}
