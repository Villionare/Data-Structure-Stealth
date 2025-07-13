package com.DsaPlaylist.ArrayList;

import java.util.Arrays;

public class reverseArray {

    public static void main(String[] args) {
        int[] list = new int[6];

        list[0]=4;
        list[1]=54;
        list[2]=32;
        list[3]=87;
        list[4]=45;
        list[5]=99;

        System.out.println(Arrays.toString(list));
        System.out.println(Arrays.toString(reverse(list)));
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
