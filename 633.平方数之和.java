/*
 * @lc app=leetcode.cn id=6
 * 3 lang=java
 *
 * [633] 平方数之和
 */
class Solution {
    //法1
    // //如果存在a,b,使得a^2+b^2=c,那么a,b 必小于c.sqrt,所以只要从0~c.sqrt开始搜起即可，c-i*i，如果是整数就可以了
    // public boolean judgeSquareSum(int c) {
    //     int num_sqrt=(int)Math.sqrt(c);
    //     for(int i = 0 ;i<num_sqrt;i++){
    //         double b_ =Math.sqrt(c-i*i) ;
    //         if((b_-(int)b_)==0)
    //         return true;
    //     }
    //     return false;
    // }
    public boolean judgeSquareSum(int c) {
        int i = 0, j = (int) Math.sqrt(c);
        while (i <= j) {
            int powSum = i * i + j * j;
            if (powSum == c) {
                return true;
            } else if (powSum > c) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}
// class Main{

//     public static void main(String[] args){
//         Solution solution=new Solution();
//         int a =19;
//         boolean result=solution.judgeSquareSum(a);
//         System.out.println(result);    

//     }
// }

