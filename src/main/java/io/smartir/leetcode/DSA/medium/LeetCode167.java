package io.smartir.leetcode.DSA.medium;

import java.util.Arrays;

public class LeetCode167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                result[0] = ++left;
                result[1] = ++right;
                break;
            }
            if (numbers[left]+numbers[right] > target) right--;
            else if (numbers[left]+numbers[right] < target) left++;
        }
        return result;
    }
}
