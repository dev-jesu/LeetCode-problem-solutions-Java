
// Time Complexity: O(h), where h = height of BST
// Space Complexity: O(1) iterative approach

class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode newNode = new TreeNode(val);
        if (root == null) {
            return newNode;
        }
        TreeNode tptr = root;

        while (tptr != null) {
            if (tptr.val > val) {
                if (tptr.left == null) {
                    tptr.left = newNode;
                    break;
                }
                tptr = tptr.left;
            } else {
                if (tptr.right == null) {
                    tptr.right = newNode;
                    break;
                }
                tptr = tptr.right;
            }
        }
        return root;
    }
}
