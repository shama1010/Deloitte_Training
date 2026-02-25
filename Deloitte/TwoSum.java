
import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = {-1, -1};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int required = target - nums[i];
            if(map.containsKey(required)) {
                result[0] = map.get(required);
                result[1] = i;
                return result; 
            }
            map.put(nums[i], i);
        }return result;
    }
}
