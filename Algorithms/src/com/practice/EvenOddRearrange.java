package com.practice;

import java.util.*;

public class EvenOddRearrange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		rearrange(arr);
		for(int x: arr) {
			System.out.print(x + " ");
		}
	}

	private static void rearrange(int[] arr) {

		  List<Integer> even = new ArrayList<>();
		  List<Integer> odd = new ArrayList<>();

		  for(int num : arr) {
		    if(num % 2 == 0) {
		      even.add(num);
		    } else {
		      odd.add(num);
		    }
		  }

		  Collections.sort(even);
		  Collections.sort(odd);

		  int i = 0, j = 0;
		  for(int k = 0; k < arr.length; k++) {
		    if(k % 2 == 0) {
		      arr[k] =  even.get(i++); 
		    } else {
		      arr[k] =  odd.get(j++);
		    }
		  }

	}
	
}
