package com.masai;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] arr = {1,1,2,2,2,3,3};
		
		Set<Integer> set = new HashSet<>();
		
		for(int i=0; i<arr.length; i++) {
			set.add(arr[i]);
		}
		
		for(int x:set) {
			System.out.print(x+" ");
		}
	}

}
