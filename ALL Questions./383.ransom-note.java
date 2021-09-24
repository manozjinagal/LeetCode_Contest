/*
 * @lc app=leetcode id=383 lang=java
 *
 * [383] Ransom Note
 */

// @lc code=start
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] map = new int[26];

        for(char c : magazine.toCharArray()) map[c - 'a']++;

        for(char c : ransomNote.toCharArray()) {
            if(map[c - 'a'] == 0) return false;
            map[c - 'a']--;
        }

        return true;
    }
}
// @lc code=end

