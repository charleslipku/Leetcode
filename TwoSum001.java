import java.util.Arrays;

public class TwoSum001 {
    public int[] twoSum(int[] nums, int target) {
        for (int i=0; i<= nums.length; i++){
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j]==target)
                    return new int[] {i,j};
            }
        }
        throw new IllegalArgumentException("No solution");
    }

    public static void main(String[] args){
        int[] nums= new int[]{2,7,11,15};
        int target = 9;
        TwoSum001 test = new TwoSum001();
        System.out.println(Arrays.toString(test.twoSum(nums, target)));
    }
}