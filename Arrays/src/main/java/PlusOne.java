import java.util.Arrays;

/**
 *  加一
 */
public class PlusOne {
    public static int[] plusOne(int[] digits) {
//        for (int i = digits.length-1; i >=0 ; i--) {
//            if (digits[i]==9){
//                digits[i]=0;
//                if (i==0){
//                    digits=new int[digits.length+1];
//                    digits[0]=1;
//                    return digits;
//                }
//            }else {
//                digits[i]++;
//                return digits;
//            }
//        }
        for (int i = digits.length-1; i >=0 ; i--) {
            digits[i]++;
            digits[i]%=10;
            if (digits[i]!=0){
                return digits;
            }
        }
        digits=new int[digits.length+1];
        digits[0]=1;
        return digits;
    }

    public static void main(String[] args) {
        int[] digits = {1,2,9};
        Arrays.stream(PlusOne.plusOne(digits)).forEach(i->{
            System.out.printf(String.valueOf(i));
        });
    }
}
