import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 数组中重复的数字
 */
public class RepeatNumber {
    public static int findRepeatNumber(int[] nums) {
//        Set<Integer> set=new HashSet<>();
//        for (int num:nums) {
//            if (set.contains(num)){
//                return num;
//            }
//            set.add(num);
//        }
//        throw new IllegalArgumentException("No RepeatNumber");
        int i = 0;
        while (i<nums.length){
            if (nums[i]==i){
                i++;
                continue;
            }
            if (nums[i]==nums[nums[i]]){
                return nums[i];
            }
            int t = nums[i];
            nums[i]=nums[t];
            nums[t] = t;
        }
        throw new IllegalArgumentException("No RepeatNumber");
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        System.out.println(RepeatNumber.findRepeatNumber(nums));
    }
}
