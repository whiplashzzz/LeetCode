/**
 * 给定一个整数数组，你需要寻找一个连续的子数组，如果对这个子数组进行升序排序，那么整个数组都会变为升序排序。
 *
 * 你找到的子数组应是最短的，请输出它的长度。
 *
 * 示例 1:
 *
 * 输入: [2, 6, 4, 8, 10, 9, 15]
 * 输出: 5
 * 解释: 你只需要对 [6, 4, 8, 10, 9] 进行升序排序，那么整个表都会变为升序排序。
 * 说明 :
 *
 * 输入的数组长度范围在 [1, 10,000]。
 * 输入的数组可能包含重复元素 ，所以升序的意思是<=。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shortest-unsorted-continuous-subarray
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Leetcode_581 {
    public static void main(String[] args){
        int[] nums = new int[]{2,6,4,8,10,9,15};
        System.out.println(Solution_581.findUnsortedSubarray(nums));
    }
}
class Solution_581 {
    //如果最右端的一部分已经排好序，这部分的每个数都比它左边的最大值要大，同理，如果最左端的一部分排好序，这每个数都比它右边的最小值小。
    //所以我们从左往右遍历，如果i位置上的数比它左边部分最大值小，则这个数肯定要排序，就这样找到右端不用排序的部分，
    //同理找到左端不用排序的部分，它们之间就是需要排序的部分.
    public static int findUnsortedSubarray(int[] nums) {
        int right = 0,left = nums.length-1,temp1 = nums[0],temp2 = nums[nums.length-1];
        if(nums.length <= 1) return 0;
        for(int i=0;i<nums.length;i++){
            temp1 = Math.max(temp1, nums[i]);
            temp2 = Math.min(temp2, nums[nums.length-1-i]);
            if(nums[i] < temp1) right = i;
            if(nums[nums.length-1-i] > temp2) left = nums.length-1-i;
        }
        return right > left ? right - left + 1 : 0;
    }
}
