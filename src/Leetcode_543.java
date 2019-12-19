/**
 * 给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过根结点。
 *
 * 示例 :
 * 给定二叉树
 *
 *           1
 *          / \
 *         2   3
 *        / \
 *       4   5
 * 返回 3, 它的长度是路径 [4,2,1,3] 或者 [5,2,1,3]。
 *
 * 注意：两结点之间的路径长度是以它们之间边的数目表示。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/diameter-of-binary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */


public class Leetcode_543 {
}

class Solution_543 {
    ////遍历每一个节点,求出此节点作为根的树的深度,那么,左子树深度加右子树深度的最大值即是答案
    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        if (root != null) {
            maxSize(root);
            return max;
        }
        return 0;
    }

    public int maxSize(TreeNode root){
        if(root != null){
            int left = maxSize(root.left);
            int right = maxSize(root.right);
            if(max < left + right) max = left + right;
            return Math.max(left,right) + 1;
        }
        return 0;
    }
}