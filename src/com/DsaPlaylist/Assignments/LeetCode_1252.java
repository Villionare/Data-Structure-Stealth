package com.DsaPlaylist.Assignments;

public class LeetCode_1252 {

    public static int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];
        int oddCount = 0;

        //initialisation
//        for(int i = 0; i < arr.length; i++){
//            for(int j = 0; j < arr[i].length; j++){
//                arr[i][j] = 0;
//            }
//        }

        for(int i = 0; i < indices.length; i++){

                int row = indices[i][0];
                int col = indices[i][1];

                changeArr(arr,row,true);


                changeArr(arr,col,false);


//            }
        }


        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j]%2 != 0){
                    oddCount++;
                }
            }
        }

        return oddCount;
    }

    public static void changeArr(int[][] arr, int value, boolean row){

        if (row){
          for (int i = 0; i<arr[value].length; i++){
              arr[value][i] += 1;
          }
        }else{
            for (int j = 0; j<arr.length; j++){
                arr[j][value] += 1;
            }
        }
    }


    public static void main(String[] args) {
        int[][] indices = {
                {17, 16},
                {26, 31},
                {19, 12},
                {22, 24},
                {17, 28},
                {23, 21},
                {27, 32},
                {23, 27},
                {23, 33},
                {18, 7},
                {4, 20},
                {0, 31},
                {25, 33},
                {5, 22}
        };

        int m = 28, n = 38;

        System.out.println(oddCells(m, n , indices));

    }
}


//index 0 = row + value

//index 1 = colum + value