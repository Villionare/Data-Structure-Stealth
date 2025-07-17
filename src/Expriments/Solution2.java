package Expriments;

public class Solution2 {

    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,5,5,6,6};
        System.out.println(singleNonDuplicate(nums));
    }
        public static int singleNonDuplicate(int[] nums) {

            for (int num : nums) {
                int count = 0;
                for (int i : nums) {
                    if (i == num) {
                        count++;
                    }
                }

                if (count == 1) {
                    return num;
                }
            }

            return -1;
        }
}
