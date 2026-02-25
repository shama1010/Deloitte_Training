import java.util.Arrays;

public class SortZeroesOnes {
    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 0, 0, 1};
        System.out.println(Arrays.toString(sortZeroesOnes(nums)));
    }

    public static int[] sortZeroesOnes(int[] nums) {
        int n = nums.length;
        int Ones = 0, Zeroes = 0;
        for(int i = 0; i < n; i++) {
            if(nums[i] == 0)
                Zeroes++;
            else if(nums[i] == 1)
                Ones++;
        }
        int[] result = new int[n];
        for(int i = 0; i < Zeroes; i++) {
            result[i] = 0;
        }
        for(int i = Zeroes; i < n; i++) {
            result[i] = 1;
        }
        return result;
    }
}
