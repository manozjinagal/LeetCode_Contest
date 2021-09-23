/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> res = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) 
        {
            if(res.containsKey(target-nums[i]))
            {
                return new int[]{i,res.get(target-nums[i])};
            }
            else{
                res.put(nums[i],i);
            }
        }
        return new int[]{};


        /*
        for(int i = 0; i < nums.length; i++) 
        {
            for(int j = i+1; j < nums.length; j++)
            {
                if(nums[j]+nums[i] == target)
                {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0};
        */
    }
}
// @lc code=end

