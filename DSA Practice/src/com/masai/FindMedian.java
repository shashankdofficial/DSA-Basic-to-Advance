package com.masai;

import java.util.Arrays;

public class FindMedian {

	public static void main(String[] args) {
		
//		int[] arr = {2,4,1,3,5};
		int[] arr = {2,5,1,7};
		
		Arrays.sort(arr);
		
		int n = arr.length;
		
		if(n%2 == 0) {
			int a = (n/2)-1;
			int b = (n/2);
			
			System.out.println((double)(arr[a]+arr[b])/2);
		}
		else {
			System.out.println(arr[n/2]);
		}
	}

}
