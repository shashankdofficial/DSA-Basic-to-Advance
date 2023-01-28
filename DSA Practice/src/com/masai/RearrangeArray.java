package com.masai;

//Rearrange the array such that the first half is arranged in increasing order, 
//and the second half is arranged in decreasing order

public class RearrangeArray {

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void main(String[] args) {
		
		int[] arr = {8, 7, 1, 6, 5, 9};
		
		//For first half
		for(int i=0; i<arr.length/2; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] < arr[i]) {
					swap(arr, i, j);
				}
			}
		}
		//For second half
		for(int i=arr.length/2; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] > arr[i]) {
					swap(arr, i, j);
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
