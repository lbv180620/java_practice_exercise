import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] nums = { 20, 30, 10, 40, 50 };
        int tmp = 0;
        for (int s = 0; s < nums.length - 1; s++) {
            int min = s;
            for (int k = s + 1; k < nums.length; k++) {
                if (nums[min] > nums[k]) {
                    min = k;
                }
            }
            if (s != min) {
                tmp = nums[min];
                nums[min] = nums[s];
                nums[s] = tmp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
