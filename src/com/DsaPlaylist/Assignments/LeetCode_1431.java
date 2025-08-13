package com.DsaPlaylist.Assignments;

import java.util.ArrayList;
import java.util.List;


public class LeetCode_1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int length = candies.length;
        List<Boolean> output = new ArrayList<>();

        for(int i = 0;i<length; i++){
            int check_max = candies[i] + extraCandies;
            boolean final_check = true;

            for(int j = 0; j<length; j++){

                if(j==i){
                    continue;
                }

                if(candies[j]>check_max){
                    final_check = false;
                }
            }

            if(!final_check){
                output.add(false);
            }else{
                output.add(true);
            }
        }
        return output;
    }

    //although it worked so i won't be putting running code main function here
}
