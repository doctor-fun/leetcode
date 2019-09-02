import java.util.HashMap;

/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */
class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> tracker = new HashMap<Integer, Integer>();
        int len = nums.length;
        for(int i = 0; i < len; i++){
            if(tracker.containsKey(nums[i])){
                int left = tracker.get(nums[i]);
                return new int[]{left, i};
            }else{
                tracker.put(target - nums[i], i);
            }
        }
        return new int[2];
    }
}
class Main{
 //从头开始遍历，得到这个数等待的数key（sum-num[i]），存到map当中，(key,value=i),如果后面出现了key值，即匹配 ,输出即可 
    public static void main(String[] args){
        Solution1 solution=new Solution1();
        int[] nums= {3,4,7,8};
        int[] result=solution.twoSum(nums, 12);
        System.out.println(result.toString());    

    }
}


