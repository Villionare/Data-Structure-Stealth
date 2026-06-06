package NQT.Questions;

public class AddTwoMetrics23 {
    static void main() {

        int[][] first_matrix = {
                {1,3,8,54,5,6,7},
                {1,3,8,54,5,6,7},
                {1,3,8,54,5,6,7},
                {1,3,8,54,5,6,7},
                {1,3,8,54,5,6,7},
                {1,3,8,54,5,6,7},
                {1,3,8,54,5,6,7},
        };

        int[][] second_matrix = {
                {55,6,7,8,92,4,5},
                {55,6,7,8,92,4,5},
                {55,6,7,8,92,4,5},
                {55,6,7,8,92,4,5},
                {55,6,7,8,91,4,5},
                {55,6,7,8,92,4,5},
                {55,6,7,8,92,4,5},
        };

        int[][] resultant = new int[7][7];

        for (int i=0; i<first_matrix.length; i++){
            for (int j=0; j<first_matrix[0].length; j++){
                resultant[i][j] = first_matrix[i][j] + second_matrix[i][j];
            }
        }

        for(int[] i: resultant){
            for(int j: i){
                System.out.print(j + ",");
            }
            System.out.println("\n");
        }
    }
}