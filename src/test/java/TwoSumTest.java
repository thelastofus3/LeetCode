import org.junit.jupiter.api.Test;
import thelastofus.TwoSum;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTest {
    @Test
    public void twoSumExample1(){
        TwoSum solution = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }
    @Test
    public void twoSumExample2(){
        TwoSum solution = new TwoSum();
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }
    @Test
    public void twoSumExample3(){
        TwoSum solution = new TwoSum();
        int[] nums = {3,3};
        int target = 6;
        int[] expected = {0, 1};
        assertArrayEquals(expected, solution.twoSum(nums, target));
    }
}
