import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] nums = { 30, 20, 40, 50, 10 };
        int tmp = 0;
        for (int s = nums.length - 1; s > 0; s--) {
            for (int k = 0; k < s; k++) {
                if (nums[k] > nums[k + 1]) {
                    tmp = nums[k];
                    nums[k] = nums[k + 1];
                    nums[k + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
