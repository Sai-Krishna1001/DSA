package com.practice;

import java.util.*;

public class ShiftKpositions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//input
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int d = sc.nextInt();
		
		//logic
		for(int i=0; i<n; i++) {
			int index = i+d;
			if(index >= n) {
				index = index-n;
			}
			System.out.print(arr[index] +  " "); 
		}
		
	}
}
