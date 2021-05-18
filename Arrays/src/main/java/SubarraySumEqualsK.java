import java.util.HashMap;
import java.util.Map;

/**
 *和为K的子数组
 */
public class SubarraySumEqualsK {
    public static int subarraySum(int[] nums, int k) {
        int count=0,pre=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for (int i = 0; i < nums.length; i++) {
            pre+=nums[i];
            if (map.containsKey(pre-k)){
                count+=map.get(pre-k);
            }
            map.put(pre,map.getOrDefault(pre,0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums={1,1,1};
        int k=2;
        System.out.println(SubarraySumEqualsK.subarraySum(nums, k));
    }
}
