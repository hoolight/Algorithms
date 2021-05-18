import java.util.Arrays;

/**
 * 颜色分类
 */
public class SortColors {
    public static void sortColors(int[] nums) {
        int p0=0,p1=0;
        for (int i = 0; i < nums.length; i++) {
            int t = nums[i];
            nums[i] = 2;
            if (t<2){
                nums[p1++] = 1;
            }
            if (t<1){
                nums[p0++] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums={0};
        SortColors.sortColors(nums);
        Arrays.stream(nums).forEach(i->System.out.printf(i+","));
    }
}
