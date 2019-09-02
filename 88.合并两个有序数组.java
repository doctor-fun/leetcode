import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=88 lang=java
 *
 * [88] 合并两个有序数组
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //指针1指向数组1（非零）的尾
        //指针2指向数组2（非零）的尾
        //指针3指向非零n+m-1的尾，
        //往前扫，不断往里面填东西，有小于零的，就拿另外一个赋值，赋过值下标就减1
        //终止条件是两个指针1,2都<0
        int index1 = m - 1, index2 = n - 1;
        int indexMerge = m + n - 1;
        while (index1 >= 0 || index2 >= 0) {
            if (index1 < 0) {
                nums1[indexMerge--] = nums2[index2--];
            } else if (index2 < 0) {
                nums1[indexMerge--] = nums1[index1--];
            } else if (nums1[index1] > nums2[index2]) {
                nums1[indexMerge--] = nums1[index1--];
            } else {
                nums1[indexMerge--] = nums2[index2--];
            }
        }
    }
}
// class Main{
//     public static void main(String[] args){
//         Solution1 solution=new Solution1();
//         int[] nums1 = {1,2,3,0,0,0};
//         int  m = 3;
//         int[] nums2 = {2,5,6};
//         int  n= 3;
//         solution.merge(nums1,m,nums2,n);
//         System.out.println(Arrays.toString(nums1));    

//     }
// }

