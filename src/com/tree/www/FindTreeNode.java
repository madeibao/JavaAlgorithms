package com.tree.www;

/**
 * @ClassName FindTreeNode
 * @Author：Mayuan
 * @Date 2020/2/21 11:33
 * @Description TODO
 * @Version 1.0
 * <p>
 * 在二叉树中查找一个给定的节点内容。
 * 返沪依照该节点为根节点的内容的子树。
 * <p>
 * 给定二叉搜索树（BST）的根节点和一个值。 你需要在BST中找到节点值等于给定值的节点。 返回以该节点为根的子树。 如果节点不存在，则返回 NULL。
 * <p>
 * 例如，
 * <p>
 * 给定二叉搜索树:
 * <p>
 * 4
 * / \
 * 2   7
 * / \
 * 1   3
 * <p>
 * 和值: 2
 * 你应该返回如下子树:
 * <p>
 * 2
 * / \
 * 1   3
 * 在上述示例中，如果要找的值是 5，但因为没有节点值为 5，我们应该返回 NULL。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/search-in-a-binary-search-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class FindTreeNode {

    public static TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }
        return root.val > val ? searchBST(root.left, val) : searchBST(root.right, val);
    }

    private static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode l2 = new TreeNode(2);
        TreeNode r2 = new TreeNode(7);
        TreeNode ll3 = new TreeNode(1);
        TreeNode lr3 = new TreeNode(3);


        root.left = l2;
        root.right = r2;
        l2.left = ll3;
        l2.right = lr3;

        int value = 2;

        TreeNode root3 = searchBST(root, value);
        preOrder(root3);

    }
}





