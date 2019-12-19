/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Leetcode_1 {
    public static void main(String[] args){
        int[] nums = {2,7,11,5};
        int target = 9;
        int[] answer = new int[2];
        answer = Solution_1.twoSum(nums,target);
        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }
}

class Solution_1 {//该方法时间复杂度o(n^2),待改进。
    public static int[] twoSum(int[] nums, int target) {
        int i,j;
        int[] sum = new int[2];
        for(i = 0;i < nums.length-1;i++){
            for(j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    sum[0] = i;
                    sum[1] = j;
                }
            }
        }
        return sum;
    }
}