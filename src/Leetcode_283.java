/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 示例:
 *
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 *
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/move-zeroes
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Leetcode_283 {
    public static void main(String[] args){
        int[] nums = {0,1,0,3,12};
        Solution_283.moveZeroes(nums);
    }
}

class Solution_283 {
    public static void moveZeroes(int[] nums) {
        //思路：设置一个index，表示非0数的个数，循环遍历数组，
        // 如果不是0，将非0值移动到第index位置,然后index + 1
        //遍历结束之后，index值表示为非0的个数，再次遍历，从index位置后的位置此时都应该为0
        if (nums == null || nums.length <= 1) {
            return;
        }
        int temp = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[temp] = nums[i];
                temp++;
            }
        }
        for(int i=temp;i<nums.length;i++){
            nums[i] = 0;
        }
    }
}
