package thelastofus;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums,int target){
        //nums = [2,7,11,15], target = 9
        Map<Integer,Integer> num_map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            //9-2=7
            int complement = target - nums[i];
            if(num_map.containsKey(complement)){
                return new int[] {num_map.get(complement),i};
            }
            num_map.put(nums[i],i);
        }
        return null;
    }
}
