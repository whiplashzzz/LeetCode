/**
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 */


public class Leetcode_21 {
    public static void main(String[] args){
        ListNode l1 = new ListNode(-5);
        ListNode l2 = new ListNode(0);
        ListNode cur1 = new ListNode(0);
        ListNode cur2 = new ListNode(0);
        cur1.next = l1;
        cur2.next = l2;
        l1.val = -5;
        l2.val = 0;
        for(int i=0;i <=5;i++){
            l1.next = new ListNode(l1.val+3);
            l1 = l1.next;
            l2.next = new ListNode(l2.val+1);
            l2 = l2.next;
            System.out.println("l1:"+l1.val);
            System.out.println("l2:"+l2.val);
        }
        Solution_21.mergeTwoLists(l1, l2);

}
}

class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
}

class Solution_21{//利用分治法的合并,注意设置虚拟头结点及各链表头节点的位置。
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode dummyHead = new ListNode(0);
        ListNode temp = dummyHead;
        while(l1 != null && l2 != null){
            if(l1.val >= l2.val){
                temp.next = l2;
                l2 = l2.next;
                temp = temp.next;
            }
            else if(l1.val < l2.val){
                temp.next = l1;
                l1 = l1.next;
                temp = temp.next;
            }
        }
//        if(l1.next != null){
//            temp = l1.next;
//            temp = temp.next;
//        }
//        if(l2.next != null){
//            temp = l2.next;
//            temp = temp.next;
//        }
        if(l1 != null){
            temp.next = l1;
        }
        if(l2 != null){
            temp.next = l2;
        }
        return dummyHead.next;
    }
}
