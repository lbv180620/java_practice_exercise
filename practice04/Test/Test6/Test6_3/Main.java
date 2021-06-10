import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] nums = { 20, 50, 30, 10, 40 };
        int tmp = 0;
        for (int s = 1; s < nums.length; s++) {
            tmp = nums[s];
            int k = 0;
            for (k = s - 1; k >= 0 && nums[k] < tmp; k--) {
                nums[k + 1] = nums[k];
            }
            nums[k + 1] = tmp;
        }
        System.out.println(Arrays.toString(nums));
    }
}

// 50k 40 30 20 10s : 40
//
// s=1 2 3 4 5
// k=0 -1 1 0 2 3 2 1 0
