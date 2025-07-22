class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderHelper(root, result);
        return result;
    }

    private void preorderHelper(TreeNode node, List<Integer> result) {
        if (node == null) return;
        result.add(node.val);
        preorderHelper(node.left, result);
        preorderHelper(node.right, result);
    }
}

/*
Time Complexity: O(n)
- Where n is the number of nodes in the binary tree.
- Each node is visited exactly once in the preorder traversal.

Space Complexity: O(n)
- In the worst case (skewed tree), recursion stack can go up to n.
- Plus the result list stores n values.
*/
