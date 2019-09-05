/*
 * @lc app=leetcode.cn id=242 lang=java
 *
 * [242] 有效的字母异位词
 */
class Solution {
    //用到的字符串的方法是s.tocharArray
    public boolean isAnagram(String s, String t) {
        int[] cnts = new int[26];
        for(char c: s.toCharArray()){
            cnts[c-'a']++;
        }
        for(char c : t.toCharArray()){
            cnts[c-'a']--;
        
        }
            for(int cnt:cnts){
                if(cnt!=0){
                    return false;
                }
            }  
            return true;     
    }
}

