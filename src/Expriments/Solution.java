package Expriments;


class Solution {
    public static void main(String[] args) {
        int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
        Solution obj = new Solution();
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