package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class BinaryTreeInorderTraversal {

    public static void main(String[] args) {
        // Example usage:
        // Example 1: Input: root = [1,null,2,3] Output: [1,3,2]
        TreeNode root1 = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));

        System.out.println(inorderTraversal(root1));

        // Example 2: Input: root = [] Output: []
        TreeNode root2 = null;
        System.out.println(inorderTraversal(root2));

        // Example 3: Input: root = [1] Output: [1]
        TreeNode root3 = new TreeNode(1);
        System.out.println(inorderTraversal(root3));

        //Example 4 : Input : root = [47,21,18,27,76,52,82]
        TreeNode root4 = new TreeNode(47,
                new TreeNode(21, new TreeNode(18), new TreeNode(27)),
                new TreeNode(76, new TreeNode(52), new TreeNode(82)));
        System.out.println(inorderTraversal(root4));
    }

    private static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderTraversalRecursive(root, result);
        return result;
    }

    private static void inorderTraversalRecursive(TreeNode node, List<Integer> result) {
        if (node != null) {
            inorderTraversalRecursive(node.left, result);
            result.add(node.val);
            inorderTraversalRecursive(node.right, result);
        }
    }
}
