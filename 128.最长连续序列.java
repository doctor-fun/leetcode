import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode.cn id=128 lang=java
 *
 * [128] 最长连续序列
 */
//找到连续数的下边界，然后从下边界开始网上遍历，
class Solution1 {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Integer> countMap=new HashMap<>();
        for(int num : nums){
            if(!countMap.containsKey(num)){
                countMap.put(num,0);
            }
        }
        int max=0;
        for(int num:nums){
            int left =findtheleft(countMap,num);
            for(int item=left;item)
                
            
        }
        
    }
    private int findtheleft(Map<Integer,Integer> countmap,int num){
        while(countmap.containsKey(num-1)){
            num=num-1;
        }
        return num;

    }
}
class Main{
    public static void main(String[] args){
        Solution1 solution = new Solution1();
        int[] nums={100, 4, 200, 1, 3, 2};
        int result= solution.longestConsecutive(nums);
        System.out.println(result);
    }
}
