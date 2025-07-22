
// Time Complexity: O(h), where h = height of BST
// Space Complexity: O(h) due to recursive stack

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) return root;
        if (val < root.val)
            return searchBST(root.left, val);
        else
            return searchBST(root.right, val);
    }
}
