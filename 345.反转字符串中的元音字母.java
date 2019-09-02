import java.util.Arrays;
import java.util.HashSet;

/*
 * @lc app=leetcode.cn id=345 lang=java
 *
 * [345] 反转字符串中的元音字母。这里得确定一下原因
 */
class Solution {
    private final static HashSet<Character> vowels = new HashSet<>(
        Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        //题目意思是要找到两个元音字母进行替换
    public String reverseVowels(String s) {
        int i = 0, j = s.length() - 1;
        char[] result = new char[s.length()];
        while (i <= j) {
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            if (!vowels.contains(ci)) {//假如ci不是元音字母
                result[i++] = ci;//对结果数组赋值为ci，i++
            } else if (!vowels.contains(cj)) {
                result[j--] = cj;//假如cj不是元音字母，j--,对结果进行赋值为cj
            } else {
                result[i++] = cj;//对i位置赋值为cj
                result[j--] = ci;//j位置赋值为ci
            }
        }
        return new String(result);
        
    }
}
// class Main{
//     public static void main(String[] args){
//         Solution1 solution=new Solution1();
//         String s="hello";
//         String result=solution.reverseVowels(s);
//         System.out.println(result);    

//     }
// }

