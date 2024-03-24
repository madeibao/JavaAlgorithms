package com.tree.www;

/**
 * @ClassName SortedTreeToNode
 * @Author：Mayuan
 * @Date 2021/1/1/0001 16:47
 * @Description TODO
 * @Version 1.0
 *
 * 搜索二叉树变成双向链表来实现，
 *方法一：中序遍历。这题乍一看感觉好难，又是树又是链表的，还是双向循环排序链表。其实真滴不难，且看分析。
 * 首先观察到题目给的是一棵 BST，这就意味着我们只需要用中序遍历就能实现排序的链表了。
 * 最终得到的链表的头节点必然是 BST 最左边的节点（题目示例中就是 1）；尾节点必然是 BST 最右边的节点（题目示例中就是 5）。
 * 我们先定义 *tail 和 *head，初始它们都是 nullptr，到最后则会一个指向尾节点一个指向头节点。
 * 所以我们中序遍历，首先 root 一直往左走，走到了最左边的 1 处，此时 tail 还是 nullptr，并且整个遍历过程中只有这个时候 tail 会是 nullptr。这个时候我们让 head = root，也就找到了链表的头节点。
 * 然后我们更新 tail = root（也就是 1），root 会回溯到上一级也就是 2。这时我们就写 tail -> right = root; 和 root -> left = tail;。
 * 我们此时接着更新 tail = root（也就是 2）。如此往复。
 * 中序遍历走完之后，链表也就构造完了，除了 head 和 tail 之间的连接，我们再连接一下就好了（代码对应处有注释）。
 *
 * 作者：superkakayong
 * 链接：https://leetcode-cn.com/problems/er-cha-sou-suo-shu-yu-shuang-xiang-lian-biao-lcof/solution/zi-jie-ti-ku-jian-36-zhong-deng-er-cha-sou-suo-shu/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 *
 **/

public class SortedTreeToNode {

    /** 增加了两个前后两个指针节点的值。*/
    TreeNode head,tail;
    public TreeNode treeToDoublyList(TreeNode root) {
        if(root==null) {
            return null;
        }
        
        inorder(root);
        head.left = tail;
        tail.right = head;
        return head;
    }

    public void inorder(TreeNode root) {
        if(root==null) {
            return;
        }
        // 一直向左面来递归查询。
        inorder(root.left);

        if(tail==null) {
            // 当tail还不存在，也就是root此时在整个BST的最左边的节点，这个节点就是head
            head = root;
        }

        else {
            // root 回溯到上面。
            tail.right = root;
            root.left = tail;
        }
        tail= root;
        inorder(root.right);
    }

    public void traverse(TreeNode root) {
        if(root==null) {
            return;
        }

        // 这里是根据条件设置的5,具体的二叉树要具体更改。
        int temp = 0;

        while (root!=null) {
            System.out.print(root.val+"->");
            temp+=1;
            if(temp==5) {
                break;
            }
            root = root.right;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(5);
        TreeNode n4 = new TreeNode(1);
        TreeNode n5 = new TreeNode(3);

        root.left = n2;
        root.right = n3;

        n2.left = n4;
        n2.right = n5;

        SortedTreeToNode ss = new SortedTreeToNode();
        ss.traverse(ss.treeToDoublyList(root));

    }
}
