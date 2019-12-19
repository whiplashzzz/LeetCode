import java.util.ArrayList;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 *
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * 示例 1:
 *
 * 输入: [2,2,1]
 * 输出: 1
 * 示例 2:
 *
 * 输入: [4,1,2,1,2]
 * 输出: 4
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/single-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Leetcode_136 {
    public static void main(String[] args){
        System.out.println(Solution_136.singleNumber(new int[]{1,2,3,2,1}));
    }
}

class Solution_136 {
    //利用位运算的三个特征：0与一个数做异或操作还是本身，本身与本身做异或操作为0，异或操作还满足交换率。
    public static int singleNumber(int[] nums) {
        int ans = nums[0];
        for(int n=1;n<nums.length;n++){
            ans = ans ^nums[n];
        }
        return ans;
    }
}

