class Solution {
    List<Integer> arr = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            arr.add(root.val);
            inorderTraversal(root.right);
        }
        return arr;
    }
}

/*
Time Complexity: O(n)
- Each of the n nodes in the binary tree is visited exactly once.

Space Complexity: O(n)
- In the worst case (skewed tree), recursion stack can go up to n.
- The result list also stores n elements.
*/
