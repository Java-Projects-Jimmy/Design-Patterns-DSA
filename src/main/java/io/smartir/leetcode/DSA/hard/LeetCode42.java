package io.smartir.leetcode.DSA.hard;

public class LeetCode42 {
    public int trap(int[] height) {
        int left[] = new int[height.length];
        int right[] = new int[height.length];
        int total=0;
        left[0]=height[0];
        for(int i=1;i<height.length;i++){
            left[i]=Math.max(left[i-1],height[i]);
        }
        right[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            right[i]=Math.max(right[i+1],height[i]);
        }
        for(int i=0;i<height.length;i++){
            int ans = Math.min(left[i],right[i]);
            total = total+ans-height[i];
        }
        return total;
    }

}
