import java.util.HashSet;
import java.util.Set;

public class twoSum {
    public int[] woSum(int[] nums, int target) {
        Set<Integer> set = new HashSet<>();

        for(int i = 0;i < nums.length; i++){
            int needed = target - nums[i];

            if(set.contains(needed)){
                for(int j = 0;j <= i;j++){
                    if(nums[j] == needed){
                        return new int[]{j,i};
                    }
                }
            }

            set.add(nums[i]);
        }

        return new int[]{};
    }
}
