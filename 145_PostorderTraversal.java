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
- Each of the n nodes is visited exactly once during the traversal.

Space Complexity: O(n)
- Recursion stack can go up to n in the worst case (completely unbalanced tree).
- Additionally, the result list stores n node values.
*/
