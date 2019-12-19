import java.util.ArrayList;

/**
 * 请判断一个链表是否为回文链表。
 *
 * 示例 1:
 *
 * 输入: 1->2
 * 输出: false
 * 示例 2:
 *
 * 输入: 1->2->2->1
 * 输出: true
 * 进阶：
 * 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/palindrome-linked-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Leetcode_234 {
    public static void main(String args[]){
        ListNode head = new ListNode(-129);
        ListNode l = new ListNode(-129);
        head.next = l;
        System.out.println(Solution_234.isPalindrome(head));
    }
}

class Solution_234 {
    //用回文数那题的方法做即可。注意：Integer整型包装类-128到127之间的可以直接比较,不在这个范围内的数据用equals比较。
    public static boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        while(head != null){
            arr.add(head.val);
            head = head.next;
        }
        int front = 0,rear = arr.size() - 1;
        for(int i=0;i<arr.size()/2;i++){
            if(!arr.get(front++).equals(arr.get(rear--))) return false;
        }
        return true;
    }
}
