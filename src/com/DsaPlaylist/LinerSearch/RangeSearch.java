package com.DsaPlaylist.LinerSearch;

public class RangeSearch {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        int to_search = 3;
        //searching for 3 in range [1, 4]

        for (int i = 1; i<=4; i++){
            if (arr[i]==to_search){
                System.out.println("Found");
            }
        }
    }
}
