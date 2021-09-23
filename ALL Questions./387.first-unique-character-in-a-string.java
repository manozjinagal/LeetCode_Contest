/*
 * @lc app=leetcode id=387 lang=java
 *
 * [387] First Unique Character in a String
 */

// @lc code=start
class Solution {
    public int firstUniqChar(String s) {
        int len=s.length();
        if(len==1)
            return 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.substring(0,i).contains(Character.toString(s.charAt(i))) || s.substring(i+1,s.length()).contains(Character.toString(s.charAt(i))))
            {
                continue;
            }
            else{
                return i;
            }
        }       
        return -1;
    }
}
// @lc code=end

