package com.DsaPlaylist.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Max {

    public static void main(String[] args) {
        int[] list = new int[6];

        list[0]=4;
        list[1]=54;
        list[2]=32;
        list[3]=87;
        list[4]=45;
        list[5]=99;

        System.out.println(max(list));
        System.out.println(Arrays.toString(list));
        System.out.println(Arrays.toString(reverse(list)));
    }

    //finding the maximum element in an array
    public static int max(int[] list){
        int max = list[0];

        for (int i = 0; i < list.length; i++){
            int element;

            if(list[i]>max){
                max = list[i];
            }
        }
            return max;
    }

    public static int[] reverse(int[] list){
        int start = 0;
        int end = list.length - 1;
        int temp;
        while (start<end){
            temp = list[start];
            
            list[start] = list[end];
            list[end] = temp;
            
            start++;
            end--;
        }
        return list;
    }
}
