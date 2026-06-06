package NQT.Questions;

public class TransposeOfMatrix24 {
    static void main() {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] transpose = new int[arr[0].length][arr.length];

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                transpose[j][i] = arr[i][j];
            }
        }

        for (int[] ints: transpose){
            for (int i: ints){
                System.out.print(i+", ");
            }
            System.out.println();
        }
    }
}
