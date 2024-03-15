package thelastofus;

public class TwoSum {
    public int[] twoSum(int[] nums,int target){
        boolean ans = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length-1; j > 0; j--) {
                ans = nums[i] + nums[j] == target;
                if (ans && i!=j){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
}
