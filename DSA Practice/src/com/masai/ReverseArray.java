package com.masai;

public class ReverseArray {

	public static void main(String[] args) {
		int N = 5;
		int arr[] = {5,4,3,2,1};
		
		int[] ans = new int[N];
		for(int i=N-1; i>=0; i--) {
			ans[N-i-1] = arr[i];
		}
		
		for(int i=0; i<N; i++) {
			System.out.print(ans[i]+" ");
		}
	}

}
