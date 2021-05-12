import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和
 */
public class TwoSum {
    public static int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i])){
                return new int[]{map.get(target-nums[i]),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two solution");
    }

    public static void main(String[] args) {
        int[] nums={3,2,4};
        int target=6;
        Arrays.stream(twoSum(nums, target)).forEach(i->{
            System.out.println(i);
        });
    }
}
