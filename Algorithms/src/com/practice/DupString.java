package com.practice;

import java.util.*;

public class DupString {
	public static void main(String[] args) {
		String str = "abbbcccc";
//		Scanner sc = new Scanner(System.in);
//		String str = sc.next();
		System.out.println(solve(str));
		
	}
	private static char solve(String str) {
		HashMap<Character, Integer> freq = new HashMap<>();
		for(char ch : str.toCharArray()) {
			freq.put(ch, freq.getOrDefault(ch, 0) + 1);
		}
		int maxVal = 0;
		Character maxChar = null;
		for(Map.Entry<Character, Integer> entry : freq.entrySet()) {
			if(entry.getValue() > maxVal) {
				maxVal = entry.getValue();
				maxChar = entry.getKey();
			}else if(maxVal == entry.getValue()) {
				return '0';
			}
		}
		return maxChar;
	}
}
