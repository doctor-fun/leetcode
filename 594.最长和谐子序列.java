import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=594 lang=java
 *
 * [594] 最长和谐子序列
 */
class Solution {
    //用hashmap统计所有的数的频次，需要用的getOrDefault,然后遍历所有相差为1的组合的数的个数，如1和2,2和3，留一个max叫longest
    public int findLHS(int[] nums) {
     
       // getOrDefault
            //这个方法同样检查 Map 中的 Key，如果发现 Key 不存在或者对应的值是 null，
            //则返回第二个参数即默认值。要注意，这个默认值不会放入 Map
            Map<Integer, Integer> countForNum = new HashMap<>();
            for (int num : nums) {
                countForNum.put(num, countForNum.getOrDefault(num, 0) + 1);//没有就value=0+1=1,有旧value+1//看来是数这个数的个数的
            }
            int longest = 0;
            for (int num : countForNum.keySet()) {
                if (countForNum.containsKey(num + 1)) {
                    longest = Math.max(longest, countForNum.get(num + 1) + countForNum.get(num));
                }
            }
            return longest;
        }
    
// }
// class Main{
//     public static void main(String[] args){
//     Solution solution=new Solution();
//     int[] nums={1,3,2,2,5,2,3,7};
//     int result=solution.findLHS(nums);
//     System.out.println(result);   
// }
}


