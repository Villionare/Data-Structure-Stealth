package NQT.Questions.Exercises;

import kotlin.contracts.Returns;

public class MyClass{
    public static void main(String[] args){

        int[][] arr1 = {{1,2},{1,2},{1,2}};
        int[][] arr2 = {{1,2},{1,2},{1,2}};

        int[][] result = new int[arr1.length][arr1[0].length];

        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[0].length;j++){
                result[i][j]=arr1[i][j] + arr2[i][j];
            }
        }


//printing the resultant array
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[0].length;j++){
                System.out.print(result[i][j]);
            }
            System.out.println();
        }

    }

}