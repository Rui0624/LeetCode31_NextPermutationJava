import java.util.ArrayList;
import java.util.Collections;  


public class Solution {
	public static void main(String args[]){
		int[] nums = {1, 2, 3};
		nextPermutation(nums);
		for(int i = 0; i < nums.length; i++){
			System.out.println(nums[i]);
		}
	}
	public static void nextPermutation(int[] nums) {
        int i, j, n = nums.length;
        
        for(i = n - 2; i >= 0; i--){
        	if(nums[i + 1] > nums[i]){
        		for(j = n - 1; j >= i; j--){
        			if(nums[j] > nums[i]){
        				break;
        			}
        		}
        		
        		/*
        		int tmp = nums[j];
        		nums[j] = nums[i];
        		nums[i] = tmp;
        		*/
        		swap(nums, i, j);
        		reverse(nums, i + 1, n - 1);
        		return;
        	}
        }
        
        reverse(nums, 0, n - 1);
    }

	private static void reverse(int[] nums, int i, int j) {
		while(i < j){
			swap(nums, i, j);
			i++;
			j--;
		}
	}

	public static void swap(int[] nums, int a, int b) {
		int tmp = nums[a];
		nums[a] = nums[b];
		nums[b] = tmp;
		
	}
}
