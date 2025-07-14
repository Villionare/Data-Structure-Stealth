package com.DsaPlaylist.LinerSearch;

public class Question_LeetCode {
    public static void main(String[] args) {
        int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
        Question_LeetCode obj = new Question_LeetCode();
        System.out.println(obj.maximumWealth(accounts));
    }

    public int maximumWealth(int[][] accounts) {
        int sum=0;
        int max = 0;
        for(int i = 0; i < accounts.length; i++){
            for(int j = 0; j < accounts[i].length; j++){
                sum += accounts[i][j];
            }
            if(sum > max){
                max = sum;
                sum = 0;
            }
            sum = 0;
        }
        return max;
    }
}
