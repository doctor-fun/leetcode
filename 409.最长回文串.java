/*
 * @lc app=leetcode.cn id=409 lang=java
 *
 * [409] 最长回文串
 */
class Solution {
    public int longestPalindrome(String s) {
        int[] cnts=new int[256];
        for(char c: s.toCharArray()){
            cnts[c]++;
        } 
        int palindrome= 0;
        for(int cnt:cnts){
            palindrome += (cnt/2)*2;//将奇数剔除，选择偶数，1/2=0,(3/2)*2=2;(5/2)*2=4
            //相当于将cnt取出奇数，分成两半，再统计总个数，拿出偶数个字母
        }
        //还可以看情况再跳一个构成回文字串，如果等于的话说明没有字母被剩下
        if(palindrome<s.length()){
            palindrome++;
        }
        return palindrome;
        
    }
}

