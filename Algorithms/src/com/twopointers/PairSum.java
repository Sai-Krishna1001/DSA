package com.twopointers;

public class PairSum {
	public static void main(String[] args) {
		int[] nums = {2, 5, 7, 8, 9, 11, 15}; 
		int target = 17;

		Pair<Integer, Integer> result = PairSum.findPair(nums, target);

		if (result != null) {
		  System.out.println("Pair found: " + result.getFirst() + ", " + result.getSecond());
		} else {
		  System.out.println("Pair not found"); 
		}
	}
	public static Pair<Integer, Integer> findPair(int[] nums, int target){
		int left = 0;
		int right = nums.length - 1;
		while(left < right) {
			int currentSum = nums[left] + nums[right];
			if(currentSum == target) {
				return new Pair<>(nums[left], nums[right]);
			}else if(currentSum < target) {
				left++;
			}else {
				right--;
			}
		}
		return null;
	}
}
