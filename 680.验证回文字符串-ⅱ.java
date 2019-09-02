/*
 * @lc app=leetcode.cn id=680 lang=java
 *
 * [680] 验证回文字符串 Ⅱ
 */
//如果发现两个不等，那么要删掉这两个其中一个，判断剩下的字串是否符合回文，如果符合说明可以
class Solution {
    public boolean validPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return isPalindrome(s, i, j - 1) || isPalindrome(s, i + 1, j);
            }
        }
        return true;
    }
    
    private boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
}
// class Main{
//     public static void main(String[] args){
//         Solution1 solution=new Solution1();
//         String s="abbcba";
//         boolean result=solution.validPalindrome(s);
//         System.out.println(result);    

//     }
// }

