/**
 * 给定两个二叉树，编写一个函数来检验它们是否相同。
 *
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 */

public class Leetcode_100 {
}


class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}

class Solution_100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {//用递归遍历判断，注意判断时要先判断p,q是否为空再判断是否相等。
        if(p == null && q == null)return true;
        if( p != null && q != null && p.val == q.val ){
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }
        return false;
    }
}
