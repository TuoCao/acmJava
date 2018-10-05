package com.ct;

import java.util.Arrays;

/**
 * @ Author     ：Cao Tuo
 * @ Date       ：Created in 14:53 2018/10/5
 * @ Description：LeetCode-189. Rotate Array
 */
public class RotateArray {

    public static void main(String[] args){
        RotateArray rotateArray = new RotateArray();
        int[] nums = {1,2,3,4,5,6,7};
        int k = 2;
        rotateArray.rotate_V2(nums,k);
        System.out.println(Arrays.toString(nums));
    }

    // with O(n) space complexity
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        int[] temp = Arrays.copyOf(nums,nums.length);
        for(int i=0;i<nums.length;i++){
            nums[i] = temp[(i-k+nums.length)%nums.length];
        }
    }

    // with O(1） space complexity
    public void rotate_V2(int[] nums, int k) {
        k = k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    public void reverse(int[] nums,int start,int end){
        int i = start;
        int j = end;
        while(i < j){
            int temp = nums[i];
            nums[i++] = nums[j];
            nums[j--] = temp;
        }
    }
}
