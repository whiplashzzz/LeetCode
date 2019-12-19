/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-common-prefix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Leetcode_14 {
    public static void main(String args[]){
        String[] strs = new String[] {"flower","flow","flight"};
        System.out.println(Solution_14.longestCommonPrefix(strs));
    }
}

class Solution_14 {//先找出字符数最少的字符串，然后根据该字符串的字符数，用第一个字符串挨个字符依次遍历比较后面的字符串，满足条件则将该字符加入返回结果。
    public static String longestCommonPrefix(String[] strs) {
        int len = strs.length,n = 0,i;
        String str = "";
        if(strs.length == 0)return str;
        else {
            int temp = strs[0].length();
            for (String s : strs) {
                temp = Math.min(temp, s.length());
            }
            while (n < temp) {
                for (i = 1; i < len; i++) {
                    if (strs[0].charAt(n) != strs[i].charAt(n)) {
                        return str;
                    }
                }
                str += strs[0].charAt(n);
                n++;
            }
            return str;
        }
    }
}
