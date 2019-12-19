/**
 * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
 *
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
 *
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 *
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 * 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/roman-to-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Leetcode_13 {
    public static void main(String[] args){
        System.out.println(Solution_13.romanToInt("IV"));
    }
}

class Solution_13 {//先将字符串转化为字符数组遍历，按要求将罗马数字依次相加，若遇特殊情况再通过条件判断特殊处理。注意遇到特殊情况时，要一次挪两位。
    public static int romanToInt(String s) {
        char[] chArray = s.toCharArray();
        int i = 0,n;
        for(char c : chArray) {
            switch (c) {
                case 'I':
                    i += 1;
                    break;
                case 'V':
                    i += 5;
                    break;
                case 'X':
                    i += 10;
                    break;
                case 'L':
                    i += 50;
                    break;
                case 'C':
                    i += 100;
                    break;
                case 'D':
                    i += 500;
                    break;
                case 'M':
                    i += 1000;
                    break;
                default:
                    break;
            }
        }
            for(n=1;n<=chArray.length-1;n++){//遇到特殊情况时，不应加，反应减，同时挪动两位，防止减两次。
                if((chArray[n] == 'V'||chArray[n] == 'X') && chArray[n-1] == 'I'){
                    i -= 2;
                    n++;
                    continue;
                }
                if((chArray[n] == 'L'||chArray[n] == 'C') && chArray[n-1] == 'X'){
                    i -= 20;
                    n++;
                    continue;
                }
                if((chArray[n] == 'D'||chArray[n] == 'M') && chArray[n-1] == 'C'){
                    i -= 200;
                    n++;
                    continue;
                }
            }
        return i;
    }
}
