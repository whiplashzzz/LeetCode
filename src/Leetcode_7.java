/**
 *给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转
 * 注意:
 *
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Leetcode_7 {
    public static void main(String[] args){
        System.out.println(Solution_7.reverse(123));
    }
}


class Solution_7 {//反转是通过每次除十求余数再将数组乘10加上余数的方式得到。
                // 重点在于设定反转后不能越界取值范围，是通过除十至倒数第二位，比较是否越过边界至倒数第二位。若相等，则再比较末位。
    public static int reverse(int x){
            int i = x % 10;
            int answer = 0;
                while (x != 0) {
                    if (answer>Integer.MAX_VALUE/10 || (answer == Integer.MAX_VALUE/10&&i>7)) return 0;
                    if (answer<Integer.MIN_VALUE/10 || (answer == Integer.MAX_VALUE/10&&i<-8)) return 0;
                    answer = answer * 10 + i;
                    x = x / 10;
                    i = x % 10;

                }
                return answer;
    }
}