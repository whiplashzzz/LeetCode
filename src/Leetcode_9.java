/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */

public class Leetcode_9 {
    public static void main(String[]args){
        int i = 17881;
        int j =4132314;
        int k = -231;
        Solution_9.isPalindrome(j);
        System.out.println(Solution_9.isPalindrome(i));
        System.out.println(Solution_9.isPalindrome(j));
        System.out.println(j);
        System.out.println(Solution_9.isPalindrome(k));
    }
}

class Solution_9 {//反转该数然后和原数比较是否相等，相等的话即为回文数。
    public static boolean isPalindrome(int x) {
        int last,temp = x;
        int answer = 0;
        if(temp >= 0) {
            while (temp != 0) {
                last = temp % 10;
                temp = temp / 10;
                answer = answer * 10 + last;
            }
            if (answer == x) {
                return true;
            } else
                return false;
        }
        else
            return false;
    }
}
