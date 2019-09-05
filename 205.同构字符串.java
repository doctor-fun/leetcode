

/*
 * @lc app=leetcode.cn id=205 lang=java
 *
 * [205] 同构字符串
 */
class Solution {
    //使用到的方法是charAt(i)
    //charAt()方法返回指定索引位置的char值
    //两个字符串的长度肯定是一致的
    public boolean isIsomorphic(String s, String t) {
        int[] preIndexOfS = new int[256];
        int[] preIndexOfT = new int[256];
        for (int i = 0; i < s.length(); i++) {
        char sc = s.charAt(i), tc = t.charAt(i);
        if (preIndexOfS[sc] != preIndexOfT[tc]) {//刚开始都是0，所以相等
            return false;
        }
        //同时刷新两个字母的在字符串中出现的位置，如果表示配对关系。没有同时刷新到老的位置，说明凉了
        preIndexOfS[sc] = i + 1;
        preIndexOfT[tc] = i + 1;
            }
    return true;
    }   
}
// class Main{
//     public static void main(String[] args) {
//         Solution1 solution1=new Solution1();
//         String s = "egg";
//         String t ="add";
//         boolean result= solution1.isIsomorphic(s, t);
//        System.out.println(result);
//     }
// }



