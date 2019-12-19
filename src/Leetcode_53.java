/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 示例:
 *
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 * 进阶:
 *
 * 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-subarray
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Leetcode_53 {
    public static void main(String args[]){
        //待改进，可用分治法或动态规划
        int[] array = new int[]{3,-1,2,1,-9,-10,3};
        System.out.println(Solution_53.maxSubArray(array));
    }
}

class Solution_53 {
    public static int maxSubArray(int[] nums) {
        //两次循环遍历，从数组第一位开始，依次加上后面的数，若大于max_sum则将其代替。然后再返回从数组第二位开始，重复上述操作直到找到最大数。
/**
 * int max_sum = nums[0];
 *         for(int m = 0;m < nums.length;m++){
 *             int sum = 0;
 *             for(int n = m;n< nums.length;n++){
 *                 sum += nums[n];
 *                 if(sum > max_sum){
 *                     max_sum = sum;
 *                 }
 *             }
 *         }
 */
        //动态规划
        int max_sum = nums[0],sum = 0;
        for(int i=0;i<nums.length;i++){
            while(sum<0) sum = 0;
            sum += nums[i];
            if(sum>max_sum) max_sum = sum;
        }
        return max_sum;
    }
}
