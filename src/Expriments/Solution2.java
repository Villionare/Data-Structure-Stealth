package Expriments;

public class Solution2 {

    public static void main(String[] args) {
        int nums = {}
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
