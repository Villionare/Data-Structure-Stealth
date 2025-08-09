package com.DsaPlaylist.Assignments;

//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/description/
    class Solution {
        public int subtractProductAndSum(int n) {
            int sum = 0;
            int product = 1;

            while(n!=0){
                int remainder = n%10;
                sum += remainder;
                product *= remainder;
                n /= 10;
            }

            return (product-sum);
        }
    }

public class LeetCode_1281 {


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.subtractProductAndSum(5676));
    }
}
