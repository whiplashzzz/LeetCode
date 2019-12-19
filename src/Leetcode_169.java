/**
 * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在众数。
 *
 * 示例 1:
 *
 * 输入: [3,2,3]
 * 输出: 3
 * 示例 2:
 *
 * 输入: [2,2,1,1,1,2,2]
 * 输出: 2
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/majority-element
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Leetcode_169 {
    public static void main(String[] args){
        System.out.println(Solution_169.majorityElement(new int[]{1,2,5,5,5,5,6,6,6,6,6,6,6}));
    }
}

class Solution_169{
    //暴力法：暴力算法遍历整个数组，然后用另一重循环统计每个数字出现的次数。将出现次数比其他数字加起来出现次数还多的元素返回;
//    public static int majorityElement(int[] nums) {
//        int major = nums.length/2;
//        for(int i=0;i<nums.length;i++){
//            int count = 0;
//            for(int n=0;n<nums.length;n++){
//                if(nums[n] == nums[i])count++;
//            }
//            if(count > major) return nums[i];
//        }
//        return nums[0];

    //投票法：从第一个数开始count=1，遇到相同的就加1，遇到不同的就减1，减到0就重新换个数开始计数。
    public static int majorityElement(int[] nums) {
        int ret = nums[0];
        int count = 1;
        for(int num : nums) {
            if(num != ret) {
                count--;
                if(count == 0) {
                    count = 1;
                    ret = num;
                }
            }
            else
                count++;
        }
        return ret;
    }
}
