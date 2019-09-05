import com.sun.org.apache.xalan.internal.xsltc.dom.ExtendedSAX;

/*
 * @lc app=leetcode.cn id=647 lang=java
 *
 * [647] 回文子串
 */
class Solution {
//     我们可不可以这样想，在遍历字符串的时候，考虑一下对每个字符进行左右扩展？（比如aaa，对中间的a进行左右扩展得到aaa）这样的话，就不需要再找子字符串再进行判断了，我们只需在遍历的时候，对每个字符的左方和右方的字符进行判断，如果相同就继续往两侧扩展直到一方到达该字符串的边界；如果不同，则直接结束循环，这样时间复杂度就有效地变成O(n^2)了。 
// 但其实上面这样做的话只考虑到了字符串长度为奇数的情况，偶数的情况没有考虑（比如aa）。但其实做法跟上面完全相同，这里我就不再细述了。两种情况相加，就是最后的结果。
//注意要同时扩
    private int cnt =0;
    public int countSubstrings(String s) {
        for(int i=0;i<s.length();i++){
            extendSubstrings(s,i,i);//奇数
            extendSubstrings(s,i,i+1);//偶数
        }
        return cnt;
    }
    private void extendSubstrings(String s ,int start ,int end){
        while(start>=0 && end < s.length() && s.charAt(start)==s.charAt(end)){
            start --;
            end++;
            cnt++;
        }
    }
}

